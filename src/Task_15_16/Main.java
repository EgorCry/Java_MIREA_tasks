package Task_15_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List list = new List();
        int step;
        int state = 1;
        int newState = 1;

        for (int i = 0;; i++) {
            step = scanner.nextInt();
            if(step == -1){
                break;
            }
            if (state == 1){
                if(step == 0){
                    newState = 2;
                    list.add(1);
                }
                else {
                    newState = 5;
                    list.add(2);
                }
            }
            else if (state == 2){
                if(step == 0){
                    newState = 3;
                    list.add(4);
                }
                else {
                    newState = 4;
                    list.add(6);
                }
            }
            else if (state == 3){
                if(step == 0){
                    newState = 4;
                    list.add(6);
                }
                else {
                    newState = 5;
                    list.add(2);
                }
            }
            else if (state == 4){
                if(step == 0){
                    newState = 3;
                    list.add(3);
                }
                else {
                    newState = 5;
                    list.add(5);
                }
            }
            else if (state == 5) {
                if (step == 0) {
                    newState = 1;
                    list.add(5);
                } else {
                    newState = 3;
                    list.add(3);
                }
            }
            state = newState;
        }

        list.print();
    }
}
