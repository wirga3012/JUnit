import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StringTest {
    public String[] symbols = new String[]{"a","b","c"};

    @Test
    public void StrinJoinTest(){
       String expected = "a;b;c";

       String result = String.join(";",symbols);

       assertEquals(expected,result);
    }
    @Test
    public void toLowerCaseTest(){
        String word = "VAKARAS";
        String expected = "vakaras";

        String result = word.toLowerCase();

        assertEquals(expected,result);
    }

    @Test
    public void charAtTest(){
        String word = "VAKARAS";
        char expected = 'R';

        char result = word.charAt(4);

        assertEquals(expected,result);
    }
    @Test
    public void TrimTest(){
        String word = "     VAKARAS    ";
        String expected = "VAKARAS";

        String result = word.trim();

        assertEquals(expected,result);
    }
    @Test
    public void SubstringTest(){
        String word = "VAKARAS";
        String expected = "AKA";

        String result = word.substring(1,4);

        assertEquals(expected,result);
    }

}
