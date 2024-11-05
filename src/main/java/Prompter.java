

import java.util.Scanner;

public class Prompter {
    private Scanner scanner;

    //constructor to init the scanner
    public Prompter() {
        this.scanner = new Scanner(System.in);
    }

    // method to prompt for the type of item
    public String promptForItemType() {
        System.out.printf("What type of item should fill the jar?  ");
        return scanner.nextLine();
     }

     //method to prompt for the max amount of items based on the item type
    public int promptForMaxAmount(String itemName){
        System.out.printf("What is the maximum amount of %s? %n", itemName);
        return scanner.nextInt();
    }

    // Prompt for a guess
    public int promptForGuess(Jar jar) {
        int guess = 0;
        boolean validGuess = false;


        // Loop until a valid guess is provided
        while (!validGuess) {
            System.out.printf("How many %s are in the jar? Pick a number between 1 and %d: ", jar.getItemName(), jar.getMaxItems());

            // Check if the input is an integer
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();

                // Validate if the guess is within the acceptable range
                if (guess >= 1 && guess <= jar.getMaxItems()) {
                    validGuess = true;
                } else {
                    System.out.printf("Your guess must be between 1 and %d.%n", jar.getMaxItems());
                }
            } else {
                // Invalid input: prompt the user again and clear the scanner
                System.out.println("Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        return guess;
    }
}