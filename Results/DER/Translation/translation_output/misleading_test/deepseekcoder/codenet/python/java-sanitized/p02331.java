import java.util.Scanner;

public class p02331 {
    static final long MOD = (long)Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        System.out.println(powMod(k, n));
    }

    static long powMod(long a, long b) {
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            b = b / 2;
        }
        return res;
    }
}