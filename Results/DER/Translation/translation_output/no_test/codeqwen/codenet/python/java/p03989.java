Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static int mod = 924844033;
    static int rng = 2010;
    static int[] fctr = new int[rng];
    static int[] finv = new int[rng];

    static {
        fctr[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = (int) ((long) fctr[i - 1] * i % mod);
        }
        for (int i = 1; i < rng; i++) {
            finv[i] = (int) pow(fctr[i], mod - 2, mod);
        }
    }

    static int cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return fctr[n] * finv[n - k] * finv[k] % mod;
        }
    }

    static long pow(long a, long b, long m) {
        if (b == 0) {
            return 1;
        } else if (b % 2 == 0) {
            return pow(a * a % m, b / 2, m);
        } else {
            return a * pow(a * a % m, (b - 1) / 2, m) % m;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if ((n - k) * 2 <= n) {
            int x = (n - k) * 2;
            int ans = 0;
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0) {
                    ans += cmb(x, i) * fctr[n - i];
                } else
