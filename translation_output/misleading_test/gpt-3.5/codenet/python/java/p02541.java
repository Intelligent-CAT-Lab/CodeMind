```java
import java.util.Scanner;
import java.util.Arrays;

public class ChineseRemainderTheorem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] divisors = makeDivisors(n * 2);

        int ans = (n % 2 != 0) ? n - 1 : 2 * n - 1;
        for (int x : divisors) {
            int y = (n * 2) / x;
            if (y == 1) {
                continue;
            }
            int[] r = new int[]{0, y - 1};
            int[] m = new int[]{x, y};
            int[] result = crt(r, m);
            int rem = result[0];
            int mod = result[1];
            if (rem == 0 && mod == 0) {
                continue;
            }
            ans = Math.min(ans, rem);
        }

        System.out.println((n - 1 != 0) ? ans : 1);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int[] invGcd(int a, int b) {
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

            int temp = s;
            s = t;
            t = temp;
            temp = m0;
            m0 = m1;
            m1 = temp;
        }

        if (m0 < 0) {
            m0 += b / s;
        }
        return new int[]{s, m0};
    }

    public static int[] crt(int[] r, int[] m) {
        int n = r.length;
        int r0 = 0, m0 = 1;

        for (int i = 0; i < n; i++) {
            int r1 = (r[i] + m[i]) % m[i];
            int m1 = m[i];

            if (m0 < m1) {
                m0 ^= m1;
                m1 ^= m0;
                m0 ^= m1;
                r0 ^= r1;
                r1 ^= r0;
                r0 ^= r1;
            }

            if (m0 % m1 == 0) {
                if (r0 % m1 != r1) {
                    return new int[]{0, 0};
                }
                continue;
            }

            int[] gcdResult = invGcd(m0, m1);
            int g = gcdResult[0];
            int im = gcdResult[1];
            int u1 = m1 / g;
            if ((r1 - r0) % g != 0) {
                return new int[]{0, 0};
            }
            int x = (((r1 - r0) / g % u1) * im) % u1;

            r0 += x * m0;
            m0 *= u1;
            if (r0 < 0) {
                r0 += m0;
            }
        }

        return new int[]{r0, m0};
    }

    public static int[] makeDivisors(int n) {
        int[] divisors = new int[2 * (int) Math.sqrt(n)];
        int index = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors[index++] = i;
                if (i != n / i) {
                    divisors[index++] = n / i;
                }
            }
        }
        return Arrays.copyOf(divisors, index);
    }
}
```

