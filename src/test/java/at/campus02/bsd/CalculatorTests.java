/**
 * CalculatorTests
 *
 * The CalculatorTests class tests the arithmetic methods of the @Calculator.java
 *
 * @author Jakob Janz
 *
 */
package at.campus02.bsd;

import org.junit.jupiter.api.*;

public class CalculatorTests {
    /**
     * The calculator variable implements a new Calculator.
     */
    Calculator calculator;
    /**
     * <p>The setUp() method is used before every tests. And initializes the @calculator variable.
     * </p>
     */
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    /**
     * <p>The add1() method tests the addition of 2 and 4.
     * </p>
     */
    @DisplayName("adding 2 and 4")
    @Test
    public void add1() {
        int result = (int) calculator.add(2, 4);
        Assertions.assertEquals(6, result);
    }
    /**
     * <p>The add2() method tests the addition of -3 and 3.
     * </p>
     */
    @DisplayName("adding -3 and 3")
    @Test
    public void add2() {
        int result = (int) calculator.add(-3, 3);
        int test = -3 + 3;
        Assertions.assertEquals(test, result);
    }
    /**
     * <p>The sub1() method tests the subtraction of 6 and 4.
     * </p>
     */
    @DisplayName("subtracting 4 from 6")
    @Test
    public void sub1() {
        int result = (int) calculator.minus(6, 4);
        int test = 6 - 4;
        Assertions.assertEquals(test, result);
    }
    /**
     * <p>The sub2() method tests the subtraction of -2 and 1.
     * </p>
     */
    @DisplayName("subtracting 1 from -2")
    @Test
    public void sub2() {
        int result = (int) calculator.minus(-2, 1);
        Assertions.assertEquals(-3, result);
    }
    /**
     * <p>The multiply1() method tests the multiplication of 3 and 4.
     * </p>
     */
    @DisplayName("multiplying 3 and 4")
    @Test
    public void multiply1() {
        int result = (int) calculator.multiply(3, 4);
        int test = 3 * 4;
        Assertions.assertEquals(test, result);
    }
    /**
     * <p>The multiply2() method tests the multiplication of -2 and 5.
     * </p>
     */
    @DisplayName("multiplying -2 and 5")
    @Test
    public void multiply2() {
        int result = (int) calculator.multiply(-2, 5);
        Assertions.assertEquals(-10, result);
    }
    /**
     * <p>The divide1() method tests the division 8 and 2.
     * </p>
     */
    @DisplayName("dividing 2 from 8")
    @Test
    public void divide1() {
        int result = (int) calculator.divide(8, 2);
        int test = 8 / 2;
        Assertions.assertEquals(test, result);
    }
    /**
     * <p>The divide2() method tests the division 6 and 3.
     * </p>
     */
    @DisplayName("dividing 3 from 6")
    @Test
    public void divide2() {
        int result = (int) calculator.divide(6, 3);
        Assertions.assertEquals(2, result);
    }
    /**
     * <p>The divide3() method tests a division by zero
     * </p>
     */
    @DisplayName("division by 0")
    @Test
    public void divide3() {
        int result = (int) calculator.divide(6, 0);
        Assertions.assertEquals(0, result);
    }
    /**
     * <p>The faculty1() method tests a faculty of -1.
     * </p>
     */
    @DisplayName("faculty of -1")
    @Test
    public void faculty1() {
        int result = calculator.faculty(-1);
        Assertions.assertEquals(0, result);
    }
    /**
     * <p>TThe faculty2() method tests a faculty of 8.
     * </p>
     */
    @DisplayName("faculty of 8")
    @Test
    public void faculty2() {
        int result = calculator.faculty(8);
        int test = 8 * 7 * 6 * 5 * 4 * 3 * 2;
        Assertions.assertEquals(test, result);
    }
    /**
     * <p>TThe faculty3() method tests a faculty of 3.
     * </p>
     */
    @DisplayName("faculty of 3")
    @Test
    public void faculty3() {
        int result = calculator.faculty(3);
        Assertions.assertEquals(6, result);
    }

}
