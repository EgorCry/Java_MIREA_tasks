package Task_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Colours obj = new Colours();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String colour = scanner.nextLine();
        obj.print(line, colour);
    }
}
