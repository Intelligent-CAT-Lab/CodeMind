import java.util.Scanner;

public class p03365 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] fact = new int[n + 1];
        int[] ifact = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            ifact[i] = (int) Math.pow(fact[i], MOD - 2);
        }

        int ans = 0;
        int c0 = 0;
        for (int i = n / 2; i < n; i++) {
            int c1 = (nCk(i - 1, n - 1 - i) * fact[i] * fact[n - i - 1] - c0 + MOD) % MOD;
            ans = (ans + c1 * i) % MOD;
            c0 = (c0 + c1) % MOD;
        }

        System.out.println(ans);
    }

    public static int nCk(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        return (fact[n] * ifact[n - k] * ifact[k]) % MOD;
    }
}