import java.util.Scanner;

public class p02862 {
    static long MOD = (long)Math.pow(10,9)+7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if ((x+y)%3 != 0 || x+y < y || x+y < x) {
            System.out.println(0);
            System.exit(0);
        }
        int n = (x+y)/3;
        x -= n;
        y -= n;
        long[] fact = new long[n+1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i-1] * i % MOD;
        }
        long factX = fact[x];
        long factY = fact[y];
        long factN = fact[n];
        long c = factN * modinv(factX) * modinv(factY) % MOD;
        System.out.println(c);
    }

    public static long modinv(long a) {
        long g = xgcd(a, MOD)[0];
        if (g != 1) {
            throw new RuntimeException("modular inverse does not exist");
        } else {
            return xgcd(a, MOD)[1];
        }
    }

    public static long[] xgcd(long a, long b) {
        long x0 = 1, y0 = 0, x1 = 0, y1 = 1;
        while (b != 0) {
            long q = a / b;
            a = a % b;
            long tmp = x0;
            x0 = x1 - q * x0;
            x1 = tmp;
            tmp = y0;
            y0 = y1 - q * y0;
            y1 = tmp;
        }
        return new long[]{a, x0, y0};
    }
}