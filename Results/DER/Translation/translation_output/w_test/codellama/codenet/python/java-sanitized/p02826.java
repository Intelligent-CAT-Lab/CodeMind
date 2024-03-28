import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

public class p02826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MOD = sc.nextInt();

        BigInteger[] inv = new BigInteger[N];
        inv[1] = BigInteger.ONE;
        for (int i = 2; i < N; i++) {
            inv[i] = inv[i - 1].multiply(BigInteger.valueOf(MOD - i)).mod(BigInteger.valueOf(MOD));
        }

        BigInteger[] f = new BigInteger[N + N + 10];
        for (int x = 1; x <= N / 2; x++) {
            f[x::x] += 2 * inv[1:(f.length - 1) / x + 1];
        }
        if (N % 2 == 1) {
            int x = (N + 1) / 2;
            f[x::x] += inv[1:(f.length - 1) / x + 1];
        }

        BigInteger[] g = fps_exp(f);
        BigInteger answer = g[0].add(g[1]).mod(BigInteger.valueOf(MOD));
        System.out.println(answer);
    }

    public static BigInteger[] fps_exp(BigInteger[] h) {
        int L = h.length;
        int i = (L - 1).bitLength();
        int N = 1 << i;
        h