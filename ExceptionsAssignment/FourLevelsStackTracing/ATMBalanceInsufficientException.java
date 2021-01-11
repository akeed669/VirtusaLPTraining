/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FourLevelsStackTracing;


public class ATMBalanceInsufficientException extends Exception {
    
    public ATMBalanceInsufficientException (String errorMessage){
        super(errorMessage);
    }

}
