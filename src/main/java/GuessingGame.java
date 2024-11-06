
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
        boolean correctGuess = false;

        // Start guessing loop
        do {
            attempts++;
            guess = prompter.promptForGuess(jar);

            // Check if the guess is correct
            if (jar.isCorrectGuess(guess)) {
                prompter.printSuccessMessage(attempts);
                correctGuess = true; // Exit the loop as the correct guess has been made
            } else {
                // Provide feedback based on whether the guess was too high or too low
                if (guess > jar.getCurrentNumOfItems()) {
                    prompter.printTooHighMessage();
                } else {
                    prompter.printTooLowMessage();
                }
            }
        } while (!correctGuess); // Keep looping until the correct guess is made
    }
}


