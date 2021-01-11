/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExceptionTypes;


public class FuelService {
    
    int fuelRemaining = 150;
    public void pumpFuel()throws InsufficientFuelException{
        if (this.fuelRemaining<75){
            throw new InsufficientFuelException("Fuel balance is below threshold!");
        }
        
        if(!isPumpFunctioningProperly()){
            throw new FuelPumpBlockedException("Fuel pump is blocked!");
        }
    }

    private boolean isPumpFunctioningProperly() {
        return false;
    }

}
