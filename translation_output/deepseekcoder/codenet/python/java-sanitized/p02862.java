import java.util.Scanner;

public class p02862 {
    static long MOD = (long)Math.pow(10,9)+7;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        if ((x+y)%3 != 0 || x+y < 3*Math.min(x,y)) {
            System.out.println(0);
            System.exit(0);
        }
        long n = (x+y)/3;
        x -= n;
        y -= n;
        long[] fact = new long[(int)n+1];
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = fact[i-1] * i % MOD;
        }
        long factX = fact[(int)x];
        long factY = fact[(int)y];
        long factN = fact[(int)n];
        long c = factN * modinv(factX) * modinv(factY) % MOD;
        System.out.println(c);
    }

    public static long[] xgcd(long a, long b) {
        long x0 = 1, y0 = 0, x1 = 0, y1 = 1;
        while (b != 0) {
            long q = a / b;
            a = a % b;
            long temp = x0;
            x0 = x1;
            x1 = temp - q * x1;
            temp = y0;
            y0 = y1;
            y1 = temp - q * y1;
        }
        return new long[]{a, x0, y0};
    }

    public static long modinv(long a) {
        long[] gcdResult = xgcd(a, MOD);
        if (gcdResult[0] != 1) {
            throw new RuntimeException("modular inverse does not exist");
        } else {
            return gcdResult[1] % MOD;
        }
    }
}