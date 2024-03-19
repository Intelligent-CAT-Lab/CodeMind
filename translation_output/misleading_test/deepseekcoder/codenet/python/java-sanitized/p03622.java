import java.util.Scanner;

public class p03622 {
    public static void main(String[] args) {
        final long M = (long) Math.pow(8, 7);
        long m = M * 476 + 1;
        long[] f = new long[(int) m + 1];
        f[0] = 1;
        long i = 1;
        while (i < m) {
            f[(int) i] = f[(int) i - 1] * i % m;
            i++;
        }
        long[] g = new long[(int) m + 1];
        g[(int) m] = (long) Math.pow(M * f[(int) m - 1], m - 2) % m;
        i = m - 1;
        while (i > 0) {
            g[(int) i - 1] = g[(int) i] * i % m;
            i--;
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
        i = 0;
        while (j <= B) {
            i += k * f[(int) (A + B - j)] * g[(int) (B - j)];
            k = k * 2 % m;
            j++;
        }
        System.out.println((i * f[(int) B] * g[(int) (A + B)] + A) % m);
    }
}