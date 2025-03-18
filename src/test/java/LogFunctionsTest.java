import org.junit.Test;
import org.marakobz.log_func.LogFunctions;

import static org.junit.Assert.*;

public class LogFunctionsTest {
    private static final double EPSILON = 1e-5;

    @Test
    public void testLn() {
        assertEquals(Math.log(1), LogFunctions.ln(1, EPSILON), EPSILON);
        assertEquals(Math.log(2), LogFunctions.ln(2, EPSILON), EPSILON);
        assertEquals(Math.log(10), LogFunctions.ln(10, EPSILON), EPSILON);
        assertEquals(Math.log(0.5), LogFunctions.ln(0.5, EPSILON), EPSILON);
    }

    @Test
    public void testLnBig() {
        assertEquals(Math.log(16), LogFunctions.ln(16, EPSILON), EPSILON);
    }

    @Test
    public void testLog() {
        assertEquals(Math.log(8) / Math.log(2), LogFunctions.log(8, 2, EPSILON), EPSILON);
        assertEquals(Math.log(100) / Math.log(10), LogFunctions.log(100, 10, EPSILON), EPSILON);
        assertEquals(Math.log(0.25) / Math.log(2), LogFunctions.log(0.25, 2, EPSILON), EPSILON);

    }

    @Test
    public void testLogBig() {
        assertEquals(Math.log(16) / Math.log(4), LogFunctions.log(16, 4, EPSILON), EPSILON);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testLnNegative() {
        LogFunctions.ln(-1, EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLogNegative() {
        LogFunctions.log(-10, 10, EPSILON);
    }
}
