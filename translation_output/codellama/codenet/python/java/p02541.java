<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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



Translate the above python code to java.

java code:

[/INST]
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] divisors = makeDivisors(2 * n);
        int ans = n - 1;
        if (n % 2 == 0) {
            ans = 2 * n - 1;
        }
        for (int x : divisors) {
            int y = 2 * n / x;
            if (y == 1) {
                continue;
            }
            int[] r = {0, y - 1};
            int[] m = {x, y};
            int[] rem = crt(r, m);
            if (rem[0] == rem[1] == 0) {
                continue;
            }
            ans = Math.min(ans, rem[0]);
        }
        System.out.println(ans);
    }

    public static int[] makeDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        divisors.sort(Integer::compare);
        return divisors.stream().mapToInt(i -> i).toArray();
    }

    public static int[] crt(int[] r, int[] m) {
        int n = r.length;
        int[] r0 = new int[n];
        int[] m0 = new int[n];
        for (int i = 0; i < n; i++) {
            r0[i] = (r[i] + m[i]) % m[i];
            if (r0[i] == 0) {
                return new int[] {0, 0};
            }
            m0[i] = m[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (m0[i] < m0[j]) {
                    int tmp = m0[i];
                    m0[i] = m0[j];
                    m0[j] = tmp;
                    tmp = r0[i];
                    r0[i] = r0[j];
                    r0[j] = tmp;
                }
                if (m0[i] % m0[j] == 0) {
                    if (r0[i] % m0[j] != r0[j]) {
                        return new int[] {0, 0};
                    }
                    continue;
                }
                int[] g = invGcd(m0[i], m0[j]);
                int u1 = m0[j] / g[0];
                if ((r0[j] - r0[i]) % g[0] != 0) {
                    return new int[] {0, 0};
                }
                int x = (r0[j] - r0[i]) / g[0] % u1 * g[1] % u1;
                r0[i] += x * m0[i];
                m0[i] *= u1;
                if (r0[i] < 0) {
                    r0[i] += m0[i];
                }
            }
        }
        return new int[] {r0[0], m0[0]};
    }

    public static int[] invGcd(int a, int b) {
        a = (a + b) % b;
        if (a == 0) {
            return new int[] {b, 0};
        }
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
        if (m0 < 0) {
            m0 += b / s;
        }
        return new int[] {s, m0};
    }
}</s>
