Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        int M = (int) Math.pow(8, 7);
        int m = M * 476 + 1;
        int[] f = new int[M];
        int[] g = new int[M];
        int i = 1;
        int j = 1;
        int k = 1;
        f[0] = 1;
        g[0] = 1;
        while (i < M) {
            f[i] = (f[i - 1] * i) % m;
            i++;
        }
        g[0] = (int) Math.pow(M * f[M - 1], m - 2, m);
        i = 0;
        while (i < M) {
            g[i] = (g[i - 1] * i) % m;
            i++;
        }
        i = 0;
        while (j <= B) {
            i += k * f[A + B - j] * g[B - j];
            k = (k * 2) % m;
            j++;
        }
        System.out.println((i * f[B] * g[A + B] + A) % m);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, swaps them if necessary, and then calculates the result using the same algorithm. The result is then printed to the console.
