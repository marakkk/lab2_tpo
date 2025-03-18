package org.marakobz.plugs;

public class LogFunctionsStub {
    public static double ln(double x, double epsilon) {
        return Math.log(x);
    }

    public static double log(double x, double base, double epsilon) {
        return Math.log(x) / Math.log(base);
    }
}
