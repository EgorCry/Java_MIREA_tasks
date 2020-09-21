package Additional_Task_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c = 0;
        for(int j=0; j<=(a/3); j++){
            for(int k=0; k<=(a/3); k++){
                if(3*j+5*k>a){
                    break;
                }
                else{
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}