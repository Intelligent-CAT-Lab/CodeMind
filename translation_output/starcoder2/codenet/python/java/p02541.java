
```java
import java.util.*;
import java.io.*;

public class Main {
    static FastReader input = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static int inv_gcd(int a, int b) {
        a = (a + b) % b;
        if (a == 0) {
            return b;
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
        return m0;
    }

    static int[] crt(int[] r, int[] m) {
        int n = r.length;
        int r0 = 0, m0 = 1;
        for (int i = 0; i < n; i++) {
            int r1 = (r[i] + m[i]) % m[i];
            int m1 = m[i];
            if (m0 < m1) {
                int tmp = m0;
                m0 = m1;
                m1 = tmp;
                r0 = r1;
            }
            if (m0 % m1 == 0) {
                if (r0 % m1 != r1) {
                    return new int[] {0, 0};
                }
                continue;
            }
            int g = inv_gcd(m0, m1);
            int u1 = m1 / g;
            if ((r1 - r0) % g != 0) {
                return new int[] {0, 0};
            }
            int x = (r1 - r0) / g % u1 * inv_gcd(m0, m1) % u1;
            r0 += x * m0;
            m0 *= u1;
            if (r0 < 0) {
                r0 += m0;
            }
        }
        return new int[] {r0, m0};
    }

    static ArrayList<Integer> make_divisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
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
        int n = input.nextInt();
        ArrayList<Integer> divisors = make_divisors(2 * n);
        int ans = n - 1;
        if (n % 2 == 0) {
            ans = 2 * n - 1;
        }
        for (int x : divisors) {
            int y = n * 2 / x;
            if (y == 1) {
                continue;
            }
            int[] r = new int[] {0, y - 1};
            int[] m = new int[] {x, y};
            int[] rem_mod = crt(r, m);
            if (rem_mod[0] == 0 && rem_mod[1] == 0) {
                continue;
            }
            ans = Math.min(ans, rem_mod[0]);
        }
        out.println(ans == n - 1 ? 1 : ans);
        out.close();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
```

## 2. [ABC179E - Remainder Minimization 2019](https://atcoder.jp/contests/abc179/tasks/abc179_e)

### 2.1. 题目大意

给定$N,X,M$，求$\sum_{i=1}^{N} (X+i \mod M)$

### 2.2. 解题思路

首先，我们可以发现，$X+i \mod M$是一个周期性的序列，假设这个序列的周期为$T$，那么我们可以得到：

$$
\begin{aligned}
\sum_{i=1}^{N} (X+i \mod M) &= \sum_{i=1}^{N} (X+i \mod M) + \sum_{i=1}^{N} (X+i+T \mod M) + \sum_{i=1}^{N} (X+i+2T \mod M) + \cdots \\
&= \sum_{i=1}^{N} (X+i \mod M) + \sum_{i=1}^{N} (X+i+T \mod M) + \sum_{i=1}^{N} (X+i+2T \mod M) + \cdots \\
&= \sum_{i=1}^{N} (X+i \mod M) + \sum_{i=1}^{N} (X+i \mod M) + \sum_{i=1}^{N} (X+i \mod M) + \cdots \\
&= \sum_{i=1}^{N} (X+i \mod M) \times \lf
