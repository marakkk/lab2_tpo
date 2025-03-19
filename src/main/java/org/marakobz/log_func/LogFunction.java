package org.marakobz.log_func;

public class LogFunction {
    public static double log(double x, double base, double epsilon) {
        return LnFunction.ln(x, epsilon) / LnFunction.ln(base, epsilon);
    }
}

