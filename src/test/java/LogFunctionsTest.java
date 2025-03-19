import org.junit.Test;
import org.marakobz.log_func.LnFunction;
import org.marakobz.log_func.LogFunction;

import static org.junit.Assert.assertEquals;

public class LogFunctionsTest {
    private static final double EPSILON = 1e-5;

    @Test
    public void testLn() {
        assertEquals(Math.log(1), LnFunction.ln(1, EPSILON), EPSILON);
        assertEquals(Math.log(2), LnFunction.ln(2, EPSILON), EPSILON);
        assertEquals(Math.log(10), LnFunction.ln(10, EPSILON), EPSILON);
        assertEquals(Math.log(0.5), LnFunction.ln(0.5, EPSILON), EPSILON);
    }

    @Test
    public void testLnBig() {
        assertEquals(Math.log(16), LnFunction.ln(16, EPSILON), EPSILON);
    }

    @Test
    public void testLog() {
        assertEquals(Math.log(8) / Math.log(2), LogFunction.log(8, 2, EPSILON), EPSILON);
        assertEquals(Math.log(100) / Math.log(10), LogFunction.log(100, 10, EPSILON), EPSILON);
        assertEquals(Math.log(0.25) / Math.log(2), LogFunction.log(0.25, 2, EPSILON), EPSILON);

    }

    @Test
    public void testLogBig() {
        assertEquals(Math.log(16) / Math.log(4), LogFunction.log(16, 4, EPSILON), EPSILON);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testLnNegative() {
        LnFunction.ln(-1, EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLogNegative() {
        LogFunction.log(-10, 10, EPSILON);
    }
}
