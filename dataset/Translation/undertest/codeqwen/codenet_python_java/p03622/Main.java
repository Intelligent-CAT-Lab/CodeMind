import java.util.Scanner;

public class p03622 {
    public static void main(String[] args) {
        long M = (long) Math.pow(8, 7);
        long m = M * 476 + 1;
        long[] f = new long[M];
        long[] g = new long[M];
        long i = 1;
        f[0] = 1;
        g[0] = 1;
        while (i < M) {
            f[i] = (f[i - 1] * i) % m;
            i++;
        }
        g[M - 1] = (long) Math.pow(M * f[M - 1], m - 2, m);
        for (i = M - 2; i >= 0; i--) {
            g[i] = (g[i + 1] * (i + 1)) % m;
        }
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        if (A < B) {
            long temp = A;
            A = B;
            B = temp;
        }
        long j = 1;
        long k = 1;
        long i1 = 0;
        while (j <= B) {
            i1 += k * f[A + B - j] * g[B - j];
            k = (k * 2) % m;
            j++;
        }
        System.out.println((i1 * f[B] * g[A + B] + A) % m);
    }
}