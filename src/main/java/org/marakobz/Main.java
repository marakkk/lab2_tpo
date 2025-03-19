package org.marakobz;

public class Main {
    public static void main(String[] args) {
        double startneg = -0.8;//-3.5;
        double endneg = 0; //-2.5;
        double startpos = 0.01;//2;
        double endpos = 0.75;//5;
        double step = 0.05;//0.5;
        double epsilon = 1e-5;

        String delimiter = ";";

        //CSVWriter.saveResults("sin.csv", start, end, step, delimiter, x -> TrigFunctions.sin(x, epsilon));
        //CSVWriter.saveResults("cos.csv", start, end, step, delimiter, x -> TrigFunctions.cos(x, epsilon));

        //CSVWriter.saveResults("log3.csv", step, end, step, delimiter, x -> safeLog(x, 3, epsilon));
        //CSVWriter.saveResults("log5.csv", step, end, step, delimiter, x -> safeLog(x, 5, epsilon));
        //CSVWriter.saveResults("log10.csv", step, end, step, delimiter, x -> safeLog(x, 10, epsilon));
        //CSVWriter.saveResults("ln.csv", step, end, step, delimiter, x -> safeLn(x, epsilon));

        CSVWriter.saveResults("system_neg.csv", startneg, endneg, step, delimiter, x -> SystemFunction.compute(x, epsilon));
        CSVWriter.saveResults("system_pos.csv", startpos, endpos, step, delimiter, x -> SystemFunction.compute(x, epsilon));


        //GraphPlot.plotGraph("sin.csv", "sin");
        //GraphPlot.plotGraph("cos.csv", "cos");
        //GraphPlot.plotGraph("log3.csv", "log3");
        //GraphPlot.plotGraph("log5.csv", "log5");
        //GraphPlot.plotGraph("log10.csv", "log10");
        //GraphPlot.plotGraph("ln.csv", "ln");
        GraphPlot.plotGraph("system_neg.csv");
        GraphPlot.plotGraph("system_pos.csv");
        //GraphPlot.plotGraphs("system_neg.csv","system_pos.csv", "system_log", "system_trig");
    }
}
