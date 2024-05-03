Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = sc.nextInt();
        long[] lst = new long[k+1];
        lst[k-1] = 1;
        long A = (long)a * pow(100*n, mod-2, mod);
        long inv = pow(n, mod-2, mod);

        for (int i = k-2; i >= 0; i--) {
            if (k > i + n) {
                lst[i] = A*(lst[i+1] - lst[i+n+1]) + lst[i+1];
                lst[i] %= mod;
            } else {
                lst[i] = A*(lst[i+1] - lst[k]) + (n-(k-i)+1)*inv + lst[i+1];
                lst[i] %= mod;
            }
        }
        System.out.println((lst[0] - lst[1])%mod);
    }

    public static long pow(long a, long b, long m) {
        if (b == 0) return 1;
        long res = pow(a, b/2, m);
        res = (res * res) % m;
        if (b % 2 == 1) res = (res * a) % m;
        return res;
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the standard input, calculates the result, and prints it to the standard output. The `pow` function is a helper function that calculates the power of a number modulo another number.
