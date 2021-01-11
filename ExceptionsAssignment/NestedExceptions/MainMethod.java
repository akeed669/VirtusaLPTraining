/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NestedExceptions;

public class MainMethod {
    public static void main(String []args){
        try{
            VehicleJourney vehicleJourney = new VehicleJourney();
            vehicleJourney.driveCar();
        }
        catch(VehicleDoorOpenException exception){
            throw new IgnitionBlockedException("Cannot start the car!");
            
        }
    }

}
