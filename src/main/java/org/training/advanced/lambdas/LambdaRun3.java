package org.training.advanced.lambdas;

public class LambdaRun3 {
    public static void main(String[] args) {
        LambdaRun3 lambdaRun3 = new LambdaRun3();
        IExecute execute1 = (o, t) -> "Executing " + o + " count : " + t;
        IExecute execute2 = LambdaRun3::xyz;
        System.out.println(execute2.execute("task1",
                                            5));
        IExecute execute3 = lambdaRun3::abc;
        System.out.println(execute3.execute("task2",
                                            10));
        IProcess process = () -> "Processing xyz";
    }

    public String abc(String x1,
                             Integer z1) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < z1; i++) {
            stringBuilder.append("görev : ")
                         .append(x1)
                         .append(" kere : ")
                         .append(i + 1)
                         .append("\n");

        }
        return stringBuilder.toString();
    }

    public static String xyz(String x1,
                             Integer z1) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < z1; i++) {
            stringBuilder.append("task : ")
                         .append(x1)
                         .append(" iterasyon : ")
                         .append(i + 1)
                         .append("\n");

        }
        return stringBuilder.toString();
    }
}

