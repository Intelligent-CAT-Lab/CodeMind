import java.util.*;
import java.io.*;

public class p02541 {
    static int inv_gcd(int a, int b) {
        a = (a + b) % b;
        if (a == 0) {
            return (b, 0);
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
        return (s, m0);
    }

    static int crt(int[] r, int[] m) {
        int n = r.length;
        int r0 = 0, m0 = 1;

        for (int i = 0; i < n; i++) {
            int r1 = (r[i] + m[i]) % m[i], m1 = m[i];

            if (m0 < m1) {
                m0 = m1;
                r0 = r1;
            }

            if (m0 % m1 == 0) {
                if (r0 % m1 != r1) {
                    return (0, 0);
                }
                continue;
            }

            int[] g = inv_gcd(m0, m1);

            int u1 = m1 / g[0];
            if ((r1 - r0) % g[0] != 0) {
                return (0, 0);
            }

            int x = (r1 - r0) / g[0] % u1 * g[1] % u1;

            r0 += x * m0;
            m0 *= u1;
            if (r0 < 0) {
                r0 += m0;
            }
        }

        return (r0, m0);
    }

    static List<Integer> make_divisors(int n) {
        List<Integer> divisors = new ArrayList<>();
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> divisors = make_divisors(2 * n);

        int ans = n - 1;
        if (n % 2 == 0) {
            ans = 2 * n - 1;
        }
        for (int x : divisors) {
            int y = n * 2 / x;
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
}