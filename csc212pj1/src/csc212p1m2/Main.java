/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212p1m2;

import csc212p1m1.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Heng-Hao Pu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // generate a random number from 1 and 10 
        Random random = new Random();
        int randomNumberFromOneToTen = random.nextInt(10) + 1;
        
        // prompt the user to guess the number and store the value that the user typed
        System.out.println("The computer already choose a number from 1 to 10. Let's try to enter an integer number to guess it.");
        Scanner scanner = new Scanner(System.in);
        String chosenNumberInString = scanner.nextLine();
        
        // convert the user's input into an integer value
        int chosenNumber = Integer.parseInt(chosenNumberInString);
        
        // campare the value of user's guess to that of the randomly selected number and determine is the user guessed correctly
        if (chosenNumber == randomNumberFromOneToTen) {
            
            // provide feedback to the user about their guess, indicating whether the guess was too high, too low, or if they guess correctly
            System.out.println("Bingo!");
            
        } else {
            
            System.out.print("Wrong guess! ");
            
            if ((chosenNumber < randomNumberFromOneToTen) && (chosenNumber >= 1)) {
                
                // provide feedback to the user about their guess
                System.out.println("The number you guessed is lower than the one the computer chose, which is " + randomNumberFromOneToTen);
                
            } else if ((chosenNumber > randomNumberFromOneToTen) && (chosenNumber <= 10)) {
                
                // provide feedback to the user about their guess
                System.out.println("The number you guessed is higher than the one the computer chose, which is " + randomNumberFromOneToTen);
                
            } else if ((chosenNumber < 1) || (chosenNumber > 10)) {
                
                // provide feedback to the user about their guess
                System.out.println("The number you guessed is not in the designated interval.");
                
            }
        }
        
        
        
    }
    
}
