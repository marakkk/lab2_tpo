package org.marakobz.trig_func;

public class TrigFunctions {
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

    public static double cos(double x, double epsilon) {
        x = normalizeAngle(x);
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

    private static double normalizeAngle(double x) {
        while (x > Math.PI) x -= 2 * Math.PI;
        while (x < -Math.PI) x += 2 * Math.PI;
        return x;
    }
}
