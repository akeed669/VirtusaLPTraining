import java.util.Scanner;

public class MainClass {
    public static void main(String [] args){
        
        Scanner numberScanner=new Scanner(System.in);
        System.out.println("Enter a number\n");  
        
        int userInput = numberScanner.nextInt();
        int reversedNumber=0;        
        
        while(userInput>1){
            int lastDigit = userInput%10;
            //System.out.println("now it is "+lastDigit);
            userInput/=10;            
            reversedNumber=reversedNumber*10+lastDigit;         
            
        }
       
        System.out.println("Your reversed number is "+reversedNumber);    
    }

}