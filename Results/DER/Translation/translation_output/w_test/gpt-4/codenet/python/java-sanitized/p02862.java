import java.util.Scanner;

public class p02862 {
    
    private static final long MOD = (long)1e9 + 7;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        scanner.close();

        if ((x + y) % 3 != 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            return;
        }
        long n = (x + y) / 3;
        x -= n;
        y -= n;
        
        long[] fact = new long[(int)(n + 1)];
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        long factX = fact[(int)x];
        long factY = fact[(int)y];
        long factN = fact[(int)n];

        long c = factN * modinv(factX, MOD) % MOD * modinv(factY, MOD) % MOD;
        System.out.println(c);
    }

    private static long[] xgcd(long a, long b) {
        long x0 = 1, y0 = 0, x1 = 0, y1 = 1;
        while (b != 0) {
            long q = a / b;
            long temp = a;
            a = b;
            b = temp % b;
            long tempX1 = x1;
            x1 = x0 - q * x1;
            x0 = tempX1;
            long tempY1 = y1;
            y1 = y0 - q * y1;
            y0 = tempY1;
        }
        return new long[]{a, x0, y0};
    }

    private static long modinv(long a, long m) {
        long[] gxy = xgcd(a, m);
        long g = gxy[0], x = gxy[1];
        if (g != 1) {
            throw new ArithmeticException("modular inverse does not exist");
        } else {
            return (x % m + m) % m;
        }
    }
}