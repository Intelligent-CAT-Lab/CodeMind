<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.*;
import java.io.*;

public class Main {
    static int inv_gcd(int a, int b) {
        a = (a + b) % b;
        if (a == 0)
            return b;
        int s = b, t = a;
        int m0 = 0, m1 = 1;

        while (t != 0) {
            int u = s / t;
            s -= t * u;
            m0 -= m1 * u;

            int tmp = s;
            s = t;
            t = tmp;
            tmp = m0;
            m0 = m1;
            m1 = tmp;
        }

        if (m0 < 0)
            m0 += b / s;
        return s;
    }

    static int crt(int[] r, int[] m) {
        int n = r.length;
        int r0 = 0, m0 = 1;

        for (int i = 0; i < n; i++) {
            int r1 = (r[i] + m[i]) % m[i];
            int m1 = m[i];

            if (m0 < m1) {
                int tmp = m0;
                m0 = m1;
                m1 = tmp;
                tmp = r0;
                r0 = r1;
                r1 = tmp;
            }

            if (m0 % m1 == 0) {
                if (r0 % m1 != r1)
                    return 0;
                continue;
            }

            int g = inv_gcd(m0, m1);
            int u1 = m1 / g;
            if ((r1 - r0) % g != 0)
                return 0;

            int x = ((r1 - r0) / g) % u1;
            if (x < 0)
                x += u1;

            r0 += x * m0;
            m0 *= u1;
            if (r0 < 0)
                r0 += m0;
        }

        return r0;
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> divisors = make_divisors(2 * n);

        int ans = n - 1;
        if (n % 2 == 0)
            ans = 2 * n - 1;
        for (int x : divisors) {
            int y = 2 * n / x;
            if (y == 1)
                continue;
            int[] r = {0, y - 1};
            int[] m = {x, y};
            int rem = crt(r, m);
            if (rem == 0)
                continue;
            ans = Math.min(ans, rem);
        }

        System.out.println(ans);
    }
}
```

Please note that Java does not support list comprehension like Python does. So, we use a traditional for-each loop to iterate over the divisors. Also, Java does not have a built-in function to find the square root of a number, so we use `Math.sqrt(n)`. The `crt` function is implemented in a similar way as the Python code. The `inv_gcd` function is also implemented in a similar way as the Python code. The `make_divisors` function is implemented in a similar way as the Python code. The `main` function is implemented in a similar way as the Python code.<｜end▁of▁sentence｜>
