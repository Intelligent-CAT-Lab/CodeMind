import java.util.Scanner;

public class p02858 {
    static final long MOD = 1000000007;

    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static long pow(long x, long y) {
        if (y == 0)
            return 1;
        long p = pow(x, y / 2) % MOD;
        p = (p * p) % MOD;
        if ((y & 1) == 1)
            p = (p * x) % MOD;
        return p;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long H = scanner.nextLong();
        long W = scanner.nextLong();
        long T = scanner.nextLong();
        long gh = gcd(H, T);
        long gw = gcd(W, T);
        long h = H / gh;
        long w = W / gw;
        System.out.println((pow(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3, gh * gw, MOD)));
    }
}