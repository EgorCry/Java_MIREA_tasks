package Task_12;

public class Colours {
    public static final String reset = "\u001B[0m";
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String yellow = "\u001B[33m";
    public static final String blue = "\u001B[34m";
    public static final String purple = "\u001B[35m";
    public static final String cyan = "\u001B[36m";
    public static final String white = "\u001B[37m";

    public void print(String line, String colour){
        switch(colour){
            case ("red"):
                System.out.println(red + line + reset);
                break;
            case ("green"):
                System.out.println(green + line + reset);
                break;
            case ("yellow"):
                System.out.println(yellow + line + reset);
                break;
            case ("blue"):
                System.out.println(blue + line + reset);
                break;
            case ("purple"):
                System.out.println(purple + line + reset);
                break;
            case ("cyan"):
                System.out.println(cyan + line + reset);
                break;
            case ("white"):
                System.out.println(white + line + reset);
                break;
        }
    }
}
