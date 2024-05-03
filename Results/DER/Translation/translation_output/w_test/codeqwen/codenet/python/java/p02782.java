Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    static final int mod = (int)1e9+7;
    static final int rng = 2000100;
    static int[] fctr = new int[rng];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        fctr[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = (int)((long)fctr[i-1] * i % mod);
        }

        System.out.println(cmb(x2+y2+2, x2+1) - cmb(x2+y1+1, y1) - cmb(x1+y2+1, x1) + cmb(x1+y1, x1) % mod);
    }

    static int finv(int x) {
        return pow(fctr[x], mod-2, mod);
    }

    static int cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return fctr[n] * finv(n-k) * finv(k) % mod;
        }
    }

    static int pow(int a, int b, int m) {
        if (b == 0) {
            return 1;
        } else if (b % 2 == 0) {
            return pow((long)a * a % m, b / 2, m);
        } else {
            return (int)((long)a * pow((long)a * a % m, (b-1) / 2, m) % m);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads
