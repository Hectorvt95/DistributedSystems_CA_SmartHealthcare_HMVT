/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.week6_lab;

import grpc.generated.RoomStatus.BedUpdate;
import grpc.generated.RoomStatus.RoomStatusGrpc.RoomStatusImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder; //this is from the stub, to generate an instance of StreamObserver
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import java.util.logging.Logger; 


/**
 *
 * @author marti
 */
public class RSServer extends RoomStatusImplBase{
    
    private static final Logger logger = Logger.getLogger(RKCServer.class.getName());
    
    public static void main(String[] args) {

            RSServer Serviceserver = new RSServer();

            int port = 50054;

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
    public void streamBedStatus(grpc.generated.RoomStatus.StatusRequest request,
        StreamObserver<BedUpdate> responseObserver) {
        
        RoomStatus rs = new RoomStatus();
        
        List<RoomStatus.Room> roomStatus = rs.Status;
        Iterator i = roomStatus.iterator();
        //i will be a Room object

        while(i.hasNext()){
           
           RoomStatus.Room currentRoom = (RoomStatus.Room)i.next();
           
           int bed = currentRoom.getBedID();
           String name = currentRoom.getName();
           String status = currentRoom.getStatus();
           int patient = currentRoom.getPatient();
           int time = currentRoom.getTimestamp();
           
           BedUpdate update = BedUpdate.newBuilder()
                                .setBedId(bed)
                                .setName(name)
                                .setStatus(status)
                                .setPatientId(patient)
                                .setTimestamp(time)
                                .build();
           
           responseObserver.onNext(update);
        }
        
        responseObserver.onCompleted();
    }
   
}
    
    
    
    

