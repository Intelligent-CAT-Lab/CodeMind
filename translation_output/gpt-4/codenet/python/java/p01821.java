Here's the equivalent code in Java for the given Python code. You will notice some key differences, such as how input is handled, the need for explicit variable types, and a few changes related to the behavior of the `Map` instead of the Python `dict`. You will also notice that arithmetic in Java with integers does floor division by default, so there's no need for `//` like in Python:

```java
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.close();

        int c = carmichael(N);
        int k = solve(N, c);

        if (k == -1 || pow(N, k, c) != 1 % c) {
            System.out.println(-1);
        } else {
            System.out.println(k);
        }
    }

    public static int gcd(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    public static int lcm(int m, int n) {
        return m / gcd(m, n) * n;
    }

    public static int carmichael(int x) {
        int r = 1;
        int b = 0;
        while (x % 2 == 0) {
            b += 1;
            x /= 2;
        }
        if (b > 1) {
            r = (b == 2) ? 2 : (int)Math.pow(2, b - 2);
        }

        int y = 3;
        while (y * y <= x) {
            if (x % y == 0) {
                int c = 0;
                while (x % y == 0) {
                    x /= y;
                    c += 1;
                }
                r = lcm(r, (y - 1) * (int)Math.pow(y, c - 1));
            }
            y += 2;
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
        long result = 1;
        long b = base % modulus;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * b) % modulus;
            }
            exponent = exponent >> 1;
            b = (b * b) % modulus;
        }
        return (int)result;
    }
}
```
Note that I've implemented the `pow` function to mimic Python's three-argument `pow(base, exponent, modulus)` and replaced the bit-shifting operator with integer division where appropriate. Also, I used a `HashMap` to simulate the dictionary behavior in the `solve` function, and used the modulus operator for the equivalent of Python's remainder calculation.
