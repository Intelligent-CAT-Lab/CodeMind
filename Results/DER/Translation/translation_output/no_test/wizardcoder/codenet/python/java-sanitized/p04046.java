import java.util.*;
import java.math.*;

public class p04046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

        long[] factorial = new long[H+W+1];
        long[] inv_factorial = new long[H+W+1];

        factorial[0] = 1;
        inv_factorial[0] = 1;

        for (int i = 1; i <= H+W; i++) {
            factorial[i] = (factorial[i-1] * i) % MOD;
            inv_factorial[i] = pow(factorial[i], MOD-2, MOD);
        }

        long f(int h, int w) {
            return (factorial[h+w-2] * inv_factorial[h-1] * inv_factorial[w-1]) % MOD;
        }

        long answer = 0;
        for (int i = B+1; i <= W; i++) {
            answer += f(H-A, i) * f(A, W-i+1);
            answer %= MOD;
        }

        System.out.println(answer);
    }

    public static long pow(long a, long b, long mod) {
        if (b == 0) return 1;
        if (b % 2 == 0) {
            long res = pow(a, b/2, mod);
            return (res * res) % mod;
        } else {
            return (a * pow(a, b-1, mod)) % mod;
        }
    }
}