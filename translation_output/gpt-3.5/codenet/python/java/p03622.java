```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long M = (long) Math.pow(8, 7);
        long m = M * 476 + 1;
        long[] f = new long[(int) M];
        f[0] = 1;
        long[] g = new long[(int) M];
        g[0] = 1;

        int i = 1;
        while (i < M) {
            f[i] = (f[i - 1] * i) % m;
            i++;
        }

        i = 1;
        while (i < M) {
            g[i] = (g[i - 1] * i) % m;
            i++;
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
        long result = 0;
        while (j <= B) {
            result = (result + k * f[A + B - (int) j] * g[B - (int) j]) % m;
            k = (k * 2) % m;
            j++;
        }

        result = (result * f[(int) B] * g[(int) A + (int) B] + A) % m;

        System.out.println(result);
    }
}
```
