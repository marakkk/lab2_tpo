package org.marakobz.trig_func;

public class TrigSystem {
    public static double compute(double x, double epsilon) {
        if (x > 0) throw new IllegalArgumentException("Для x > 0 используется другая функция");

        double sinX = TrigFunctions.sin(x, epsilon);
        double cosX = TrigFunctions.cos(x, epsilon);

        if (Math.abs(sinX) < epsilon || Math.abs(cosX) < epsilon) {
            return 0.0;
        }
        double tanX = sinX / cosX;
        double result = Math.pow(Math.pow((tanX * tanX), 2) / sinX, 3);
        return Math.pow(result, 2);
    }
}