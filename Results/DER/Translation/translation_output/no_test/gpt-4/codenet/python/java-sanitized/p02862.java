import java.io.*;
import java.math.*;
import java.util.*;

public class p02862 {
    private static final long MOD = (long)1e9 + 7;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split("\\s+");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);

        if ((x + y) % 3 != 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            return;
        }

        int n = (x + y) / 3;
        x -= n;
        y -= n;

        long[] fact = new long[n + 1];
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        long factX = fact[x];
        long factY = fact[y];
        long factN = fact[n];

        long c = factN * modinv(factX, MOD) % MOD * modinv(factY, MOD) % MOD;
        System.out.println(c);
    }

    private static long[] xgcd(long a, long b) {
        long x0 = 1, y0 = 0, x1 = 0, y1 = 1;
        while (b != 0) {
            long q = a / b;
            long temp1 = a % b;
            long temp2 = x0 - q * x1;
            long temp3 = y0 - q * y1;
            a = b;
            b = temp1;
            x0 = x1;
            x1 = temp2;
            y0 = y1;
            y1 = temp3;
        }
        return new long[] { a, x0, y0 };
    }

    private static long modinv(long a, long m) {
        long[] result = xgcd(a, m);
        long g = result[0], x = result[1];
        if (g != 1) {
            throw new ArithmeticException("modular inverse does not exist");
        } else {
            return (x % m + m) % m;
        }
    }
}