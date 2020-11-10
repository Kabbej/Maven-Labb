import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd (){
        Calculator calculator = new Calculator();
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    @DisplayName("Testar multiply-metoden")
    void testMultiply (){
        Calculator calculator = new Calculator();
        assertNotEquals(0,calculator.multiply(2,5));
    }
}
