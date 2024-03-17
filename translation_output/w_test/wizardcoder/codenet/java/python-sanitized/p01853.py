import java.io.*;
import java.util.*;

public class p01853 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n % 2 == 0) {
            System.out.print(0);
            for(int i = 1; i <= n / 2; i++) {
                System.out.print(" " + 0);
            }
            for(int i = n / 2 + 1; i < n; i++) {
                System.out.print(" " + m);
            }
        }
        else {
            System.out.print(0);
            for(int i = 1; i <= n / 2; i++) {
                System.out.print(" " + 0);
            }
            for(int i = n / 2 + 1; i < n; i++) {
                System.out.print(" " + m);
            }
        }
        System.out.println();
    }
}