import java.util.*;

public class p02541 {
    static class Result {
        long rem;
        long mod;

        public Result(long rem, long mod) {
            this.rem = rem;
            this.mod = mod;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Long> divisors = makeDivisors(2 * n);

        long ans = (n % 2 == 1) ? n - 1 : 2 * n - 1;
        for (long x : divisors) {
            long y = n * 2 / x;
            if (y == 1) {
                continue;
            }
            long[] r = {0, y - 1};
            long[] m = {x, y};
            Result result = crt(r, m);
            if (result.rem == 0 && result.mod == 0) {
                continue;
            }
            ans = Math.min(ans, result.rem);
        }

        System.out.println((n - 1 != 0) ? ans : 1);
    }

    public static Result crt(long[] r, long[] m) {
        int n = r.length;
        long r0 = 0;
        long m0 = 1;

        for (int i = 0; i < n; i++) {
            long r1 = (r[i] + m[i]) % m[i];
            long m1 = m[i];

            if (m0 < m1) {
                long temp = m0;
                m0 = m1;
                m1 = temp;
                temp = r0;
                r0 = r1;
                r1 = temp;
            }

            if (m0 % m1 == 0) {
                if (r0 % m1 != r1) {
                    return new Result(0, 0);
                }
                continue;
            }

            Result egcd = invGcd(m0, m1);

            long u1 = m1 / egcd.rem;
            if ((r1 - r0) % egcd.rem != 0) {
                return new Result(0, 0);
            }

            long x = ((r1 - r0) / egcd.rem % u1) * egcd.mod % u1;

            r0 += x * m0;
            m0 *= u1;
            if (r0 < 0) {
                r0 += m0;
            }
        }

        return new Result(r0, m0);
    }

    public static Result invGcd(long a, long b) {
        a = (a + b) % b;
        if (a == 0) {
            return new Result(b, 0);
        }
        long s = b;
        long t = a;
        long m0 = 0;
        long m1 = 1;

        while (t != 0) {
            long u = s / t;
            s -= t * u;
            m0 -= m1 * u;

            long temp = s;
            s = t;
            t = temp;
            temp = m0;
            m0 = m1;
            m1 = temp;
        }

        if (m0 < 0) {
            m0 += b / s;
        }

        return new Result(s, m0);
    }

    public static List<Long> makeDivisors(long n) {
        List<Long> divisors = new ArrayList<>();
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
}