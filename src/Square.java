/**
 * Square class:
 * This class Creates a Square object with a Side Length variable and
 * uses it to find the area of the Square.
 * 
 */
public class Square {
    private int sideLength;

    /**
     * Creates a Square object with the sideLength of the Square set to be zero
     */
    public Square() {
        sideLength = 0;
    }

    /**
     * Creates a Square object with a specified side length
     * 
     * @param s the value to set the side length of the square
     */
    public Square(int s) {
        sideLength = s;
    }

    /**
     * Sets the side length of the square
     * 
     * @param s the value to set the side length of the square
     */
    public void setSide(int s) {
        sideLength = s;
    }

    /**
     * Gets the side length of the square
     * 
     * @return int: the side length of the square
     */
    public int getSide() {
        return sideLength;
    }

    /**
     * Calculates the area of the square
     * 
     * @return int: the area of the square
     */
    public int area() {
        return sideLength * sideLength;
    }
}