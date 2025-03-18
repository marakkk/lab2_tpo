import org.junit.Test;
import org.marakobz.SystemFunction;
import org.marakobz.log_func.LogFunctions;
import org.marakobz.log_func.LogSystem;
import org.marakobz.trig_func.TrigFunctions;
import org.marakobz.trig_func.TrigSystem;

import static org.junit.Assert.*;

public class SystemFunctionTest {

    private static final double EPSILON = 1e-3;

    @Test
    public void testLn() {
        assertEquals(0.0, LogFunctions.ln(1.0, EPSILON), EPSILON);
        assertEquals(0.693147, LogFunctions.ln(2.0, EPSILON), EPSILON);
        assertEquals(1.098612, LogFunctions.ln(3.0, EPSILON), EPSILON);
        assertEquals(2.302585, LogFunctions.ln(10.0, EPSILON), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLnInvalidInput() {
        LogFunctions.ln(0.0, EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLnNegativeInput() {
        LogFunctions.ln(-1.0, EPSILON);
    }

    @Test
    public void testLog() {
        assertEquals(1.0, LogFunctions.log(10.0, 10.0, EPSILON), EPSILON);
        assertEquals(2.0, LogFunctions.log(100.0, 10.0, EPSILON), EPSILON);
        assertEquals(3.0, LogFunctions.log(1000.0, 10.0, EPSILON), EPSILON);
        assertEquals(0.0, LogFunctions.log(1.0, 10.0, EPSILON), EPSILON);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testLogInvalidInput() {
        LogFunctions.log(0.0, 10.0, EPSILON);
    }

    @Test
    public void testSin() {
        assertEquals(0.0, TrigFunctions.sin(0.0, EPSILON), EPSILON);
        assertEquals(1.0, TrigFunctions.sin(Math.PI / 2, EPSILON), EPSILON);
        assertEquals(0.0, TrigFunctions.sin(Math.PI, EPSILON), EPSILON);
        assertEquals(-1.0, TrigFunctions.sin(3 * Math.PI / 2, EPSILON), EPSILON);
        assertEquals(0.0, TrigFunctions.sin(2 * Math.PI, EPSILON), EPSILON);
    }

    @Test
    public void testCos() {
        assertEquals(1.0, TrigFunctions.cos(0.0, EPSILON), EPSILON);
        assertEquals(0.0, TrigFunctions.cos(Math.PI / 2, EPSILON), EPSILON);
        assertEquals(-1.0, TrigFunctions.cos(Math.PI, EPSILON), EPSILON);
        assertEquals(0.0, TrigFunctions.cos(3 * Math.PI / 2, EPSILON), EPSILON);
        assertEquals(1.0, TrigFunctions.cos(2 * Math.PI, EPSILON), EPSILON);
    }

    @Test
    public void testTrigSystem() {
        assertEquals(0.0, TrigSystem.compute(0.0, EPSILON), EPSILON);
        assertEquals(0.0, TrigSystem.compute(-Math.PI, EPSILON), EPSILON);
        assertEquals(0.0, TrigSystem.compute(-Math.PI / 2, EPSILON), EPSILON);
        assertEquals(0.0, TrigSystem.compute(-2 * Math.PI, EPSILON), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTrigSystemInvalidInput() {
        TrigSystem.compute(1.0, EPSILON);
    }

    @Test
    public void testLogSystem() {
        assertEquals(0.0, LogSystem.compute(1.0, EPSILON), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLogSystemInvalidInput() {
        LogSystem.compute(0.0, EPSILON);
    }

    @Test
    public void testSystemFunction() {
        assertEquals(0.0, SystemFunction.compute(0.0, EPSILON), EPSILON);
        assertEquals(0.0, SystemFunction.compute(-Math.PI, EPSILON), EPSILON);
        assertEquals(0.0, SystemFunction.compute(1.0, EPSILON), EPSILON);
    }


}