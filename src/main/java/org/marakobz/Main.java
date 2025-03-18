package org.marakobz;

public class Main {
    public static void main(String[] args) {
        double start = -1; //0
        double end = 1; //5
        double step = 0.1;
        double epsilon = 1e-5;

        String delimiter = ";";

        CSVWriter.saveResults("results.csv", start, end, step, delimiter, x -> SystemFunction.compute(x, epsilon));

    }
}
