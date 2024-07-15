package edu.itstep.junitlesson;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        double result = calculator.add(0.1, 0.2);
        assertEquals(0.3, result, 0.001, "Result should be 0.3");
    }


    @Test
    void subtract() {
        //assumeTrue(false);
        System.out.println("END");
        assertEquals(new BigDecimal("0.2").add(new BigDecimal("0.1")).doubleValue(), 0.3);
    }

    public static String[] data() {
        String[] data = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        return data;
    }

    @ParameterizedTest
    @MethodSource("data")
    void multiply(String data) {
        System.out.println(data);
    }

    @Test
    void Should_Return5_When_DivideByTwo() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.001, "Result should be 0.5");
    }

    @Test
    @DisplayName("Exception when pass zero in arguments")
    void Should_ThrowException_When_ArgumentIsZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @ParameterizedTest
    @ValueSource(strings = {"one", "two", "three"})
    void paramTest(String param) {
        System.out.println(param);
    }

    @RepeatedTest(10)
    @Tag("REPEATED_TEST")
    void testRepeatedTest(RepetitionInfo repetitionInfo) {
        System.out.println(repetitionInfo.getCurrentRepetition());
        System.out.println(repetitionInfo.getTotalRepetitions());
    }

    @RepeatedTest(value = 10, name = "{displayName} {currentRepetition} / {totalRepetitions}")
    @DisplayName("Repeat")
    @Tag("REPEATED_TEST")
    void testRepeat(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
    }

    @Nested
    @Tag("NESTED")
    class NestedTest {

        @Test
        void test() {
            System.out.println("TEST");
        }
    }

}