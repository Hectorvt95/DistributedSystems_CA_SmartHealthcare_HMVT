
package distsys.week6_lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author marti
 */
public final class RoomStatus {
    
    public ArrayList<Room> Status;
    
    public class Room{
      
        private int bedID;
        private String name;
        private String status;
        private int patient_id;
        private int timestamp;
        
        public Room(int bedID,String name, String status, int patient_id, int timestamp){
            this.bedID = bedID;
            this.name = name;
            this.status = status;
            this.patient_id = patient_id;
            this.timestamp = timestamp;
        }
        public int getBedID(){return this.bedID;}
        public String getName(){return this.name;}
        public String getStatus(){return this.status;}
        public int getPatient(){return this.patient_id; }
        public int getTimestamp(){return this.timestamp;}   
       
        public String toString(){
            return "Room ID: " + getBedID() + "\n" +
                   "Room Name: " + getName() + "\n" +
                   "Status: " + getStatus()  + "\n" +
                   "Patient ID: " + getPatient()  + "\n" +
                   "Time: " + getTimestamp() + "\n";
        }
        
    }
    
    public RoomStatus(){
        
        //Map with all the special rooms
        
        Status = new ArrayList<>();
        
        int time = (int) System.currentTimeMillis();
        
        Status.add(new Room(001,"Intensive Care Unit", "OCCUPIED", 01003, time));
        Status.add(new Room(002,"Intensive Care Unit", "OCCUPIED", 02124, time));
        Status.add(new Room(003,"Maternity Unit", "AVAILABLE", 0, time)); 
        Status.add(new Room(004,"Maternity Unit", "CLEANING IN PROGRESS", 0, time)); 
        Status.add(new Room(101,"Emergengy Room", "AVAILABLE", 0, time)); 
        Status.add(new Room(102,"Emergency Room", "CLEANING IN PROGRESS", 0, time)); 
        Status.add(new Room(103,"Emergency Room", "CLEANING IN PROGRESS", 0, time)); 
        
    }
   
    public static void main (String args[] ) {
      
       RoomStatus rs = new RoomStatus();
       
       List<Room> roomStatus = rs.Status;
       Iterator i = roomStatus.iterator();
       
       while(i.hasNext()){
           System.out.println((Room)i.next());
       }
       
       
       
   }
    
    
    
    
}
