package org.marakobz.trig_func;

public class SinFunction {
    public static double sin(double x, double epsilon) {
        x = normalizeAngle(x);
        double term = x;
        double sum = x;
        int n = 1;

        while (Math.abs(term) > epsilon) {
            term *= -x * x / ((2 * n) * (2 * n + 1));
            sum += term;
            n++;
        }
        return sum;
    }

    static double normalizeAngle(double x) {
        while (x > Math.PI) x -= 2 * Math.PI;
        while (x < -Math.PI) x += 2 * Math.PI;
        return x;
    }
}