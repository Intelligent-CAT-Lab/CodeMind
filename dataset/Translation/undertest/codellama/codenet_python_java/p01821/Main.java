import java.util.Scanner;

public class p01821 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int c = carmichael(N);
        int k = solve(N, c);

        if (k == -1 || pow(N, k, c) != 1 % c) {
            System.out.println(-1);
        } else {
            System.out.println(k);
        }
    }

    public static int carmichael(int x) {
        int r = 1;

        int b = 0;
        while (x % 2 == 0) {
            b += 1;
            x >>= 1;
        }
        if (b > 1) {
            r = 2 if b == 2 else 2**(b-2);
        }

        int y = 3;
        while (y*y <= x) {
            if (x % y == 0) {
                int c = 0;
                while (x % y == 0) {
                    x /= y;
                    c += 1;
                }
                r = lcm(r, (y-1) * y**(c-1));
            }
            y += 1;
        }
        if (x > 1) {
            r = lcm(r, x-1);
        }
        return r;
    }

    public static int lcm(int m, int n) {
        return m // gcd(m, n) * n;
    }

    public static int gcd(int m, int n) {
        while (n != 0) {
            int t = m % n;
            m = n;
            n = t;
        }
        return m;
    }

    public static int solve(int x, int c) {
        if (c == 1) {
            return 1;
        }
        x = x % c;
        int sq = (int) Math.sqrt(c) + 1;

        int[] mp = new int[sq];
        int y = 1;
        for (int i = 0; i < sq; i++) {
            mp[y] = i;
            y = (y * x) % c;
            if (y == 1) {
                return i+1;
            }
            if (y in mp) {
                return -1;
            }
        }
        int z = 1;
        for (int i = 0; i < sq; i++) {
            z = (z * y) % c;
            if (z in mp) {
                return sq*(i+1) - mp[z];
            }
        }
        return -1;
    }

    public static int pow(int x, int y, int c) {
        int result = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                result = (result * x) % c;
            }
            y >>= 1;
            x = (x * x) % c;
        }
        return result;
    }
}