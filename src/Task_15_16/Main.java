package Task_15_16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;; i++) {
            int link = scanner.nextInt();
            if (link == -1) {
                break;
            }
            list.execution(link);
        }
    }
}
