import java.util.Scanner;

public class p02654 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        System.out.println(solve(n, a));
    }

    public static int[] prepare(int n, int MOD) {
        int[] factorials = new int[n + 1];
        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorials[i] = (factorials[i - 1] * i) % MOD;
        }
        int[] finvs = new int[n + 1];
        finvs[n] = pow(factorials[n], MOD - 2, MOD);
        for (int i = n - 1; i >= 0; i--) {
            finvs[i] = (finvs[i + 1] * (i + 1)) % MOD;
        }
        return finvs;
    }

    public static int solve(int n, int a) {
        int MOD = 1000000007;
        int[] finvs = prepare(n, MOD);
        int[] invs = new int[n + 1];
        invs[0] = 1;
        for (int i = 1; i <= n; i++) {
            invs[i] = (factorials[i - 1] * finvs[i]) % MOD;
        }
        int r = n - a;

        int ans = 0;
        // aåãããããèªå·±ã«ã¼ããæããªããã¿ã¼ã³
        for (int l = 0; l < a; l++) {
            int tmp1 = (factorials[a] * finvs[l]) % MOD * fin