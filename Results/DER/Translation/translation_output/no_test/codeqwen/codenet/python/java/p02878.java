Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);
        int M = 998244353;
        int P = N + 1;
        int f = 1;
        int[] F = new int[P];
        int[] I = new int[P];
        int z = 0;
        for (int n = 1; n < P; n++) {
            F[n] = f = (f * n) % M;
        }
        I[N] = i = pow(F[N], M - 2, M);
        for (int n = N - 1; n >= 1; n--) {
            I[n - 1] = i = (i * n) % M;
        }
        for (int k = 0; k < Math.min(A + 1, N - B) ? N - B - A : A + 1; k++) {
            int Q = N - B - k - 1;
            z += (B - k) * F[B + k - 1] * I[B] * I[k] * F[Q + A - k] * I[Q] * I[A - k];
        }
        System.out.println(z % M);
    }

    public static int pow(int a, int b, int m) {
        if (b == 0) {
            return 1;
        }
        int res = pow(a, b / 2, m);
        res = (res * res) % m;
        if (b % 2 == 1) {
            res = (res * a) % m;
        }
        return res;
    }
}
```

This Java code does the same thing as your Python
