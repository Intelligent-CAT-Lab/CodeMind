import java.util.*;
import java.io.*;

public class p03134 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int mod = 998244353;

        int[] lis = new int[2*N+1];
        lis[0] = 1;
        int R = 0;
        int B = 0;

        int c = 0;
        for (int i = 0; i < N; i++) {
            char n = S.charAt(i);
            if (n == '0') {
                R += 2;
            } else if (n == '1') {
                R += 1;
                B += 1;
            } else {
                B += 2;
            }

            int[] nlis = new int[2*N+1];
            for (int j = 0; j < 2*N; j++) {
                if (j < R) {
                    nlis[j+1] += lis[j];
                    nlis[j+1] %= mod;
                }
                if (c-j < B) {
                    nlis[j] += lis[j];
                    nlis[j] %= mod;
                }
            }
            lis = nlis;
            c += 1;
        }

        for (int loop = 0; loop < N; loop++) {
            int[] nlis = new int[2*N+1];
            for (int j = 0; j < 2*N; j++) {
                if (j < R) {
                    nlis[j+1] += lis[j];
                    nlis[j+1] %= mod;
                }
                if (c-j < B) {
                    nlis[j] += lis[j];
                    nlis[j] %= mod;
                }
            }
            lis = nlis;
            c += 1;
        }

        System.out.println(Arrays.stream(lis).sum() % mod);
    }
}