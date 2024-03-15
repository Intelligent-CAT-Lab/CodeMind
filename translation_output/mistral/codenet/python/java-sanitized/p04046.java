import java.util.*;

public class p04046 {
    static int H, W, A, B;
    static long MOD = 1000000007;

    static long factorial[] = new long[H + W + 1];
    static long inv_factorial[] = new long[H + W + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();

        Arrays.fill(factorial, 1);
        Arrays.fill(inv_factorial, 1);

        for (int i = 1; i <= H + W; i++) {
            factorial[i] = factorial[i - 1] * i % MOD;
            inv_factorial[i] = pow(factorial[i - 1], MOD - 2, MOD);
        }

        long answer = 0;
        for (int i = B + 1; i <= W; i++) {
            answer += (factorial[H - A + i] * inv_factorial[H - 1] * inv_factorial[i - 1]) % MOD;
            answer %= MOD;
        }

        System.out.println(answer);
    }
}