import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class ReplaceTest {

    @Test
    public void computerChooses_shouldBeAString_true() throws Exception {
        Replace testReplace = new Replace();
        String expectedOutCome=  "Hello universe";
        assertEquals(expectedOutCome, testReplace.findAndReplace("Hello World" , "World" , "Universe"));
    }

}