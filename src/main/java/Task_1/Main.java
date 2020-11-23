package Task_1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int fact(int number){
        int result = 1;
        for(int k=1; k <= number; k++){
            result *= k;
        }
        return result;
    }

    public static void main(String[] args) {
        //Программа для вывода суммы в массиве
        int[] massive = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int s1 = 0, s2 = 0, s3 = 0;
        for (int i = 0; i < massive.length; i++) {
            s1 += massive[i];
        }
        int i = 0;
        while (i < massive.length) {
            s2 += massive[i];
            i++;
        }
        i = 0;
        do {
            s3 += massive[i];
            i++;
        } while (i < massive.length);
        System.out.println("Сумма элементов массива");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //Программа для вывода аргументов командной строки
        for (i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        //Гармонический ряд
        for (i = 1; i < 11; i++) {
            System.out.format("%.3f", (double) 1 / i);
            System.out.print(" ");
        }
        System.out.println();
        //Рандомный массив с рандомными числами
        int size_m = (int) (Math.random() * (20) + 1) + 5;
        int[] massive_r = new int[size_m];
        Random number = new Random();
        for (i = 0; i < size_m; i++) {
            int r = number.nextInt((100) + 1) + 1;
            massive_r[i] = r;
        }
        for (i=0; i<size_m; i++){
            System.out.print(massive_r[i] + " ");
        }
        Arrays.sort(massive_r);
        System.out.println();
        for(i=0;i<size_m;i++){
            System.out.print(massive_r[i] + " ");
        }
        //Факториал
        int factorial = (int)(Math.random()*(10)+1)+1;
        System.out.println();
        System.out.println(fact(factorial));
    }
}