Here is the equivalent Java code for the provided Python code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ChineseRemainderTheoremSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        List<Long> divisors = makeDivisors(2 * n);

        long ans = (n % 2) ? n - 1 : 2 * n - 1;
        for (long x : divisors) {
            long y = 2 * n / x;
            if (y == 1) {
                continue;
            }
            long[] r = {0, y - 1};
            long[] m = {x, y};
            Pair result = crt(r, m);
            long rem = result.first;
            long mod = result.second;
            if (rem == 0 && mod == 0) {
                continue;
            }
            ans = Math.min(ans, rem);
        }

        System.out.println((n == 1) ? 1 : ans);
    }

    private static class Pair {
        long first;
        long second;

        public Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    private static Pair inv_gcd(long a, long b) {
        a = (a + b) % b;
        if (a == 0) {
            return new Pair(b, 0);
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
        return new Pair(s, m0);
    }

    private static Pair crt(long[] r, long[] m) {
        long r0 = 0, m0 = 1;
        int n = r.length;

        for (int i = 0; i < n; i++) {
            long r1 = (r[i] + m[i]) % m[i], m1 = m[i];

            if (m0 < m1) {
                m0 = m1 + (m1 = m0);
                r0 = r1 + (r1 = r0);
            }

            if (m0 % m1 == 0) {
                if (r0 % m1 != r1) {
                    return new Pair(0, 0);
                }
                continue;
            }

            Pair pair = inv_gcd(m0, m1);
            long g = pair.first, im = pair.second;

            long u1 = m1 / g;
            if ((r1 - r0) % g != 0) {
                return new Pair(0, 0);
            }

            long x = ((r1 - r0) / g % u1) * im % u1;

            r0 += x * m0;
            m0 *= u1;
            if (r0 < 0) {
                r0 += m0;
            }
        }

        return new Pair(r0, m0);
    }

    private static List<Long> makeDivisors(long n) {
        List<Long> divisors = new ArrayList<>();
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        divisors.sort(null);
        return divisors;
    }
}
```

Please take note of the following differences in the Java code:
1. Java is strongly typed, so you have to specify the type of every variable. 
2. Java uses different syntax for operators such as division (it automatically does integer division if both operands are integers).
3. Java classes and methods need to be declared before use, as opposed to Python's more flexible order of definition.
4. In Java `0` and `1` are interpreted as integer literals, so logical checks need to be done using comparison operators, such as `(n % 2 == 0) ? ... : ...;` rather than the Python’s `(n % 2) ? ... : ...;`.
5. Java doesn't have built-in tuple types; hence I've created a private `Pair` class to return two values from a function.
6. The translated Java code assumes that your goal is to read a single long integer from standard input and process it accordingly.
7. The translated Java code does not include exception handling for I/O operations for the sake of simplicity, but you would typically handle possible `IOException` in a production environment.
