/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FourLevelsStackTracing;


public class MainMethod {
    public static void main(String []args){
        
        try{
            CardVerification cardVerification=new CardVerification();
            cardVerification.checkCard();
                    
        }catch(ATMBalanceInsufficientException balance){
            balance.printStackTrace();  
            //System.out.println(balance);
        }      
    
        
    }

}
