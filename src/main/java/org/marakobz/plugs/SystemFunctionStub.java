package org.marakobz.plugs;

public class SystemFunctionStub {
    public static double compute(double x, double epsilon) {
        return x <= 0 ? TrigSystemStub.compute(x, epsilon) : LogSystemStub.compute(x, epsilon);
    }
}