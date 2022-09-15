package org.training.advanced.lambdas;

public class LambdaRun2 {
    public static void main(String[] args) {
        IConsolidate consolidate = new ConsAll("task1",10,"osman");
        consolidate.execute((t,c) -> "task : " + t + ", kere " + c);
        consolidate.execute((t,c) -> "tasklar " + t + " çalıştırılıyor " + c);
        consolidate.execute((t,c) -> {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < c; i++) {
                stringBuilder.append("task : ");
                stringBuilder.append(t);
                stringBuilder.append(i);
                stringBuilder.append("çalıştırıldı");
            }
            return stringBuilder.toString();
        });

    }
}

