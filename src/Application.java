/**
 * Description: Application for the ArrayFun class filled with 6 square objects
 * Runs ArrayFun's respective methods: forward backward and sum
 * Bonus: ArrayFun of custom length
 * 
 * @author Marti Lonnemann
 * @version 0.1
 *          CS131Lab0_2_MEL
 *          Spring-2023
 */
public class Application {
    public static void main(String[] args) {
        // Creates ArrayFun with default size of 6
        ArrayFun squareArray = new ArrayFun();
        squareArray.forward();
        squareArray.backward();
        squareArray.sum();
        // Creates ArrayFun of size 20 and prints sum
        ArrayFun squareArray2 = new ArrayFun(20);
        squareArray2.sum();

    }
}
