import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodeCrackerTest {
    
    @Test
    public void test1_cracker(){
        assertEquals("maria", CodeCracker.cracker("b!g>!"));
    }

    @Test
    public void test2_cracker(){
        assertEquals("adam", CodeCracker.cracker("!(!b"));
    }


    @Test
    public void test1_encryptor(){
        assertEquals("b!g>!", CodeCracker.encryptor("maria"));
    }


    @Test
    public void test2_encryptor(){
        assertEquals("!(!b", CodeCracker.encryptor("adam"));
    }

}
