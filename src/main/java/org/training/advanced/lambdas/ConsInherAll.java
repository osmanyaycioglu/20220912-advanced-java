package org.training.advanced.lambdas;

public class ConsInherAll {

    private String task;
    private Integer count;
    private String name;

    public ConsInherAll(String task,
                        Integer count,
                        String name) {
        this.task = task;
        this.count = count;
        this.name = name;
    }

    public String execute() {
        return "task : " + task + ", kere " + count;
    }

    public String process() {
        return "Processing tasks " + count;
    }

    public String sayHello() {
        return "hello " + name;
    }
}
