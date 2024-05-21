import java.util.Arrays;
import java.util.Scanner;

public class p04004 {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        long[] fact = new long[N + M + 1];
        fact[0] = 1;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        long[] factInv = new long[N + M + 1];
        factInv[fact.length - 1] = pow(fact[fact.length - 1], MOD - 2, MOD);
        for (int i = fact.length - 2; i >= 0; i--) {
            factInv[i] = (factInv[i + 1] * (i + 1)) % MOD;
        }

        long[] power2 = new long[N + M + 1];
        power2[0] = 1;
        for (int i = 1; i < power2.length; i++) {
            power2[i] = (power2[i - 1] * 2) % MOD;
        }

        long[] power2Inv = new long[N + M + 1];
        power2Inv[power2.length - 1] = pow(power2[power2.length - 1], MOD - 2, MOD);
        for (int i = power2.length - 2; i >= 0; i--) {
            power2Inv[i] = (power2Inv[i + 1] * (i + 1)) % MOD;
        }

        long[] power3 = new long[N + M + 1];
        power3[0] = 1;
        for (int i = 1; i < power3.length; i++)