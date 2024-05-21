import java.util.Scanner;

public class p03622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        long M = (long) Math.pow(8, 7);
        long m = M * 476 + 1;
        long[] f = new long[M];
        long[] g = new long[M];
        long i = 1;
        long j = 1;
        long k = 1;
        f[0] = 1;
        while (i < M) {
            f[i] = (f[i - 1] * i) % m;
            i++;
        }
        g[0] = pow(M * f[M - 1], m - 2, m);
        i = 0;
        while (i < M) {
            g[i] = (g[i - 1] * i) % m;
            i++;
        }
        long i1 = 0;
        while (j <= B) {
            i1 += k * f[A + B - j] * g[B - j];
            k = (k * 2) % m;
            j++;
        }
        long result = (i1 * f[B] * g[A + B] + A) % m;
        System.out.println(result);
    }

    public static long pow(long a, long b, long m) {
        if (b == 0) {
            return 1;
        }
        long temp = pow(a, b / 2, m);
        temp = (temp * temp) % m;
        if (b % 2 == 1) {
            temp = (temp * a) % m;
        }
        return temp;
    }
}