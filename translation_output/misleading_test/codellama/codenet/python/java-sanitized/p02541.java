import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class p02541 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] divisors = makeDivisors(2 * n);

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
            int[] remMod = crt(r, m);
            if (remMod[0] == remMod[1] == 0) {
                continue;
            }
            ans = Math.min(ans, remMod[0]);
        }

        System.out.println(ans);
    }

    public static int[] crt(int[] r, int[] m) {
        int n = r.length;
        int[] r0 = new int[n];
        int[] m0 = new int[n];

        for (int i = 0; i < n; i++) {
            r0[i] = r[i] + m[i];
            m0[i] = m[i];
        }

        for (int i = 0; i < n; i++) {
            int s = r0[i] % m0[i];
            if (s == 0) {
                return new int[] {m0[i], 0};
            }
            int t = m0[i] % s;
            int[] tmp = new int[2];
            tmp[0] = s;
            tmp[1] = t;
            r0[i] = t;
            m0[i] = s;
        }

        for (int i = 0; i < n; i++) {
            if (m0[i] < 0) {
                m0[i] += m0[i] / s;
            }
        }

        return new int[] {r0[0], m0[0]};
    }

    public static int[] makeDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        int[] result = new int[divisors.size()];
        for (int i = 0; i < divisors.size(); i++) {
            result[i] = divisors.get(i);
        }
        return result;
    }
}