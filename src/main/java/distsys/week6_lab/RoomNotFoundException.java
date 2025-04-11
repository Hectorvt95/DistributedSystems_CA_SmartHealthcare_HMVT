/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.week6_lab;

/**
 *
 * @author marti
 */
public class RoomNotFoundException extends RuntimeException {
    
    public RoomNotFoundException(){
        System.out.println("ERROR: The room you are looking for was not found");
    }


}
    

