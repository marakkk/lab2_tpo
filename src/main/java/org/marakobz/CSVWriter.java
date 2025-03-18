package org.marakobz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Function;

public class CSVWriter {
    public static void saveResults(String filename, double start, double end, double step, String delimiter, Function<Double, Double> function) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.append("X").append(delimiter).append("Result").append("\n");

            for (double x = start; x <= end; x += step) {
                double result = function.apply(x);
                writer.append(String.format("%f%s%f\n", x, delimiter, result));
            }

            System.out.println("Результаты сохранены в " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
