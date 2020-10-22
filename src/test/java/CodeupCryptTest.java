import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testIfVersionIsSet(){
        assertEquals(0.0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.2;
        assertEquals(1.2, CodeupCrypt.version, 0);
    }

    @Test
    public void testHashPassword(){
        assertEquals("St33l3rs1994", CodeupCrypt.hashPassword("Steelers199a"));
        assertEquals("4ppl32001", CodeupCrypt.hashPassword("Apple2001"));
        assertEquals("K4l4m4z001", CodeupCrypt.hashPassword("Kalamazoo1"));
        assertEquals("1254", CodeupCrypt.hashPassword("1254"));
    }

    @Test
    public void testCheckPassword(){
        assertTrue("check password", CodeupCrypt.checkPassword("Steelers199a", "St33l3rs1994"));
        assertFalse("check password", CodeupCrypt.checkPassword("Kalamazoo1", "Kalamazoo1"));
    }
}
