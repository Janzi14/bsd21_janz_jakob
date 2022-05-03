package at.campus02.bsd;

import org.junit.jupiter.api.*;

public class CalculatorTests {
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @DisplayName("adding 2 and 4")
    @Test
    public void add1() {
        int result = (int) calculator.add(2, 4);
        Assertions.assertEquals(6, result);
    }

    @DisplayName("adding -3 and 3")
    @Test
    public void add2() {
        int result = (int) calculator.add(-3, 3);
        int test = -3 + 3;
        Assertions.assertEquals(test, result);
    }

    @DisplayName("subtracting 4 from 6")
    @Test
    public void sub1() {
        int result = (int) calculator.minus(6, 4);
        int test = 6 - 4;
        Assertions.assertEquals(test, result);
    }

    @DisplayName("subtracting 1 from -2")
    @Test
    public void sub2() {
        int result = (int) calculator.minus(-2, 1);
        Assertions.assertEquals(-3, result);
    }

    @DisplayName("multiplying 3 and 4")
    @Test
    public void multiply1() {
        int result = (int) calculator.multiply(3, 4);
        int test = 3 * 4;
        Assertions.assertEquals(test, result);
    }

    @DisplayName("multiplying -2 and 5")
    @Test
    public void multiply2() {
        int result = (int) calculator.multiply(-2, 5);
        Assertions.assertEquals(-10, result);
    }

    @DisplayName("dividing 2 from 8")
    @Test
    public void divide1() {
        int result = (int) calculator.divide(8, 2);
        int test = 8 / 2;
        Assertions.assertEquals(test, result);
    }

    @DisplayName("dividing 3 from 6")
    @Test
    public void divide2() {
        int result = (int) calculator.divide(6, 3);
        Assertions.assertEquals(2, result);
    }

    @DisplayName("faculty of -1")
    @Test
    public void faculty1() {
        int result = calculator.faculty(-1);
        Assertions.assertEquals(0, result);
    }

    @DisplayName("faculty of 8")
    @Test
    public void faculty2() {
        int result = calculator.faculty(8);
        int test = 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1;
        Assertions.assertEquals(test, result);
    }

    @DisplayName("faculty of 3")
    @Test
    public void faculty3() {
        int result = calculator.faculty(3);
        Assertions.assertEquals(6, result);
    }

}
