import java.util.*;

public class p04046 {
    static int MOD = 100000007;
    static long[] factorial;
    static long[] inv_factorial;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        factorial = new long[H+W+1];
        inv_factorial = new long[H+W+1];

        factorial[0] = 1;
        inv_factorial[0] = 1;

        for (int i = 1; i <= H+W; i++) {
            factorial[i] = (factorial[i-1] * i) % MOD;
            inv_factorial[i] = pow(factorial[i], MOD-2, MOD);
        }

        long answer = 0;
        for (int i = B+1; i <= W; i++) {
            answer += f(H-A, i) * f(A, W-i+1);
            answer %= MOD;
        }

        System.out.println(answer);
    }

    static long f(int h, int w) {
        return (factorial[h+w-2] * inv_factorial[h-1] * inv_factorial[w-1]) % MOD;
    }

    static long pow(long a, long b, long m) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b /= 2;
        }
        return result;
    }
}