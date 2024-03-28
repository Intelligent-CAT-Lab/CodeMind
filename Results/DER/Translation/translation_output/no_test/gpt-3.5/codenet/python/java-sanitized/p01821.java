import java.util.Scanner;
import java.util.HashMap;

public class p01821 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int c = carmichael(N);
        int k = solve(N, c);
        if (k == -1 || Math.pow(N, k) % c != 1) {
            System.out.println(-1);
        } else {
            System.out.println(k);
        }
    }

    public static int gcd(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    public static int lcm(int m, int n) {
        return m / gcd(m, n) * n;
    }

    public static int carmichael(int x) {
        int r = 1;
        int b = 0;

        while ((x & 1) == 0) {
            b++;
            x >>= 1;
        }
        if (b > 1) {
            r = (b == 2) ? 2 : (int) Math.pow(2, b - 2);
        }

        int y = 3;
        while (y * y <= x) {
            if (x % y == 0) {
                int c = 0;
                while (x % y == 0) {
                    x /= y;
                    c++;
                }
                r = lcm(r, (y - 1) * (int) Math.pow(y, c - 1));
            }
            y++;
        }
        if (x > 1) {
            r = lcm(r, x - 1);
        }
        return r;
    }

    public static int solve(int x, int c) {
        if (c == 1) {
            return 1;
        }
        x = x % c;
        int sq = (int) Math.sqrt(c) + 1;

        HashMap<Integer, Integer> mp = new HashMap<>();
        int y = 1;
        for (int i = 0; i < sq; i++) {
            mp.put(y, i);
            y = (y * x) % c;
            if (y == 1) {
                return i + 1;
            }
            if (mp.containsKey(y)) {
                return -1;
            }
        }
        int z = 1;
        for (int i = 0; i < sq; i++) {
            z = (z * y) % c;
            if (mp.containsKey(z)) {
                return sq * (i + 1) - mp.get(z);
            }
        }
        return -1;
    }
}