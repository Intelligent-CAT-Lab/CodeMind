```java
import java.util.Scanner;

public class Main {
    static class Triple {
        long first, second, third;

        Triple(long fst, long snd, long trd) {
            this.first = fst;
            this.second = snd;
            this.third = trd;
        }
    }

    static Triple xgcd(long a, long b) {
        long x0 = 1, y0 = 0, x1 = 0, y1 = 1;
        while (b != 0) {
            long q = a / b;
            long temp = b;
            b = a % b;
            a = temp;
            long nextX = x0 - q * x1;
            long nextY = y0 - q * y1;
            x0 = x1;
            y0 = y1;
            x1 = nextX;
            y1 = nextY;
        }
        return new Triple(a, x0, y0);
    }

    static long modinv(long a, long m) {
        Triple result = xgcd(a, m);
        if (result.first != 1) {
            throw new IllegalArgumentException("Modular inverse does not exist");
        } else {
            return result.second % m;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long MOD = 1000000007;
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        if ((x + y) % 3 != 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            System.exit(0);
        }
        long n = (x + y) / 3;
        x -= n;
        y -= n;
        long[] fact = new long[(int) n + 1];
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        long factX = fact[(int) x];
        long factY = fact[(int) y];
        long factN = fact[(int) n];

        long c = (((factN * modinv(factX, MOD)) % MOD) * modinv(factY, MOD)) % MOD;
        System.out.println(c);
    }
}
```

