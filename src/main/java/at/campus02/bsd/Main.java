/*
 * Main
 * A simple calculator
 * Author: Jakob Janz
 * Last Change: 06.04.2022
 */
package at.campus02.bsd;

public class Main {
    public static void main(String[] args) {
        Calculator calculator =new Calculator();
        System.out.println(calculator.add(2.44,5.78));
        System.out.println(calculator.minus(2.44,5.78));
        System.out.println( calculator.multiply(2.44,5.78));
        System.out.println(  calculator.divide(2.44,5.78));




    }
}
