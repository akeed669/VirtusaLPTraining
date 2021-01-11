/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FourLevelsStackTracing;


public class ATMBalance{   
    
    int atmBalance = 200;    
        
    public void checkAtmBalance()throws ATMBalanceInsufficientException{
            if (this.atmBalance<500){
                throw new ATMBalanceInsufficientException("ATM balance is insufficient!");
            }
        }
    

}
