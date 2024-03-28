import java.util.Scanner;

public class p03622 {
    public static void main(String[] args) {
        long M = (long) Math.pow(8, 7);
        long m = M * 476 + 1;
        long[] f = new long[(int) m];
        long[] g = new long[(int) m];
        long i = 1;
        f[0] = 1;
        g[0] = 1;
        while (i < m) {
            f[(int) i] = f[(int) (i - 1)] * i % m;
            i++;
        }
        g[(int) (m - 1)] = (long) Math.pow(M * f[(int) (m - 1)], m - 2) % m;
        i = m - 1;
        while (i > 0) {
            g[(int) (i - 1)] = g[(int) i] * i % m;
            i--;
        }
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        long j = 1;
        long k = 1;
        while (j <= B) {
            i += k * f[A + B - (int) j] * g[(int) (B - j)];
            k = k * 2 % m;
            j++;
        }
        System.out.println((i * f[B] * g[A + B] + A) % m);
    }
}