<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11

Expected output:
-1

```
import sys
from collections import deque
input = sys.stdin.readline


def inv_gcd(a, b):
    a = (a + b) % b
    if a == 0:
        return (b, 0)
    s, t = b, a
    m0, m1 = 0, 1

    while t:
        u = s // t
        s -= t * u
        m0 -= m1 * u

        tmp = s
        s = t
        t = tmp
        tmp = m0
        m0 = m1
        m1 = tmp
    
    if m0 < 0:
        m0 += b // s
    return (s, m0)


def crt(r, m):
    n = len(r)
    r0, m0 = 0, 1

    for i in range(n):
        r1, m1 = (r[i] + m[i]) % m[i], m[i]

        if m0 < m1:
            m0, m1 = m1, m0
            r0, r1 = r1, r0
        
        if m0 % m1 == 0:
            if r0 % m1 != r1:
                return (0, 0)
            continue
        
        g, im = inv_gcd(m0, m1)

        u1 = m1 // g
        if (r1 - r0) % g:
            return (0, 0)
        
        x = (r1 - r0) // g % u1 * im % u1

        r0 += x * m0
        m0 *= u1
        if (r0 < 0):
            r0 += m0
        
    return (r0, m0)


def make_divisors(n):
    divisors = []
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            divisors.append(i)
            if i != n // i:
                divisors.append(n//i)
    divisors.sort()
    return divisors


def main():
    n = int(input())
    divisors = make_divisors(2 * n)

    ans = n-1 if n%2 else 2*n-1
    for x in divisors:
        y = n * 2 // x
        if y == 1:
            continue
        r = [0, y-1]
        m = [x, y]
        rem, mod = crt(r, m)
        if rem == mod == 0:
            continue
        ans = min(ans, rem)

    
    print(ans if n-1 else 1)

    
if __name__ == "__main__":
    main()


```

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    private static BigInteger inv_gcd(BigInteger a, BigInteger b) {
        a = a.add(b).mod(b);
        if (a.equals(BigInteger.ZERO)) {
            return BigInteger.valueOf(0);
        }
        BigInteger s = b, t = a;
        BigInteger m0 = BigInteger.ZERO, m1 = BigInteger.ONE;

        while (!t.equals(BigInteger.ZERO)) {
            BigInteger u = s.divide(t);
            s = s.subtract(t.multiply(u));
            m0 = m0.subtract(m1.multiply(u));

            BigInteger tmp = s;
            s = t;
            t = tmp;
            tmp = m0;
            m0 = m1;
            m1 = tmp;
        }

        if (m0.compareTo(BigInteger.ZERO) < 0) {
            m0 = m0.add(b.divide(s));
        }
        return s;
    }

    private static BigInteger[] crt(BigInteger[] r, BigInteger[] m) {
        int n = r.length;
        BigInteger r0 = BigInteger.ZERO, m0 = BigInteger.ONE;

        for (int i = 0; i < n; i++) {
            BigInteger r1 = r[i].add(m[i]).mod(m[i]);

            if (m0.compareTo(m[i]) < 0) {
                BigInteger tmp = m0;
                m0 = m[i];
                m[i] = tmp;
                tmp = r0;
                r0 = r1;
                r[i] = tmp;
            }

            if (m0.mod(m[i]).equals(BigInteger.ZERO)) {
                if (!r0.mod(m[i]).equals(r[i])) {
                    return new BigInteger[] {BigInteger.ZERO, BigInteger.ZERO};
                }
                continue;
            }

            BigInteger g = inv_gcd(m0, m[i]);

            BigInteger u1 = m[i].divide(g);
            if (!r1.subtract(r0).mod(g).equals(BigInteger.ZERO)) {
                return new BigInteger[] {BigInteger.ZERO, BigInteger.ZERO};
            }

            BigInteger x = r1.subtract(r0).divide(g).mod(u1).multiply(inv_gcd(u1, g)).mod(u1);

            r0 = r0.add(x.multiply(m0));
            m0 = m0.multiply(u1);
            if (r0.compareTo(BigInteger.ZERO) < 0) {
                r0 = r0.add(m0);
            }
        }
        return new BigInteger[] {r0, m0};
    }

    private static List<Integer> make_divisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n/i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> divisors = make_divisors(2 * n);

        BigInteger ans = BigInteger.valueOf(n-1).compareTo(BigInteger.ZERO) == 0 ? BigInteger.ONE : BigInteger.valueOf(2*n-1);
        for (Integer x : divisors) {
            int y = 2 * n / x;
            if (y == 1) {
                continue;
            }
            BigInteger[] r = new BigInteger[] {BigInteger.ZERO, BigInteger.valueOf(y-1)};
            BigInteger[] m = new BigInteger[] {BigInteger.valueOf(x), BigInteger.valueOf(y)};
            BigInteger[] res = crt(r, m);
            if (res[0].equals(BigInteger.ZERO) && res[1].equals(BigInteger.ZERO)) {
                continue;
            }
            ans = ans.compareTo(res[0]) > 0 ? res[0] : ans;
        }

        System.out.println(ans.toString());
    }
}
```

This Java code does the same thing as the Python code. It finds the smallest non-negative integer `x` such that `x` mod `n` is `0`, where `n` is the input number. The input number is read from the standard input. The result is printed to the standard output.
<|EOT|>
