<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11

Expected output:
10


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
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static long[] inv_gcd(long a, long b) {
        a = (a + b) % b;
        if (a == 0)
            return new long[]{b, 0};
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

        if (m0 < 0)
            m0 += b / s;
        return new long[]{s, m0};
    }

    static long[] crt(long[] r, long[] m) {
        int n = r.length;
        long r0 = 0, m0 = 1;

        for (int i = 0; i < n; i++) {
            long r1 = (r[i] + m[i]) % m[i], m1 = m[i];

            if (m0 < m1) {
                long tmp = m0;
                m0 = m1;
                m1 = tmp;

                tmp = r0;
                r0 = r1;
                r1 = tmp;
            }

            if (m0 % m1 == 0) {
                if (r0 % m1 != r1)
                    return new long[]{0, 0};
                continue;
            }

            long[] g = inv_gcd(m0, m1);

            long u1 = m1 / g[0];
            if ((r1 - r0) % g[0] != 0)
                return new long[]{0, 0};

            long x = ((r1 - r0) / g[0]) % u1 * g[1] % u1;

            r0 += x * m0;
            m0 *= u1;
            if (r0 < 0)
                r0 += m0;
        }
        return new long[]{r0, m0};
    }

    static ArrayList<Integer> make_divisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i)
                    divisors.add(n / i);
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    static int nextInt() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        ArrayList<Integer> divisors = make_divisors(2 * n);

        long ans = n % 2 == 0 ? 2 * n - 1 : n - 1;
        for (int x : divisors) {
            int y = 2 * n / x;
            if (y == 1)
                continue;
            long[] r = {0, (long) y - 1};
            long[] m = {(long) x, (long) y};
            long[] res = crt(r, m);
            if (res[0] == res[1] && res[0] == 0)
                continue;
            ans = Math.min(ans, res[0]);
        }

        System.out.println(ans);
    }
}
```
<|EOT|>
