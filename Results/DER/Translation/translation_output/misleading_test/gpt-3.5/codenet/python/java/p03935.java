```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long M = 998244353;
        long[] I = new long[n + 1];
        I[0] = I[1] = 1;

        long r = f(m + 2 * n - 2, M);
        long c = 1;
        
        for(int i = 2; i < n; i++) {
            I[i] = (M - M / i) * I[(int)(M % i)] % M;
        }
        
        for(int i = 0; i < n - 1; i++) {
            r = (r + c * (M - f(2 * n - 2 - 2 * i, M))) % M;
            c = (c * (m + i) * I[i + 1]) % M;
        }

        System.out.println(r);
    }

    public static long f(int n, long M) {
        long[] e = {1, 0, 0, 1};
        long[] z = {1, 1, 1, 0};

        while (n > 0) {
            e = multiply(e, n % 2 == 1 ? z : e, M);
            z = multiply(z, z, M);
            n /= 2;
        }

        return e[1];
    }

    public static long[] multiply(long[] a, long[] b, long M) {
        long[] result = new long[4];
        result[0] = (a[0] * b[0] + a[1] * b[2]) % M;
        result[1] = (a[0] * b[1] + a[1] * b[3]) % M;
        result[2] = (a[2] * b[0] + a[3] * b[2]) % M;
        result[3] = (a[2] * b[1] + a[3] * b[3]) % M;
        return result;
    }
}
```
```
