import org.junit.jupiter.api.*;
import org.junit.runners.Parameterized;
import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @BeforeEach
    void beforeEach (){
        System.out.println("Körs före varje test");
    }

    @RepeatedTest(10)
    void testTrue(){
        assertTrue(0 < 5);
    }

    @Test
    void testAdd (){
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    @DisplayName("Testar multiply-metoden")
    void testMultiply (){
        assertNotEquals(0,calculator.multiply(2,5));
    }

    @Test
    void testDivide (){
        assertNotNull(calculator.divide(4,2));
    }

    @Test
    @Disabled
    void testSubtract (){
        assertEquals(0,calculator.subtract(2,2));
    }

}
