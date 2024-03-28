```java
import java.util.Scanner;

public class PythonToJavaTranslation {

    public static void main(String[] args) {
        long M = (long) Math.pow(8, 7);
        long m = M * 476 + 1;
        long[] f = new long[(int) M + 1];
        long[] g = new long[(int) M + 1];
        long i = 1;

        f[1] = 1;
        g[1] = 1;

        while (i < M) {
            f[(int) i] = (f[(int) (i - 1)] * i) % m;
            i++;
        }

        g[(int) M] = modularInverse((long) Math.pow(M * f[(int) M], m - 2, m), m);

        while (i > 0) {
            g[(int) (i - 1)] = (g[(int) i] * i) % m;
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

        i = 0;
        long k = 1;
        long j = 1;

        while (j <= B) {
            i += k * f[(int) (A + B - j)] * g[(int) (B - j)] % m;
            k = (k * 2) % m;
            j++;
        }

        long result = ((i * f[B] * g[(int) (A + B)] + A) % m);

        System.out.println(result);
    }

    private static long modularInverse(long a, long m) {
        long m0 = m, t, q;
        long x0 = 0, x1 = 1;

        if (m == 1)
            return 0;

        // Apply extended Euclid Algorithm
        while (a > 1) {
            q = a / m;

            t = m;

            // m is the remainder now, process same as Euclid's algorithm
            m = a % m;
            a = t;

            t = x0;

            x0 = x1 - q * x0;

            x1 = t;
        }

        // Make x1 positive
        if (x1 < 0)
            x1 += m0;

        return x1;
    }
}
```
