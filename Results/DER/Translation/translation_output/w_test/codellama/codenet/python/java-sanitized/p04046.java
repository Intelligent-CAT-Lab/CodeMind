import java.util.Scanner;

public class p04046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int MOD = 1000000007;

        long[] factorial = new long[H+W+1];
        factorial[0] = 1;
        for (int i = 1; i <= H+W; i++) {
            factorial[i] = (factorial[i-1] * i) % MOD;
        }

        long[] invFactorial = new long[H+W+1];
        invFactorial[0] = 1;
        for (int i = 1; i <= H+W; i++) {
            invFactorial[i] = (invFactorial[i-1] * i) % MOD;
        }

        long answer = 0;
        for (int i = B+1; i <= W; i++) {
            answer += (factorial[H-A+W-i] * invFactorial[H-A] * invFactorial[W-i+1]) % MOD;
            answer %= MOD;
        }

        System.out.println(answer);
    }
}