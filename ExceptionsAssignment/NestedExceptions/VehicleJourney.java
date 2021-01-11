/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NestedExceptions;


public class VehicleJourney {
    
    Boolean doorOpen = true;
    
    public void driveCar()throws VehicleDoorOpenException{
        
        if(this.doorOpen){
            throw new VehicleDoorOpenException("Vehicle door is open!");
        }
        
    }
}
