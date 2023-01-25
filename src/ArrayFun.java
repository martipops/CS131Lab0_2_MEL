/**
 * ArrayFun class:
 * holds an array of 6 squares
 * methods forward backward and sum use this array
 */
public class ArrayFun {
    // Creates a square array of size SQUARE_COUNT
    final private int SQUARE_COUNT = 6;
    Square[] myArray = new Square[SQUARE_COUNT];

    /**
     * Create a Square[] array of size 6 with side lengths corresponding
     * to their index
     */
    public ArrayFun() {
        for (int i = 0; i < SQUARE_COUNT; i++)
            myArray[i] = new Square(i);
    }

    /**
     * Iterates through each Square and prints out their areas
     * in ASCENDING order
     */
    public void forward() {
        for (int i = 0; i < SQUARE_COUNT; i++)
            System.out.println("Square " + i + " area: " + myArray[i].area());
    }

    /**
     * Iterates through each Square and prints out their areas
     * in DESCENDING order
     */
    public void backward() {
        for (int i = SQUARE_COUNT; i > 0; i--)
            System.out.println("Square " + i + " area: " + myArray[i].area());
    }

    /**
     * Sums up the areas of each square and prints it out.
     */
    public void sum() {
        int sum = 0;
        for (int i = 0; i < SQUARE_COUNT; i++)
            sum += myArray[i].area();
        System.out.println("Sum of areas: " + sum);
    }

}
