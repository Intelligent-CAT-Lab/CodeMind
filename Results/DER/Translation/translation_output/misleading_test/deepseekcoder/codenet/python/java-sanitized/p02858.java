import java.util.Scanner;

public class p02858 {
    private static final long MOD = 1000000007;

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    private static long pow(long a, long b) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            b = b / 2;
        }
        return result;
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
        System.out.println((pow(2, h) + pow(2, w) + pow(2, gcd(h, w)) - 3 + MOD) % (MOD * gh * gw) % MOD);
    }
}