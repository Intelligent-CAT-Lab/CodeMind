Here's a translation of your Python code into Java. In Java, we need to define classes and methods properly, and we also need to handle input/output in a different way, typically using a `Scanner` for input and `System.out` for output.

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarmichaelFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int c = carmichael(N);
        int k = solve(N, c);

        if (k == -1 || pow(N, k, c) != 1) {
            System.out.println(-1);
        } else {
            System.out.println(k);
        }

        scanner.close();
    }

    public static int gcd(int m, int n) {
        while (n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }

    public static int lcm(int m, int n) {
        return m / gcd(m, n) * n;
    }

    public static int carmichael(int x) {
        int r = 1;
        int b = 0;
        while ((x & 1) == 0) {
            b++;
            x >>= 1;
        }
        if (b > 1) {
            r = b == 2 ? 2 : (int)Math.pow(2, b - 2);
        }

        int y = 3;
        while (y * y <= x) {
            if (x % y == 0) {
                int c = 0;
                while (x % y == 0) {
                    x /= y;
                    c++;
                }
                r = lcm(r, (y - 1) * (int)Math.pow(y, c - 1));
            }
            y += 2; // Improved by checking only odd numbers
        }
        if (x > 1) {
            r = lcm(r, x - 1);
        }
        return r;
    }

    public static int solve(int x, int c) {
        if (c == 1) {
            return 1;
        }
        x = x % c;
        int sq = (int)Math.sqrt(c) + 1;

        Map<Integer, Integer> mp = new HashMap<>();
        int y = 1;
        for (int i = 0; i < sq; i++) {
            mp.put(y, i);
            y = (y * x) % c;
            if (y == 1) {
                return i + 1;
            }
            if (mp.containsKey(y)) {
                return -1;
            }
        }
        int z = 1;
        for (int i = 0; i < sq; i++) {
            z = (z * y) % c;
            if (mp.containsKey(z)) {
                return sq * (i + 1) - mp.get(z);
            }
        }
        return -1;
    }

    public static int pow(int base, int exponent, int modulus) {
        int result = 1;
        base = base % modulus;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % modulus;
            }
            exponent >>= 1;
            base = (base * base) % modulus;
        }
        return result;
    }
}
```

Make sure that when you compile and run this Java code, you have the Java Development Kit (JDK) setup on your machine and your classpath is set correctly. The program reads an integer from standard input and writes the result to standard output.
