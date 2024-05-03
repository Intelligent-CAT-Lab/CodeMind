import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int aa = sc.nextInt();
        int bb = sc.nextInt();
        int a = Math.max(aa, bb);
        int b = Math.min(aa, bb);
        int p = 1000000007;
        int[] xs0 = new int[n + 1];
        int[] os0 = new int[n + 1];
        os0[0] = 1;
        for (int i = b; i < a - 1; i++) {
            for (int j = b; j <= i; j++) {
                xs0[i] = (xs0[i] + os0[i - j]) % p;
            }
            for (int j = 1; j <= i; j++) {
                os0[i] = (os0[i] + xs0[i - j]) % p;
            }
        }
        int[] os = new int[a];
        for (int i = b; i < a - 2; i++) {
            for (int j = 2; j <= a - i; j++) {
                os[i + j] = (os[i + j] + xs0[i]) * (j - 1);
                os[i + j] %= p;
            }
        }
        int[] x = new int[n + 1];
        int[] o = new int[n + 1];
        x[0] = 1;
        o[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(b, i + 1); j++) {
                x[i] = (x[i] + o[i - j]) % p;
            }
            for (int j = 1; j <= Math.min(a, i + 1