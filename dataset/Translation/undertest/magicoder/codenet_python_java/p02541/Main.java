import java.util.*;
import java.io.*;

public class p02541 {
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