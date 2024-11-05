
public class GuessingGame {
    public static void main(String[] args) {
        // create an instance of Prompter
        Prompter prompter = new Prompter();

        // Prompt for the type of item
        String itemType = prompter.promptForItemType();

        // Prompt for the maximum amount of the specified item
        int maxAmount = prompter.promptForMaxAmount(itemType);

        //Create a new Jar object using the collected information.
        Jar jar = new Jar(itemType, maxAmount);


        // welcome player
        System.out.println("\n--------------------");
        System.out.println("Welcome to the guessing game!");
        System.out.println("--------------------");

        int guess;
        int attempts = 0;

        // Start guessing loop
        do {
            attempts++;
            guess = prompter.promptForGuess(jar);

            // Check if the guess is correct
            if (jar.isCorrectGuess(guess)) {
                System.out.printf("Congrats! You got it in %d attempts!%n", attempts);
                break; // Exit the loop as the correct guess has been made
            } else {
                System.out.println("Incorrect guess. Try again!");
            }

        } while (true);
    }
}



