import java.util.Random;



public class Jar {
    //Add two private instance variables:
    // a String for the item name and an integer for the maximum number of items.
    private String itemName;
    private int maxItems;
    private int currentNumOfItems;

    //Implement a constructor that takes these two parameters and initializes the instance variables.
    public Jar( String itemName, int maxItems) {
        this.itemName = itemName;
        this.maxItems = maxItems;
        Fill();

    }
    //Create getter methods for both instance variables.
    public String getItemName() {
        return itemName;
    }

    public int getMaxItems() {
        return maxItems;
    }

    //Create a fill() method in the Jar class.
    private void Fill() {
        Random random = new Random();
        currentNumOfItems = random.nextInt(maxItems) + 1;
        //System.out.printf("The jar has been filled with %d %s.%n", currentNumOfItems, itemName);
    }

    //Create a getter method for the current number of items.
    public int getCurrentNumOfItems() {
        return currentNumOfItems;
    }

    // check if the guess is correct
    public boolean isCorrectGuess(int guess){
        return guess == currentNumOfItems;
    }

}
