import java.util.*;
import java.lang.*;
import java.io.*;

public class p01821 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c = 1;
        for(int i = 2; i <= N; i++) {
            if(gcd(i, N) == 1) {
                c = i;
                break;
            }
        }
        int k = 1;
        for(int i = 0; i < N; i++) {
            k = (k * N) % c;
            if(k == 1) {
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(-1);
    }
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}