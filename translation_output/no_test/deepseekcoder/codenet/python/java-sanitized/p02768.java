import java.util.Scanner;

public class p02768 {
    static final long MOD = (long)Math.pow(10,9) + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long X = power(2,n) - 1;
        long A = modComb(n,a);
        long B = modComb(n,b);
        long ans = (X - A - B) % MOD;

        System.out.println(ans);
    }

    public static long power(long x, long y) {
        long res = 1;
        x = x % MOD;
        while (y > 0) {
            if (y % 2 == 1)
                res = (res * x) % MOD;
            y = y >> 1;
            x = (x * x) % MOD;
        }
        return res;
    }

    public static long modComb(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res %= MOD;
            res *= power(i + 1, MOD - 2);
            res %= MOD;
        }
        return res;
    }
}