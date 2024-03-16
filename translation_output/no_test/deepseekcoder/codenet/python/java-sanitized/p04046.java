import java.util.Scanner;

public class p04046 {
    static long MOD = (long) Math.pow(10, 9) + 7;
    static long[] factorial;
    static long[] inv_factorial;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        factorial = new long[H+W+1];
        inv_factorial = new long[H+W+1];

        factorial[0] = 1;
        for (int i = 1; i <= H+W; i++) {
            factorial[i] = (factorial[i-1] * i) % MOD;
            inv_factorial[i] = pow(factorial[i], MOD-2);
        }

        long answer = 0;
        for (int i = B+1; i <= W+1; i++) {
            answer += f(H-A, i) * f(A, W-i+1);
            answer %= MOD;
        }

        System.out.println((int) answer);
    }

    static long f(int h, int w) {
        return (factorial[h+w-2] * inv_factorial[h-1] * inv_factorial[w-1]) % MOD;
    }

    static long pow(long a, long b) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            b /= 2;
        }
        return result;
    }
}