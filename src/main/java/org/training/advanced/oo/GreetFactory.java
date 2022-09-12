package org.training.advanced.oo;

public class GreetFactory {

    public static final int LANGUAGE_ENGLISH = 1;
    public static final int LANGUAGE_TURKISH = 2;
    public static final int LANGUAGE_SPANISH = 3;
    public static final int LANGUAGE_JAPANESE = 4;
    public static final int LANGUAGE_GERMAN = 5;


    public static IGreet createGreeting(int index){
        IGreet greet = null;
        switch (index) {
            case LANGUAGE_ENGLISH:
                greet = new GreetEng();
                break;
            case LANGUAGE_TURKISH:
                greet = new GreetTr();
                break;
            case LANGUAGE_SPANISH:
                greet = new GreetEsp();
                break;
            case LANGUAGE_JAPANESE:
                greet = new GreetJp();
                break;
            case LANGUAGE_GERMAN:
                greet = new GreetGerman();
                break;
            default:
                greet = new GreetEng();
                break;
        }
        return greet;
    }

    public static void writeMenuToConsole(){
        System.out.println(LANGUAGE_ENGLISH + "-English");
        System.out.println(LANGUAGE_TURKISH + "-Turkish");
        System.out.println(LANGUAGE_SPANISH + "-Spanish");
        System.out.println(LANGUAGE_JAPANESE + "-Japan");
        System.out.println(LANGUAGE_GERMAN + "-German");

    }
}
