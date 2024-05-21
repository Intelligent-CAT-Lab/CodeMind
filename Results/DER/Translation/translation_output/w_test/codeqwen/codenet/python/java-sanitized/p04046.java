import java.util.Scanner;

public class p04046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

        long[] factorial = new long[H + W + 1];
        factorial[0] = 1;
        for (int i = 1; i <= H + W; i++) {
            factorial[i] = (factorial[i - 1] * i) % MOD;
        }

        long[] inv_factorial = new long[H + W + 1];
        inv_factorial[H + W] = pow(factorial[H + W], MOD - 2, MOD);
        for (int i = H + W - 1; i >= 0; i--) {
            inv_factorial[i] = (factorial[i] * inv_factorial[i + 1]) % MOD;
        }

        long answer = 0;
        for (int i = B + 1; i <= W; i++) {
            answer += f(H - A, i) * f(A, W - i + 1);
            answer %= MOD;
        }

        System.out.println(answer);
    }

    public static long pow(long base, long exponent, long mod) {
        long result = 1;
        base = base % mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1)
                result = (result * base) % mod;
            exponent = exponent >> 1;
            base = (base * base) % mod;
        }
        return result;
    }

    public static long f(int h, int w) {
        return (factorial[h + w - 2] * inv_factorial[h -