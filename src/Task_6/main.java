package Task_6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] massive = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0;j<N;j++){
                massive[i][j] = scanner.nextInt();
            }
        }
        int max = 0;
        int k=0;
        int max_x = 0, max_y = 0;
        for (int i=0; i<N; i++){
            for(int j=0;j<N;j++){
                if(k==1){
                    j--;
                    k=0;
                }
                max_x = massive[i][j];
                max_y = massive[i][j];
                max += massive[i][j];
                for(int y=i;y<N;y++){
                    for(int x=j;x<j+1;x++){
                        if(massive[x][y]>max_y){
                            max_y = massive[x][y];
                        }
                    }
                }
                for(int y=i;y<i+1;y++){
                    for(int x=j;x<N;x++){
                        if(massive[x][y]>max_x){
                            max_x = massive[x][y];
                        }
                    }
                }
                System.out.println(i + " " + j);
                System.out.println(max_x + " " + max_y);
                if(max_y>=max_x){
                    k=1;
                    i+=1;
                }
            }
        }
        System.out.println(max);
    }
}
