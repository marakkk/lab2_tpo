import org.junit.Test;
import org.marakobz.trig_func.CosFunction;
import org.marakobz.trig_func.SinFunction;

import static org.junit.Assert.assertEquals;

public class TrigFunctionsTest {
    private static final double EPSILON = 1e-5;

    @Test
    public void testSin() {
 
        assertEquals(Math.sin(0), SinFunction.sin(0, EPSILON), EPSILON);
        assertEquals(Math.sin(Math.PI / 6), SinFunction.sin(Math.PI / 6, EPSILON), EPSILON);
        assertEquals(Math.sin(Math.PI), SinFunction.sin(Math.PI, EPSILON), EPSILON);


        assertEquals(Math.sin(-Math.PI / 3), SinFunction.sin(-Math.PI / 3, EPSILON), EPSILON);
        assertEquals(Math.sin(-Math.PI), SinFunction.sin(-Math.PI, EPSILON), EPSILON);


        assertEquals(Math.sin(2 * Math.PI), SinFunction.sin(2 * Math.PI, EPSILON), EPSILON);
        assertEquals(Math.sin(-2 * Math.PI), SinFunction.sin(-2 * Math.PI, EPSILON), EPSILON);
    }

    @Test
    public void testCos() {

        assertEquals(Math.cos(0), CosFunction.cos(0, EPSILON), EPSILON);
        assertEquals(Math.cos(Math.PI / 4), CosFunction.cos(Math.PI / 4, EPSILON), EPSILON);
        assertEquals(Math.cos(Math.PI), CosFunction.cos(Math.PI, EPSILON), EPSILON);


        assertEquals(Math.cos(-Math.PI / 2), CosFunction.cos(-Math.PI / 2, EPSILON), EPSILON);
        assertEquals(Math.cos(-Math.PI), CosFunction.cos(-Math.PI, EPSILON), EPSILON);


        assertEquals(Math.cos(2 * Math.PI), CosFunction.cos(2 * Math.PI, EPSILON), EPSILON);
        assertEquals(Math.cos(-2 * Math.PI), CosFunction.cos(-2 * Math.PI, EPSILON), EPSILON);
    }
}
