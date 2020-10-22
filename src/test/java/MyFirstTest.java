import org.junit.Test;
import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void testIfStringsAreEqual(){
        String expected = "Codeup";
        String actual = "CodeUp";

//        assertEquals(expected, actual);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testArraysAreEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertNotEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfStringContains(){
        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

        assertTrue("H", true);
        assertFalse("J", false);
    }
}
