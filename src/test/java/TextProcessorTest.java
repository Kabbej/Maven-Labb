import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextProcessorTest {

    TextProcessor textProcessor = new TextProcessor();



    @Test
    void upperCase() {
        assertEquals("HEJ", textProcessor.upperCase("hej"));

    }

    @Test
    void lowerCase() {
        assertEquals("hej", textProcessor.lowerCase("HEJ"));
    }

    @Test
    void reverse() {
        assertEquals("jeh",textProcessor.reverse("hej"));
    }

    @Test
    @AfterEach
    void afterEach (){
        System.out.println("Skrivs ut efter varje test");
    }
}