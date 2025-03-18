package org.marakobz.plugs;

public class SystemFunctionStub {
    public static double compute(double x, double epsilon) {
        return x <= 0 ? TrigFunctionsStub.sin(x, epsilon) : LogFunctionsStub.ln(x, epsilon);
    }
}
