/**
 * Description: Application for the ArrayFun class filled with 6 square objects
 * Runs ArrayFun's respective methods: forward backward and sum
 * 
 * @author Marti Lonnemann
 * @version 0.1
 *          CS131Lab0_2_MEL
 *          Spring-2023
 */
public class Application {
    public static void main(String[] args) throws Exception {
        ArrayFun squareArray = new ArrayFun();
        squareArray.forward();
        squareArray.backward();
        squareArray.sum();
    }
}
