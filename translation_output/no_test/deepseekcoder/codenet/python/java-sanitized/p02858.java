import java.util.Scanner;

public class p02858 {
    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static long pow(long a, long b, long m) {
        long res = 1;
        a = a % m;
        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % m;
            b = b >> 1;
            a = (a * a) % m;
        }
        return res;
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
        long MOD = 1000000007;
        System.out.println((pow(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3, gh * gw, MOD)));
    }
}