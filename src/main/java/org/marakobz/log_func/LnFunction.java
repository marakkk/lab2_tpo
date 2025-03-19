package org.marakobz.log_func;

public class LnFunction {
    public static double ln(double x, double epsilon) {
        if (x <= 0) throw new IllegalArgumentException("ln(x) определён только для x > 0");

        double y = (x - 1) / (x + 1);
        double term = y;
        double sum = 0;
        int n = 1;

        while (Math.abs(term) > epsilon) {
            sum += term / n;
            term *= y * y;
            n += 2;
        }
        return 2 * sum;
    }
}

