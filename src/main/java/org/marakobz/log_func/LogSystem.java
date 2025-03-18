package org.marakobz.log_func;

public class LogSystem {
    public static double compute(double x, double epsilon) {
        if (x <= 0) throw new IllegalArgumentException("Для x <= 0 используется другая функция");

        double log3 = LogFunctions.log(x, 3, epsilon);
        double log5 = LogFunctions.log(x, 5, epsilon);
        double log10 = LogFunctions.log(x, 10, epsilon);
        double lnX = LogFunctions.ln(x, epsilon);


        if (Math.abs(log10) < epsilon || Math.abs(lnX) < epsilon) {
            return 0.0;
        }

        double part1 = (((log3 + log5) * log5) - log3) - (lnX / log10);
        double part2 = ((lnX / lnX) - log3) + log10;

        return part1 + part2;
    }
}