import java.util.*;
import java.io.*;

public class p02541 {
    private static long[] invGcd(long a, long b) {
        a = (a + b) % b;
        if (a == 0) return new long[]{b, 0};
        long s = b;
        long t = a;
        long m0 = 0;
        long m1 = 1;

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
        return new long[]{s, m0};
    }

    private static long[] crt(long[] r, long[] m) {
        int n = r.length;
        long r0 = 0;
        long m0 = 1;

        for (int i = 0; i < n; i++) {
            long r1 = (r[i] + m[i]) % m[i];
            long m1 = m[i];

            if (m0 < m1) {
                long tmp = m0; m0 = m1; m1 = tmp;
                tmp = r0; r0 = r1; r1 = tmp;
            }

            if (m0 % m1 == 0) {
                if (r0 % m1 != r1) return new long[]{0, 0};
                continue;
            }

            long[] result = invGcd(m0, m1);
            long g = result[0];
            long im = result[1];

            long u1 = m1 / g;
            if ((r1 - r0) % g != 0) return new long[]{0, 0};

            long x = ((r1 - r0) / g % u1) * im % u1;

            r0 += x * m0;
            m0 *= u1;
            if (r0 < 0) r0 += m0;
        }

        return new long[]{r0, m0};
    }

    private static List<Long> makeDivisors(long n) {
        ArrayList<Long> divisors = new ArrayList<>();
        for (long i = 1; i <= Math.sqrt(n); i++) {
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
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        List<Long> divisors = makeDivisors(2 * n);

        long ans = n % 2 == 0 ? 2 * n - 1 : n - 1;
        for (long x : divisors) {
            long y = 2 * n / x;
            if (y == 1) continue;
            long[] r = {0, y - 1};
            long[] m = {x, y};
            long[] result = crt(r, m);
            long rem = result[0];
            long mod = result[1];
            if (rem == 0 && mod == 0) continue;
            ans = Math.min(ans, rem);
        }

        System.out.println(n == 1 ? 1 : ans);
    }
}