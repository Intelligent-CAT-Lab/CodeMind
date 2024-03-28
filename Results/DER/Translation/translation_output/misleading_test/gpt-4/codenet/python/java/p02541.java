Here is the Python code translated into Java. Since Java requires all the code to be contained within a class and methods, I have encapsulated the functions within a `Main` class, and used `Scanner` for input reading.

```java
import java.util.*;

public class Main {
    private static long[] invGcd(long a, long b) {
        a = (a + b) % b;
        if (a == 0) {
            return new long[]{b, 0};
        }
        long s = b, t = a;
        long m0 = 0, m1 = 1;
        
        while (t != 0) {
            long u = s / t;
            s -= t * u;
            m0 -= m1 * u;

            long tmp = s;
            s = t;
            t = tmp;
            tmp = m0;
            m0 = m1;
            m1 = tmp;
        }

        if (m0 < 0) {
            m0 += b / s;
        }
        return new long[]{s, m0};
    }

    private static long[] crt(long[] r, long[] m) {
        int n = r.length;
        long r0 = 0, m0 = 1;

        for (int i = 0; i < n; i++) {
            long[] ret = invGcd(m0, m[i]);
            long g = ret[0], im = ret[1];
            long r1 = (r[i] + m[i]) % m[i];
            long m1 = m[i];

            if (m0 % m1 == 0) {
                if (r0 % m1 != r1) {
                    return new long[]{0, 0};
                }
                continue;
            }

            if ((r1 - r0) % g != 0) {
                return new long[]{0, 0};
            }

            long u1 = m1 / g;
            long x = ((r1 - r0) / g % u1) * im % u1;

            r0 += x * m0;
            m0 *= u1;
            if (r0 < 0) {
                r0 += m0;
            }
        }
        
        return new long[]{r0, m0};
    }

    private static List<Long> makeDivisors(long n) {
        List<Long> divisors = new ArrayList<>();

        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }

        Collections.sort(divisors);
        return divisors;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        List<Long> divisors = makeDivisors(2 * n);
        long ans = (n % 2 == 0) ? 2 * n - 1 : n - 1;

        for (long x : divisors) {
            long y = (n * 2) / x;
            if (y == 1) {
                continue;
            }
            long[] r = {0, y - 1};
            long[] m = {x, y};
            long[] result = crt(r, m);
            long rem = result[0];
            long mod = result[1];
            if (rem == 0 && mod == 0) {
                continue;
            }
            ans = Math.min(ans, rem);
        }

        System.out.println((n - 1 != 0) ? ans : 1);
        in.close();
    }
}
```

Please note that there may be differences in numerical precision and overflow behavior between Python and Java due to the different ways they handle integer arithmetic. In particular, Python has automatic promotion of integers to long integers when they exceed a certain size, whereas in Java, integer operations that overflow will wrap around, so it might require careful consideration of the types used (`int` vs `long`) when translating between languages. In this translation, `long` is used for arithmetic to accommodate larger numbers.
