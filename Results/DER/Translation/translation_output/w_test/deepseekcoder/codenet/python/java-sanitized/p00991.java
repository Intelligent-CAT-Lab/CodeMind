import java.util.Scanner;

public class p00991 {
    private static final int MOD = 100000007;

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % MOD;
        }
        return result;
    }

    private static long comb(int x, int y) {
        return (factorial(x) * modInv((int)factorial(x-y), MOD) % MOD * modInv((int)factorial(y), MOD) % MOD) % MOD;
    }

    private static long modInv(int a, int mod) {
        return power(a, mod-2, mod);
    }

    private static long power(long a, long b, long mod) {
        long result = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int ax = scanner.nextInt();
        int ay = scanner.nextInt();
        int bx = scanner.nextInt();
        int by = scanner.nextInt();
        scanner.close();

        int dx = Math.min(w-Math.abs(ax-bx), Math.abs(ax-bx));
        int dy = Math.min(h-Math.abs(ay-by), Math.abs(ay-by));

        long ans = 1;
        if (dx*2 == w) ans = (ans * 2) % MOD;
        if (dy*2 == h) ans = (ans * 2) % MOD;
        ans = (ans * comb(dx+dy, dx)) % MOD;

        System.out.println(ans);
    }
}