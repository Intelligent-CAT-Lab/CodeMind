import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class p02541 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int[] divisors = makeDivisors(2 * n);

        int ans = n % 2 == 0 ? 2 * n - 1 : n - 1;
        for (int x : divisors) {
            int y = 2 * n / x;
            if (y == 1) {
                continue;
            }
            int[] r = {0, y - 1};
            int[] m = {x, y};
            int[] remMod = crt(r, m);
            int rem = remMod[0];
            int mod = remMod[1];
            if (rem == 0 && mod == 0) {
                continue;
            }
            ans = Math.min(ans, rem);
        }

        System.out.println(n - 1 != 0 ? ans : 1);
    }

    static int nextInt() throws IOException {
        if (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }

    static int[] makeDivisors(int n) {
        Deque<Integer> divisors = new ArrayDeque<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        int[] result = divisors.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

    static int[] invGcd(int a, int b) {
        a = (a + b) % b;
        if (a == 0) {
            return new int[]{b, 0};
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
        return new int[]{s, m0};
    }

    static int[] crt(int[] r, int[] m) {
        int n = r.length;
        int r0 = 0, m0 = 1;

        for (int i = 0; i < n; i++) {
            int r1 = (r[i] + m[i]) % m[i];
            int m1 = m[i];

            if (m0 < m1) {
                int temp = m0;
                m0 = m1;
                m1 = temp;
                temp = r0;
                r0 = r1;
                r1 = temp;
            }

            if (m0 % m1 == 0) {
                if (r0 % m1 != r1) {
                    return new int[]{0, 0};
                }
                continue;
            }

            int[] gIm = invGcd(m0, m1);
            int g = gIm[0];
            int im = gIm[1];

            int u1 = m1 / g;
            if ((r1 - r0) % g != 0) {
                return new int[]{0, 0};
            }

            int x = ((r1 - r0) / g % u1 * im % u1);

            r0 += x * m0;
            m0 *= u1;
            if (r0 < 0) {
                r0 += m0;
            }
        }

        return new int[]{r0, m0};
    }
}