import java.util.Scanner;
import java.math.BigInteger;

public class p02826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MOD = sc.nextInt();

        BigInteger[] f = new BigInteger[N + N + 10];
        for (int x = 1; x <= N / 2; x++) {
            f[x::x] += 2 * inv[1:(len(f) - 1) / x + 1];
        }
        if (N & 1) {
            int x = (N + 1) / 2;
            f[x::x] += inv[1:(len(f) - 1) / x + 1];
        }

        BigInteger[] g = fps_exp(f);
        BigInteger answer = g[:N].sum() % MOD;
        System.out.println(answer);
    }

    public static BigInteger[] fps_exp(BigInteger[] h) {
        int L = h.length;
        int i = (L - 1).bit_length();
        int N = (1 << i);
        h = Arrays.copyOf(h, N);
        BigInteger[] dh = new BigInteger[N - 1];
        dh[0:N - 1] = h[1:N] * BigInteger.valueOf(i).mod(MOD);
        BigInteger[] f = new BigInteger[N];
        BigInteger[] g = new BigInteger[N];
        f[0] = BigInteger.ONE;
        g[0] = BigInteger.ONE;
        int m = 2;
        while (m <= N / 2) {
            BigInteger[] fg = fft_convolve(f, g, MOD);