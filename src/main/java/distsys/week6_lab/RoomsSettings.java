/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.week6_lab;

//https://www.hpsc.ie/a-z/environmentandhealth/severeweatherevents/heat/heathealthadviceforhealthandcareprofessionals/
//this link was used as source of guidance to determine the range of the temperature and humidity in irish hospitals.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author marti
 */
public final class RoomsSettings {
    
    Map Rooms;
   
     
    public class RoomValues{
        
        private int temperature;
        private int humidity;
        
        public RoomValues(int temp, int hum){
            this.temperature = temp;
            this.humidity = hum;
        
        }
        
        public int getTemp(){
            return temperature;
        }
        
        public int getHum(){
            return humidity;
        }
        
        public void setTemp(int temp){
            temperature = temp;
        }
        
        public void setHum(int hum){
            humidity = hum;
        }
 
    }
    
    
    public int randomNumber(int min, int max) {
        return (int)(Math.random() * (max - min)) + min;
    }

    
    public RoomsSettings(){
        
        
        
        //Map with all the special rooms
        Rooms = new HashMap<String, List<RoomValues> >();
        
        //Neonatal intensive care unit
        List<RoomValues> neonatalValues = new ArrayList<>();
        
        neonatalValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        neonatalValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        neonatalValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        neonatalValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        
        Rooms.put("neonatal unit", neonatalValues ); //the first element is the temperature, the second one is the humidity
        

        //Microbiology
        List<RoomValues> microbiologyValues = new ArrayList<>();
        
        microbiologyValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        microbiologyValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        microbiologyValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        microbiologyValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));

        Rooms.put("microbiology unit", microbiologyValues);
        
        
        //Hematology
        List<RoomValues> hematologyValues = new ArrayList<>();
        
        hematologyValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        hematologyValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        hematologyValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        hematologyValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        
        Rooms.put("hematology unit", hematologyValues);
        
        
        //Molecular Diagnostics
        List<RoomValues> molecularValues = new ArrayList<>();
        
        molecularValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        molecularValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        molecularValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        molecularValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        
        Rooms.put("molecular diagnostics unit", molecularValues);
        
        //Sterile Storage
        List<RoomValues> sterileValues = new ArrayList<>();
        
        molecularValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        molecularValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        molecularValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        molecularValues.add(new RoomValues(randomNumber(17,23),randomNumber(39,61)));
        
        Rooms.put("sterile storage unit", sterileValues);
        
        //Operating Theater
        List<RoomValues> operatingValues = new ArrayList<>();
        
        Rooms.put("operating theater unit", operatingValues);
        
        //Patient Rooms
        List<RoomValues> room1Values = new ArrayList<>();
        
        Rooms.put("room 1", new RoomValues(randomNumber(17,24),randomNumber(29,61)));
        
        //Patient Rooms
        List<RoomValues> room2Values = new ArrayList<>();
        
        Rooms.put("room 2", new RoomValues(randomNumber(17,24),randomNumber(29,61)));
        
        //Patient Rooms
        List<RoomValues> room3Values = new ArrayList<>();
        
        Rooms.put("room 3", new RoomValues(randomNumber(17,24),randomNumber(29,61)));
        
        //Pharmaceutical Storage
        List<RoomValues> pharmaValues = new ArrayList<>();
        
        Rooms.put("pharmaceutical storage unit", new RoomValues(randomNumber(17,26),randomNumber(29,61)));
       
    }
    
    public int[] getRoomValues(String roomName) {
        
        RoomValues room = (RoomValues) Rooms.get(roomName);
        
        if (room != null) {
            
            return new int[]{room.getTemp(), room.getHum()};
            
        }
        return new int[]{-100, -100}; // or negative values if the room or values don't exist
    }
    
    
    
    public static void main(String [] args){
        
        RoomsSettings settings = new RoomsSettings();
        
        int[] values = settings.getRoomValues("Neonatal Unit");
        
        System.out.println("Neonatal Unit Temperature: " + values[0]);
        System.out.println("Neonatal Unit Humidity: " + values[1]);
        
        
    }

    
    
}
