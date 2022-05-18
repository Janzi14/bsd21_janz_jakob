/*
 * Calculator
 * A simple calculator
 * Author: Jakob Janz
 * Last Change: 06.04.2022
 */

package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger();

    public double add(double number1, double number2) {
        logger.debug("Add: Number 1: "+ number1+ " Number 2: "+number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        logger.debug("Subtract: Number 1: "+ number1+ " Number 2: "+number2);
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        logger.debug("Multiply: Number 1: "+ number1+ " Number 2: "+number2);
        return number1 * number2;
    }

    public double divide(double number1, double number2) {
        logger.debug("Divide: Number 1: "+ number1+ " Number 2: "+number2);
        if (number2 != 0) {
            return number1 / number2;
        }
        logger.error("Division by zero is not possible!");
        return 0;
    }

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
