package org.marakobz;

import org.marakobz.log_func.LogSystem;
import org.marakobz.trig_func.TrigSystem;

public class SystemFunction {
    public static double compute(double x, double epsilon) {
        if (x < 0) {
            return TrigSystem.compute(x, epsilon);
        } else if (x == 0) {
            return 0.0;
        } else if (x > 0) {
            return LogSystem.compute(x, epsilon);
        } else {
            throw new IllegalArgumentException("Invalid input: x must be a real number");
        }
    }
}