package org.training.advanced.lambdas;

public class ConsInherAllV2 extends ConsInherAll {

    private String task;
    private Integer count;
    private String name;

    public ConsInherAllV2(String task,
                          Integer count,
                          String name) {
        super(task,count,name);
    }

    @Override
    public String execute() {
        return "tasklar çalışıyor : " + task + ", kere " + count;
    }

}
