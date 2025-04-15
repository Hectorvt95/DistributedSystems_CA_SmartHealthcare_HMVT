
package distsys.week6_lab;

import grpc.generated.SmartMonitor.*;
import grpc.generated.SmartMonitor.SmartMonitorGrpc.SmartMonitorImplBase;
        
import io.grpc.Server;
import io.grpc.ServerBuilder; //this is from the stub, to generate an instance of StreamObserver
import io.grpc.stub.StreamObserver;
import java.io.IOException;

import java.util.logging.Logger; 

/**
 *
 * @author marti
 */

public class SMServer extends SmartMonitorImplBase{
    
    private static final Logger logger = Logger.getLogger(SMServer.class.getName());

    public static void main(String[] args) {
        
            SMServer Serviceserver = new SMServer();

            int port = 50053;

            try {
                Server server = ServerBuilder.forPort(port)
                        .addService(Serviceserver)
                        .intercept(new AuthorizationServerInterceptor())
                        .build()
                        .start();
                     logger.info("Server started, listening on " + port);

             System.out.println(" Server started, listening on " + port);		   
                     server.awaitTermination();


            } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();

            } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            } 

    }
    
    @Override
    public StreamObserver<PatientData> smartPatientMonitor(StreamObserver<Validation> responseObserver) {
    
        return new StreamObserver<PatientData>() {
            
            PatientData.Builder patientBuilder = PatientData.newBuilder();
            String patientName = "";

            @Override
            public void onNext(PatientData partialData) {
                // Merge partial data into a complete record
                if (!partialData.getPatientName().isEmpty()) {

                    patientName = partialData.getPatientName();
                    patientBuilder.setPatientName(patientName);
                }

                if (partialData.getRoomNumber() > 0) {
                    patientBuilder.setRoomNumber(partialData.getRoomNumber());
                }
                if (partialData.getTemperature() > 0) {
                    patientBuilder.setTemperature(partialData.getTemperature());
                }
                if (partialData.getBloodPressure() > 0) {
                    patientBuilder.setBloodPressure(partialData.getBloodPressure());
                }
                if (partialData.getElectRate()>0) {
                    patientBuilder.setElectRate(partialData.getElectRate());
                }
            }


            @Override
            public void onError(Throwable t) {     
            }

            @Override
            public void onCompleted() {
                // After client finishes sending, send final validation
                StringBuilder message = new StringBuilder();
                
                // Validate temperature (normal range: 36-37°C)
                if(patientBuilder.getTemperature() < 36 || patientBuilder.getTemperature() > 37){
                    
                    message.append ("Abnormal temperature of " + patientBuilder.getTemperature() + ". Alerting response team." + "\n");
                }
                
                //Validate blood pressure (normal < 140/90)
                if (patientBuilder.getBloodPressure() >= 12080 && patientBuilder.getBloodPressure() <= 14090){
                    
                    message.append ("The blood pressure of " + patientBuilder.getBloodPressure() + " bpm is high." + "\n");
                }
                
                if (patientBuilder.getBloodPressure() >= 14090){
                    
                    message.append ("Abnormal blood pressure of " + patientBuilder.getBloodPressure( )+ ". Alerting response team." + "\n");
                }
                
                // Validate heart rate (normal 60-100 bpm)
                if (patientBuilder.getElectRate() < 60 || patientBuilder.getElectRate() > 100){
                    
                    message.append ("Abnormal Heart Rate of " + patientBuilder.getElectRate() + " bpm. Alerting response team.");
  
                }
                String patientInfo = "Patient's Name: " + patientBuilder.getPatientName() +"\n"+ "Room: " + patientBuilder.getRoomNumber();
                
                String finalMessage = message.length() > 0 ? (patientInfo  + "\n " + "Alerts: \n" + message.toString()) : (patientInfo + "All readings for Temperature, Blood Pressure and Heart rate are normal ");
                

                Validation response = Validation.newBuilder()
                    .setMessage(finalMessage)
                    .build();
               
                
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
            
        };
       
    }
         
        
    
}
