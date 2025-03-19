package org.marakobz.trig_func;

public class TrigSystem {
    public static double compute(double x, double epsilon) {
        if (x > 0) throw new IllegalArgumentException("Для x > 0 используется другая функция");

        double sinX = SinFunction.sin(x, epsilon);
        double cosX = CosFunction.cos(x, epsilon);

        if (Math.abs(sinX) < epsilon || Math.abs(cosX) < epsilon) {
            return 0.0;
        }
        double tanX = sinX / cosX;
        double numerator = Math.pow(tanX * tanX, 2);
        double denominator = sinX;
        double result = Math.pow(numerator / denominator, 3);
        return Math.pow(result, 2);
    }
}
