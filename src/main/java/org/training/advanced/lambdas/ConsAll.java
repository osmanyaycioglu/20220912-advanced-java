package org.training.advanced.lambdas;

public class ConsAll implements IConsolidate{

    private String task;
    private Integer count;
    private String name;

    public ConsAll(String task,
                   Integer count,
                   String name) {
        this.task = task;
        this.count = count;
        this.name = name;
    }

    @Override
    public String execute(IExecute execute) {
        return execute.execute(task,count);
    }

    @Override
    public String process(IProcess process) {
        return process.exec();
    }

    @Override
    public String sayHello(IHello hello) {
        return hello.sayHello(name);
    }
}
