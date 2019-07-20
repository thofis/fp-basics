package fpbasicsjava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void hello() {
        String greeting = "Hello" + " World";
        assertEquals("Hello World", greeting);
    }

}
