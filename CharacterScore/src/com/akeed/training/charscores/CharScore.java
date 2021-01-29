package com.akeed.training.charscores;

import java.util.Scanner;

public class CharScore {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        boolean proceed = true;

        while (proceed) {

            System.out.println("Enter a string of characters below:");

            String input = userInput.next();
            input = input.toLowerCase();

            char[] characters = input.toCharArray();

            int score = 0;

            for (int c = 0; c < characters.length; c++) {

                int charValue = 0;

                int currentChar = (int) characters[c];

                if (currentChar > 64 && currentChar < 91) {
                    charValue = currentChar - 64;
                } else if (currentChar > 96 && currentChar < 123) {
                    charValue = currentChar - 96;
                } else {
                    charValue = 0;
                }

                score += charValue;

            }

            System.out.println(score);

            System.out.println("Enter 9 if you want to continue OR any other integer to stop:");
            int nextRound = userInput.nextInt();

            if (nextRound != 9) proceed = false;


        }


    }


}
