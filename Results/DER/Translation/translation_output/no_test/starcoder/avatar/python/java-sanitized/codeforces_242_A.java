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
        for(int k = 0; k < c.length; k++){
            for(int l = 0; l < c[0].length; l++){
                c[k][l] = i;
                i++;
            }
        }
        System.out.println(c.length);
        for(int k = 0; k < c.length; k++){
            for(int l = 0; l < c[0].length; l++){
                System.out.print(c[k][l]+" ");
            }
            System.out.println();
        }
    }
}