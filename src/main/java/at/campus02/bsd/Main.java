/**
 * Main
 *
 * The Main class prints the results of some calculations of the @Calculator.java.
 *
 * @author Jakob Janz
 *
 */
package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    /**
     * The logger variable implements the logger used to log an info and an error.
     */
    private static final Logger logger = LogManager.getLogger();
    /**
     * <p>The main() is the starting point of the program.
     * </p>
     * @param args is not used for this programm
     */
    public static void main(String[] args) {
        logger.info("This is an informative message");
        Calculator calculator =new Calculator();
        System.out.println(calculator.add(2.44,5.78));
        System.out.println(calculator.minus(2.44,5.78));
        System.out.println( calculator.multiply(2.44,5.78));
        System.out.println(  calculator.divide(2.44,5.78));
        logger.error("This is an error message");




    }
}
