import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

public class p02826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MOD = sc.nextInt();

        int[] f = new int[N + N + 10];
        for (int x = 1; x <= N / 2; x++) {
            f[x::x] += 2 * inv[1:(len(f) - 1) / x + 1];
        }
        if (N & 1) {
            int x = (N + 1) / 2;
            f[x::x] += inv[1:(len(f) - 1) / x + 1];
        }

        int[] g = fps_exp(f);
        int answer = g[:N].sum() % MOD;
        System.out.println(answer);
    }

    public static int[] inv;

    public static int[] cumprod(int[] A, int MOD) {
        int L = A.length;
        int Lsq = (int) Math.sqrt(L) + 1;
        A = Arrays.copyOf(A, Lsq * Lsq);
        for (int n = 1; n < Lsq; n++) {
            A[:, n] *= A[:, n - 1];
            A[:, n] %= MOD;
        }
        for (int n = 1; n < Lsq; n++) {
            A[n] *= A[n