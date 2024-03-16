```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long M = (long) Math.pow(8, 7);
        long m = M * 476 + 1;
        long[] f = new long[(int) M];
        long[] g = new long[(int) M];
        int i = 1;
        f[0] = 1;
        for (i = 1; i < M; i++) {
            f[i] = (f[i - 1] * i) % m;
        }
        g[M - 1] = modPow(M * f[(int) M - 1], m - 2, m);
        for (i = (int) M - 1; i > 0; i--) {
            g[i - 1] = (g[i] * i) % m;
        }

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }

        int j = 1;
        long k = 1;
        long result = 0;
        for (j = 1; j <= B; j++) {
            result += k * f[A + B - j] * g[B - j];
            k = (k * 2) % m;
        }

        long finalResult = ((result * f[B] * g[A + B] + A) % m);
        System.out.println(finalResult);
    }

    public static long modPow(long base, long exponent, long modulus) {
        long result = 1;
        base %= modulus;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }
            base = (base * base) % modulus;
            exponent /= 2;
        }
        return result;
    }
}
```
```
