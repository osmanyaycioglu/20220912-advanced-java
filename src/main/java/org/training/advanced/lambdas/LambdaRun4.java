package org.training.advanced.lambdas;

import java.util.function.*;

public class LambdaRun4 {
    public static void main(String[] args) {
        Consumer<String> consumer1 = s -> System.out.println(s);
        Consumer<String> consumer2 = System.out::println;
        Consumer<Integer> consumer3 = i -> System.out.println("sonuç : " + i);
        IntConsumer consumer4 = i -> System.out.println("sonuç : " + i);
        BiConsumer<String,Integer> biConsumer1 = (s,i) -> System.out.println("sonuç " + s + " " + i );

        Function<Integer,String> function1 = i -> "sonuç : " + i;
        Function<String,Integer> function2 = Integer::parseInt;
        Function<String,Integer> function3 = s -> s.length();
        BiFunction<Integer,Integer,Integer> biFunction = (i1,i2) -> i1 + i2;
        UnaryOperator<String> unaryOperator = s -> s + " test";
        Function<String,String> unaryOperator2 = s -> s + " test";
        BinaryOperator<Integer> biFunction2 = (i1,i2) -> i1 + i2;
        BinaryOperator<Double> calc1 = (d1,d2) -> d1 + d2;

        Predicate<Integer> predicate = i -> i > 10;
        BiPredicate<Integer,Integer> biPredicate = (i1,i2) -> i1 > i2;

        Supplier<String> supplier1 = () -> "osman";
    }

}

