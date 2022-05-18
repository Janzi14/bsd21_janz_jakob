/*
 * Main
 * A simple calculator
 * Author: Jakob Janz
 * Last Change: 18.05.2022
 */
package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();
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
