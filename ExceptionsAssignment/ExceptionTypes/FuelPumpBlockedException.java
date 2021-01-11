/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExceptionTypes;

public class FuelPumpBlockedException extends RuntimeException{
    public FuelPumpBlockedException(String message){
        super(message);
    }
}
