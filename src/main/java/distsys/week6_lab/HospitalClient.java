/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package distsys.week6_lab;

import distsys.week6_lab.RoomStatus.Room;


import grpc.generated.PatientsRoomControl.PatientsRoomControlGrpc;
import grpc.generated.PatientsRoomControl.PatientsRoomControlGrpc.PatientsRoomControlBlockingStub;
import grpc.generated.PatientsRoomControl.*;

import grpc.generated.RoomKeyControls.RoomKeyControlsGrpc;
import grpc.generated.RoomKeyControls.RoomKeyControlsGrpc.RoomKeyControlsStub;
import grpc.generated.RoomKeyControls.*;

import grpc.generated.SmartMonitor.SmartMonitorGrpc;
import grpc.generated.SmartMonitor.SmartMonitorGrpc.SmartMonitorStub;
import grpc.generated.SmartMonitor.*;

import grpc.generated.RoomStatus.RoomStatusGrpc;
import grpc.generated.RoomStatus.RoomStatusGrpc.RoomStatusStub;
import grpc.generated.RoomStatus.*;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver; //this is from the stub, to generate an instance of StreamObserver
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import static jdk.internal.net.http.common.Log.channel;

/**
 *
 * @author marti
 */
public class HospitalClient {
    
    //Lets create the observer that is going to be looking after the different server stream methods
    private StreamObserver<RoomConditions> roomRequestObserver;
    private StreamObserver<PatientData> patientdataRequestObserver;
   
    //a blocking stub to make a synchronus call --> PatientsRoomControl - Unary
    private static PatientsRoomControlBlockingStub prc_syncStub;

    //a non blocking stub to make an asynchronus call --> RoomKeyControls - BI DI stream
    private static RoomKeyControlsStub rkc_asyncStub;

    //a non blocking stub to make an ascynchronus call --> SmartMonitor - Client streaming
    public static SmartMonitorStub sm_asyncStub;
    
    //a non blocking stub to make an ascynchronus call --> RoomStatus - Server Streaming
    public static RoomStatusStub rs_asyncStub;
    
    //lets initialize our hospital client class
    public HospitalClient(){
        
        String token = Jwts.builder()
                .setSubject("Hector Valle")
                .signWith(SignatureAlgorithm.HS256, "HectorValle-DS-CA@2024-Authorization")
                .compact();
        
        String host = "localhost";
        
        //STUB FOR PATIENTS ROOM CONTROL
        int prcserver = 50051;
        ManagedChannel channelPRC = ManagedChannelBuilder.
                        forAddress(host, prcserver)
                        .usePlaintext()
                        .build();
        prc_syncStub = PatientsRoomControlGrpc.newBlockingStub(channelPRC).withCallCredentials(new JwtCallCredentials(token)); //PRC
        
        //STUB FOR ROOM KEY CONTROLS
        int rkcserver = 50052;
        ManagedChannel channelRKC = ManagedChannelBuilder.
                        forAddress(host, rkcserver)
                        .usePlaintext()
                        .build();
        rkc_asyncStub = RoomKeyControlsGrpc.newStub(channelRKC).withCallCredentials(new JwtCallCredentials(token)); //RKC
        
        //STUB FOR SMART MONITOR
        int smserver = 50053;
        ManagedChannel channelSM = ManagedChannelBuilder.
                        forAddress(host, smserver)
                        .usePlaintext()
                        .build();
        sm_asyncStub = SmartMonitorGrpc.newStub(channelSM).withCallCredentials(new JwtCallCredentials(token)); //SM
        
        //STUB FOR ROOM STATUS
        int rsserver = 50054;
        ManagedChannel channelRS = ManagedChannelBuilder.
                        forAddress(host, rsserver)
                        .usePlaintext()
                        .build();
        rs_asyncStub = RoomStatusGrpc.newStub(channelRS).withCallCredentials(new JwtCallCredentials(token)); //RS
        
    }

  
    public static void main(String [] args) throws InterruptedException {
        
        HospitalClient hospitalClient = new HospitalClient();

        System.out.println("working");


    }
    
    //** UNARY - PATIENTS ROOM CONTROL
    public void requestPRC_lightControl(JTextArea textArea, int value){
        SwingUtilities.invokeLater(() -> textArea.append("Unary - PatientRoomControl - Lights Control." + "\n"));
        LightRequest request = LightRequest.newBuilder()
                .setLightRequest(value)    //this is going to be taken from the gui
                .build();
        LightResponse response =  prc_syncStub.lightControl(request);   
        SwingUtilities.invokeLater(() -> textArea.append("The value of the light been dimmed to " + value + "%." + "\n"));
        //System.out.println("The value of the light been dimmed to " + response.getLightResponse() + "%.");
    }
    
    
    public void requestPRC_bedHeight(JTextArea textArea, int value){
        SwingUtilities.invokeLater(() -> textArea.append("Unary - PatientRoomControl - Height Control." + "\n"));
        HeightRequest request = HeightRequest.newBuilder()
                .setHeightRequest(value)  //this is going to be taken from the gui
                .build();
        HeightResponse response = prc_syncStub.bedHeight(request);
        SwingUtilities.invokeLater(() -> textArea.append("The value of the height is at its " + value + "%." + "\n"));
        //System.out.println("The value of the height is at its " + response.getHeightResponse() + "%.");
    }
    
    
    public void requestPRC_courtainsGap(JTextArea textArea, int value){
        SwingUtilities.invokeLater(() -> textArea.append("Unary - PatientRoomControl - Courtains Gap."  + "\n"));
        GapRequest request = GapRequest.newBuilder()
                .setCourtainsRequest(value)  //this is going to be taken from the gui
                .build();
        GapResponse response = prc_syncStub.courtainsGap(request);
        SwingUtilities.invokeLater(() -> textArea.append("The courtains are " + value + "% open." + "\n"));
        //System.out.println("The courtains are " + response.getCourtainsResponse() + "% open." );
    }
    
    
    
    
    
    
    //** BI DI - ROOM KEY CONTROL
    public void requestRKC_values(String roomName, JTextArea textArea){
        final String message;
        System.out.println("Bi Di Streaming - Room Key Control - Values for all of the Room Settings");
        StreamObserver<RoomConditions> responseObserver = new StreamObserver<RoomConditions>() {
            
            @Override
            public void onNext(RoomConditions response){
               String sTemp = String.valueOf(response.getTemp());
               String sHum = String.valueOf(response.getHumidity());
               String message = (LocalTime.now().toString() + ": response from server : " + "Temperature: " + sTemp + ", " + "Humidity: " + sHum + "\n");
               SwingUtilities.invokeLater(() -> textArea.append(message)); // setText(message));
               validateRoomsData(response, textArea);
            }
            
            @Override
            public void onError(Throwable t){
                t.printStackTrace();
            }
            
            @Override
            public void onCompleted(){
                SwingUtilities.invokeLater(() -> textArea.append(LocalTime.now().toString() + ": stream is completed." + "\n"));
                System.out.println(LocalTime.now().toString() + ": stream is completed.");
            }
    
        };
        
        StreamObserver<RoomRequest> requestObserver =  rkc_asyncStub.roomControlConditions(responseObserver);
        
        try{
            
            String [] rooms = {"neonatal unit", "microbiology unit", "hematology unit", "molecular diagnostics unit", 
                                "sterile storage unit", "operating theater unit", "room 1", "room 2", "room 3", "pharmaceutical storage unit"};
                
            if(contains(rooms,roomName.toLowerCase())){
                
                switch (roomName.toLowerCase()) {
                    case "neonatal unit":
                        message = "Client called the server for the Neonatal Intensive Care Unit Values";
                        break;
                    case "microbiology unit":
                        message = "Client called the server for the Microbiology Unit Values";
                        break;
                    case "hematology unit":
                        message = "Client called the server for the Hematology Unit Values";
                        break;
                    case "molecular diagnostics unit":
                        message = "Client called the server for the Molecular Diagnostics Unit Values";
                        break;
                    case "sterile storage unit":
                        message = "Client called the server for the Sterile Storage Unit Values";
                        break;
                    case "operating theater unit":
                        message = "Client called the server for the Operating Theater Unit Values";
                        break;
                    case "room 1":
                        message = "Client called the server for the Room 1 Values";
                        break;
                    case "room 2":
                        message = "Client called the server for the Room 2 Values";
                        break;
                    case "room 3":
                        message = "Client called the server for the Room 3 Values";
                        break;
                    default:
                        message = "Client called the server for the Pharmaceutical Storage Unit values";
                        break;
                }
                
                requestObserver.onNext(RoomRequest.newBuilder().setRoomName(roomName.toLowerCase()).build());  //this is going to be taken from the gui
                SwingUtilities.invokeLater(() -> textArea.append(message + "\n"));
                //System.out.println("Client called the server for the Neonatal Intensive Care Unit Values");
                //Thread.sleep(500);
                
            }else{
                
                SwingUtilities.invokeLater(() -> textArea.append("No Such Room Exception: Unexistent Room \n"));
            }
           
            
        }catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }
     
    }

    public static Boolean contains(String [] rooms, String roomName){
        int n = 0;
        while(n < rooms.length){
            if(rooms[n].equals(roomName)){
                return true;
            }
            n++;
        }
        return false;
    }
    
    private static void validateRoomsData(RoomConditions room, JTextArea textArea) {
        // Example validation logic
        if (room.getTemp() < 18 || room.getTemp() > 24) {
            String message = "Abnormal temperature detected. Alerting response team.";
            SwingUtilities.invokeLater(() -> textArea.append(message + "\n" + "\n"));
        }   
        else if(room.getHumidity() < 40 || room.getHumidity() > 60 ){
             String message = "Abnormal humidity detected. Alerting response team.";
             SwingUtilities.invokeLater(() -> textArea.append(message + "\n" + "\n"));
        } 
         else {
        
            SwingUtilities.invokeLater(() -> textArea.append("Normal readings."+ "\n"  + "\n"));
        }
    }
    
    
    //Client Streaming - SMART MONITOR
    public StreamObserver<PatientData> sendPatientData(StreamObserver<Validation> responseObserver) throws InterruptedException{
        
        try{
        StreamObserver<PatientData> requestObserver = sm_asyncStub.smartPatientMonitor(responseObserver);
        return requestObserver;
        }finally{
           //channelSM.shutdownNow().awaitTermination(5,TimeUnit.SECONDS);
        }
 
    }

    
    //Server Streaming - ROOM STATUS
    public void RoomStatus (JTextArea textArea){
        
        StatusRequest request = StatusRequest.newBuilder().build();
        
        StreamObserver<BedUpdate> responseObserver = new StreamObserver<BedUpdate>() {
            
            @Override
            public void onNext(BedUpdate request){
                try {
                    SwingUtilities.invokeLater(() -> textArea.append(String.valueOf(request + "\n")));
                    Thread.sleep(1500);
                    // SwingUtilities.invokeLater(() -> textArea.append(request.getName()));
                    // SwingUtilities.invokeLater(() -> textArea.append(request.getStatus()));
                    // SwingUtilities.invokeLater(() -> textArea.append(String.valueOf(request.getPatientId())));
                    // SwingUtilities.invokeLater(() -> textArea.append(String.valueOf(request.getPatientId())));
                } catch (InterruptedException ex) {
                    Logger.getLogger(HospitalClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            @Override
            public void onError(Throwable t){
                
            }

            @Override
            public void onCompleted() {
                SwingUtilities.invokeLater(() -> textArea.append("Client received completed " + "\n"));
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

        };
        
        rs_asyncStub.streamBedStatus(request, responseObserver);
            //we will sleep the retrived response so we can observe that we are having a SERVER STREAM
            try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            
        }
  
        
    }
    
    
    
 



