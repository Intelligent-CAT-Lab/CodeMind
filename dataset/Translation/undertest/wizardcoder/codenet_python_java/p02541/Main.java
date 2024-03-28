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
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
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
                int[] res = crt(r, m);
                rem = res[0];
                mod = res[1];
                if (rem == 0 && mod == 0) {
                    break;
                }
                if (rem < ans) {
                    ans = rem;
                }
                r[0] = (r[0] + mod) % mod;
                r[1] = (r[1] + mod) % mod;
            }
        }

        System.out.println(ans);
    }

    public static int[] crt(int[] r, int[] m) {
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
                    return new int[]{0, 0};
                }
                continue;
            }
            int g = gcd(m0, m1);
            int im = modInverse(m0 / g, m1 / g);
            int u1 = m1 / g;
            if ((r1 - r0) % g!= 0) {
                return new int[]{0, 0};
            }
            int x = (r1 - r0) / g % u1 * im % u1;
            r0 += x * m0;
            m0 *= u1;
            if (r0 < 0) {
                r0 += m0;
            }
        }
        return new int[]{r0, m0};
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int modInverse(int a, int m) {
        int m0 = m;
        int x0 = 0, x1 = 1;
        if (m == 1) {
            return 0;
        }
        while (a > 1) {
            int q = a / m;
            int t = m;
            m = a % m;
            a = t;
            t = x0;
            x0 = x1 - q * x0;
            x1 = t;
        }
        if (x1 < 0) {
            x1 += m0;
        }
        return x1;
    }
}