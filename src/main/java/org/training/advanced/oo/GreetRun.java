package org.training.advanced.oo;

import java.util.Scanner;

public class GreetRun {

    public static final int NAME_LENGTH_LIMIT = 5;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dil Seçiniz : ");
        GreetFactory.writeMenuToConsole();
        System.out.println("Seçiniz : ");
        int index = scanner.nextInt();
        IGreet greet = GreetFactory.createGreeting(index);
        System.out.println("İsminizi giriniz : ");
        String name = scanner.next();
        if (name.length() > NAME_LENGTH_LIMIT) {
            System.out.println(greet.sayHello(name));
            System.out.println(greet.sayGoodbye(name));
        }
    }

    public static void main(String[] args) {
        GreetRun greetRun = new GreetRun();
        greetRun.run();
    }
}
