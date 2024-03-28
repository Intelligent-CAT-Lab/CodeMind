import java.util.Scanner;

public class p04046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int MOD = 1000000007;

        long[] factorial = new long[H+W+1];
        factorial[0] = 1;
        for (int i = 1; i <= H+W; i++) {
            factorial[i] = (factorial[i-1] * i) % MOD;
        }

        long[] inv_factorial = new long[H+W+1];
        inv_factorial[0] = 1;
        for (int i = 1; i <= H+W; i++) {
            inv_factorial[i] = (inv_factorial[i-1] * i) % MOD;
        }

        long answer = 0;
        for (int i = B+1; i <= W; i++) {
            answer += (factorial[H-A+W-i] * inv_factorial[H-A] * inv_factorial[W-i+1]) % MOD;
            answer %= MOD;
        }

        System.out.println(answer);
    }
}