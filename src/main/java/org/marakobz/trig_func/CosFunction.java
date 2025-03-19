package org.marakobz.trig_func;

public class CosFunction {
    public static double cos(double x, double epsilon) {
        x = SinFunction.normalizeAngle(x);
        double term = 1;
        double sum = 1;
        int n = 1;

        while (Math.abs(term) > epsilon) {
            term *= -x * x / ((2 * n - 1) * (2 * n));
            sum += term;
            n++;
        }
        return sum;
    }
}
