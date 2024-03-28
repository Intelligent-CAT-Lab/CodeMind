import java.util.*;
import java.io.*;

public class p04046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int MOD = 1000000007;

        long[] factorial = new long[H+W+1];
        long[] inv_factorial = new long[H+W+1];

        factorial[0] = 1;
        inv_factorial[0] = 1;

        for (int i = 1; i <= H+W; i++) {
            factorial[i] = factorial[i-1] * i % MOD;
            inv_factorial[i] = pow(factorial[i], MOD-2, MOD);
        }

        long answer = 0;
        for (int i = B+1; i <= W; i++) {
            answer += factorial[H-A] * inv_factorial[i-1] * inv_factorial[W-i+1];
            answer %= MOD;
        }

        System.out.println(answer);
    }

    public static long pow(long a, long b, long mod) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans = ans * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return ans;
    }
}