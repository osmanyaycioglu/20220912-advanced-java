package org.training.advanced.lambdas;

public class LambdaRun1 {
    public static void main(String[] args) {
        String str = "Mr";
        IHello helloMale = new HelloEng(str);

        IHello hello2 = new IHello() {
            @Override
            public String sayHello(String name) {
                return "hello " + str + " " + name;
            }
        };

        IHello hello3 = a -> "hello " + str + " " + a;

        IHello hello4 = a1 -> {
            System.out.println("running");
            return "hello " + str + " " + a1;
        };
        System.out.println(hello3.sayHello("osman"));
        System.out.println(hello4.sayHello("osman"));

        IExecute execute1 = (o,t) -> "Executing " + o + " count : " + t;

        IProcess process = () -> "Processing xyz";
    }
}

