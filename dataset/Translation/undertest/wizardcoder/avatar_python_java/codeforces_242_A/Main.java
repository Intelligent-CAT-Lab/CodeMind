import java.util.*;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] c = new int[x-a+1][y-b+1];
        int count = 0;
        for(int i=a;i<=x;i++){
            for(int j=b;j<=y;j++){
                if(i>j){
                    c[i-a][j-b] = count;
                    count++;
                }
            }
        }
        System.out.println(count);
        for(int i=0;i<x-a+1;i++){
            for(int j=0;j<y-b+1;j++){
                if(c[i][j]!=0){
                    System.out.println(c[i][j]+" "+(i+a)+" "+(j+b));
                }
            }
        }
    }
}