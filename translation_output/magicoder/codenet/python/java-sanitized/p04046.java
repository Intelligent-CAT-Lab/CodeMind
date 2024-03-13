import java.util.*;

public class p04046 {
    static long MOD = 1000000007;
    static long[] factorial = new long[200001];
    static long[] inv_factorial = new long[200001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        factorial[0] = 1;
        inv_factorial[0] = 1;

        for (int i = 1; i <= H + W; i++) {
            factorial[i] = (factorial[i - 1] * i) % MOD;
            inv_factorial[i] = pow(factorial[i], MOD - 2, MOD);
        }

        long answer = 0;
        for (int i = B + 1; i <= W; i++) {
            answer += (f(H - A, i) * f(A, W - i + 1)) % MOD;
            answer %= MOD;
        }

        System.out.println((int) answer);
    }

    static long f(int h, int w) {
        return (factorial[h + w - 2] * inv_factorial[h - 1] * inv_factorial[w - 1]) % MOD;
    }

    static long pow(long a, long b, long m) {
        long p = 1, q = a;
        for (; b > 0; b /= 2) {
            if (b % 2 == 1) {
                p = (p * q) % m;
            }
            q = (q * q) % m;
        }
        return p;
    }
}