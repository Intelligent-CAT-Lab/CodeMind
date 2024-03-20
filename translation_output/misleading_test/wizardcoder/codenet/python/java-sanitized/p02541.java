import java.util.*;
import java.io.*;

public class p02541 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int ans = n-1;
        if (n % 2 == 0) {
            ans = 2*n-1;
        }

        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i!= n/i) {
                    divisors.add(n/i);
                }
            }
        }

        for (int x : divisors) {
            int y = n * 2 / x;
            if (y == 1) {
                continue;
            }
            int[] r = {0, y-1};
            int[] m = {x, y};
            int rem = 0, mod = 0;
            while (true) {
                int[] res = inv_gcd(m[0], m[1]);
                int u = res[1];
                if (u == 0) {
                    break;
                }
                int x1 = (r[1] - r[0]) / m[1] * u % m[1];
                r[0] += x1 * m[0];
                m[0] *= u;
                if (r[0] < 0) {
                    r[0] += m[0];
                }
            }
            if (r[0] == 0 && m[0] == 1) {
                continue;
            }
            rem = r[0];
            mod = m[0];
            if (rem == mod) {
                ans = Math.min(ans, rem);
            }
        }

        System.out.println(ans);
    }

    public static int[] inv_gcd(int a, int b) {
        a = (a + b) % b;
        if (a == 0) {
            return new int[]{b, 0};
        }
        int s = b, t = a, m0 = 0, m1 = 1;
        while (t!= 0) {
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
        return new int[]{s, m0};
    }

    public static int crt(int[] r, int[] m) {
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
                if (r0 % m1!= r1) {
                    return 0;
                }
                continue;
            }
            int[] res = inv_gcd(m0, m1);
            int g = res[0];
            int im = res[1];
            int u1 = m1 / g;
            if ((r1 - r0) % g!= 0) {
                return 0;
            }
            int x = (r1 - r0) / g % u1 * im % u1;
            r0 += x * m0;
            m0 *= u1;
            if (r0 < 0) {
                r0 += m0;
            }
        }
        return r0;
    }
}