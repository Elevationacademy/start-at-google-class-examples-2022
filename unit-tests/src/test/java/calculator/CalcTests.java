package calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcTests {
    private Calc calc;

    @BeforeEach
    void beforeEach() {
        calc = new Calc();
    }

    @Test
    void calculate_nullValue_throwsException() {
        assertThrows(RuntimeException.class, () -> calc.calculate(1.0, 1, Operation.ADD));
    }

    @Test
    void calculate_num2is0_throwsException(){
        assertThrows(RuntimeException.class, () -> calc.calculate(2.0, 0, Operation.ADD), "Calculate with null value did not throw the correct exception");

    }
    @Test
    void calculate_onePlueOne_equalsTwo() {
        //Act
        double calculate = calc.calculate(1.0, 1, Operation.ADD);
        //Assert
        assertEquals(2, calculate);
    }

    @Test
    void calculate_twoMinusOne_equalsOne() {
        //Act
        double calculate = calc.calculate(2.0, 1, Operation.SUBTRACT);
        //Assert
        assertEquals(1, calculate);
    }

}
