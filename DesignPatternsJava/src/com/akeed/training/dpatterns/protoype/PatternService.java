package com.akeed.training.dpatterns.protoype;

import java.util.Scanner;

public class PatternService {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the type of pattern you require:");
        String requiredPattern = userInput.nextLine();
        System.out.print("How many times to print the pattern?:");
        int repeatPattern = userInput.nextInt();


        for (int i = 0; i < repeatPattern; i++) {
            PatternStore.getPattern(requiredPattern).generateLines();
        }


    }
}
