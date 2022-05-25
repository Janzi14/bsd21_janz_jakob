/**
 * Calculator
 *
 * The Calculator class implements five arithmetic methods and writes debug logs to a file.
 *
 * @author Jakob Janz
 *
 */

package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    /**
     * The logger variable implements the logger used in the class methods.
     */
    private static final Logger logger = LogManager.getLogger();
    /**
     * <p>The add() method takes two doubles as input and returns their sum.
     * </p>
     * @param number1 the first number of the addition
     * @param number2 the second number of the addition
     * @return the sum of the two parameters
     */
    public double add(double number1, double number2) {
        logger.debug("Add: Number 1: "+ number1+ " Number 2: "+number2);
        return number1 + number2;
    }
    /**
     * <p>The minus() method takes two doubles as input and returns their difference.
     * </p>
     * @param number1 the first number of the subtraction
     * @param number2 the second number of the subtraction
     * @return the difference of the two parameters
     */
    public double minus(double number1, double number2) {
        logger.debug("Subtract: Number 1: "+ number1+ " Number 2: "+number2);
        return number1 - number2;
    }
    /**
     * <p>The multiply() method takes two doubles as input and returns their product.
     * </p>
     * @param number1 the first number of the multiplication
     * @param number2 the second number of the multiplication
     * @return the product of the two parameters
     */
    public double multiply(double number1, double number2) {
        logger.debug("Multiply: Number 1: "+ number1+ " Number 2: "+number2);
        return number1 * number2;
    }
    /**
     * <p>The divide() method takes two doubles as input and returns their quotient.
     * </p>
     * @param number1 the first number of the division
     * @param number2 the second number of the division
     * @return the quotient of the two parameters
     */
    public double divide(double number1, double number2) {
        logger.debug("Divide: Number 1: "+ number1+ " Number 2: "+number2);
        if (number2 != 0) {
            return number1 / number2;
        }
        logger.error("Division by zero is not possible!");
        return 0;
    }
    /**
     * <p>The faculty() method takes a double as input and returns the faculty.
     * </p>
     * @param number the number of the faculty
     * @return the faculty of the number
     */
    public int faculty(int number) {
        logger.debug("Faculty: Number: "+ number);
        if (number < 1) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return number * faculty(number - 1);

    }
}
