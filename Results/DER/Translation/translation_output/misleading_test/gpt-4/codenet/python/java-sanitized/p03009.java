import java.util.Scanner;

public class p03009 {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int H = scanner.nextInt();
        int D = scanner.nextInt();

        int[] fact = new int[N+1];
        int[] fact_cum = new int[N+1];
        fact[0] = 1;
        fact_cum[0] = 0;

        for (int i = 1; i <= N; i++) {
            fact[i] = (int)((fact[i-1] * (long)i) % MOD);
            fact_cum[i] = (fact_cum[i-1] + fact[i]) % MOD;
        }

        int[] ap = new int[H+1];
        int[] ap_cum = new int[H+1];
        ap[0] = 1;
        ap_cum[0] = 1;

        for (int n = 1; n <= H; n++) {
            int x = ap_cum[n-1];
            if (n > D) {
                x -= ap_cum[n-D-1];
                if (x < 0) x += MOD;
            }
            x = (int)((x * (long)fact_cum[N]) % MOD);
            ap[n] = x;
            ap_cum[n] = (ap_cum[n-1] + x) % MOD;
        }

        int ans = ap[H];
        ans = (int)((ans * (long)fact[N]) % MOD);
        ans = (int)((ans * (long)modularExponentiation(fact_cum[N], MOD-2)) % MOD);

        System.out.println(ans);

        scanner.close();
    }

    // Function to perform modular exponentiation
    static int modularExponentiation(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        long result = modularExponentiation(base, exponent / 2);
        result = (result * result) % MOD;
        if (exponent % 2 == 1) {
            result = (result * base) % MOD;
        }
        return (int) result;
    }
}