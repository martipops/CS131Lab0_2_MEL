/**
 * ArrayFun class:
 * holds an array of 6 squares
 * methods forward backward and sum use this array
 */
public class ArrayFun {
    // initializes a private for number of squares
    private int SQUARE_COUNT;
    Square[] myArray;

    /**
     * Create a Square[] array of default size 6 with side lengths corresponding
     * to their index. Uses constructor chaining for ease of use.
     */
    public ArrayFun() {
        this(6);
    }

    /**
     * Create a Square[] array of a custom size with side lengths corresponding
     * to their index
     * 
     * @param sqCount the amount of squares in the array
     */
    public ArrayFun(int sqCount) {
        SQUARE_COUNT = sqCount;
        myArray = new Square[SQUARE_COUNT];
        for (int i = 0; i < SQUARE_COUNT; i++)
            myArray[i] = new Square(i);
    }

    /**
     * Gets a square at a specified index
     * 
     * @param i the index of the square to get
     * @return Square type
     */
    public Square getArrayItem(int i) {
        return myArray[i];
    }

    /**
     * Sets an square at a specified index
     * 
     * @param s the Square to set at an index
     * @param i the index of the item to set
     */
    public void setArrayItem(Square s, int i) {
        myArray[i] = s;
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
        for (int i = SQUARE_COUNT - 1; i > 0; i--)
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
