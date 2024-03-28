import java.util.*;
public class codeforces_242_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] c = new int[x-a+1][y-b+1];
        int i = a;
        int j = b;
        int k = 0;
        while(i<=x && j<=y){
            c[k][0] = i;
            c[k][1] = j;
            i++;
            j++;
            k++;
        }
        System.out.println(k);
        for(int[] arr:c){
            for(int num:arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}