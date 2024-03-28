import java.util.Scanner;
import java.math.BigInteger;

public class p04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;

        BigInteger[] power2 = new BigInteger[N + M];
        BigInteger[] power2_inv = new BigInteger[N + M];
        BigInteger[] power3 = new BigInteger[N + M];
        BigInteger[] power3_inv = new BigInteger[N + M];
        BigInteger[] fact = new BigInteger[N + M];
        BigInteger[] fact_inv = new BigInteger[N + M];

        for (int i = 0; i < N + M; i++) {
            power2[i] = BigInteger.valueOf(2).pow(i);
            power2_inv[i] = BigInteger.valueOf(2).pow(MOD - 2).mod(MOD);
            power3[i] = BigInteger.valueOf(3).pow(i);
            power3_inv[i] = BigInteger.valueOf(3).pow(MOD - 2).mod(MOD);
            fact[i] = BigInteger.valueOf(i).mod(MOD);
            fact_inv[i] = BigInteger.valueOf(i).mod(MOD);
        }

        BigInteger[] x = new BigInteger[N + M];
        for (int i = 1; i < N + M; i++) {
            x[i] = (-1) * power2[i - 1].multiply(power3_inv[K + i]).mod(MOD);
        }
        x[0] = 3 * (1 - power3_inv[K + 1]).mod(MOD) * power2_inv[1].mod(MOD);

        BigInteger[] coef = new BigInteger[N + M];
        for (int i = N - 1; i < N + M; i++) {
            coef[i] = fact[i].multiply(fact_inv[K]).mod(MOD);
        }
        coef[0] = 1;

        BigInteger answer = BigInteger.ZERO;
        for (int i = 0; i < N + M; i++) {
            answer = answer.add(coef[i].multiply(x[i]).mod(MOD));
        }
        System.out.println(answer.mod(MOD));
    }
}