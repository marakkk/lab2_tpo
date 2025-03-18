import org.junit.Test;
import org.marakobz.trig_func.TrigFunctions;

import static org.junit.Assert.*;

public class TrigFunctionsTest {
    private static final double EPSILON = 1e-5;

    @Test
    public void testSin() {
 
        assertEquals(Math.sin(0), TrigFunctions.sin(0, EPSILON), EPSILON);
        assertEquals(Math.sin(Math.PI / 6), TrigFunctions.sin(Math.PI / 6, EPSILON), EPSILON);
        assertEquals(Math.sin(Math.PI), TrigFunctions.sin(Math.PI, EPSILON), EPSILON);


        assertEquals(Math.sin(-Math.PI / 3), TrigFunctions.sin(-Math.PI / 3, EPSILON), EPSILON);
        assertEquals(Math.sin(-Math.PI), TrigFunctions.sin(-Math.PI, EPSILON), EPSILON);


        assertEquals(Math.sin(2 * Math.PI), TrigFunctions.sin(2 * Math.PI, EPSILON), EPSILON);
        assertEquals(Math.sin(-2 * Math.PI), TrigFunctions.sin(-2 * Math.PI, EPSILON), EPSILON);
    }

    @Test
    public void testCos() {

        assertEquals(Math.cos(0), TrigFunctions.cos(0, EPSILON), EPSILON);
        assertEquals(Math.cos(Math.PI / 4), TrigFunctions.cos(Math.PI / 4, EPSILON), EPSILON);
        assertEquals(Math.cos(Math.PI), TrigFunctions.cos(Math.PI, EPSILON), EPSILON);


        assertEquals(Math.cos(-Math.PI / 2), TrigFunctions.cos(-Math.PI / 2, EPSILON), EPSILON);
        assertEquals(Math.cos(-Math.PI), TrigFunctions.cos(-Math.PI, EPSILON), EPSILON);


        assertEquals(Math.cos(2 * Math.PI), TrigFunctions.cos(2 * Math.PI, EPSILON), EPSILON);
        assertEquals(Math.cos(-2 * Math.PI), TrigFunctions.cos(-2 * Math.PI, EPSILON), EPSILON);
    }
}
