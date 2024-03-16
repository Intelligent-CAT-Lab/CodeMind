```java
import java.util.Scanner;

public class ModularInverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int MOD = 1000000007;

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if ((x + y) % 3 != 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            System.exit(0);
        }

        int n = (x + y) / 3;
        x -= n;
        y -= n;

        long[] fact = new long[n + 1];
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        long factX = fact[x];
        long factY = fact[y];
        long factN = fact[n];

        long c = (factN * modInv(factX, MOD) % MOD * modInv(factY, MOD) % MOD) % MOD;
        System.out.println(c);

        scanner.close();
    }

    public static long[] xgcd(int a, int b) {
        long x0 = 1, y0 = 0, x1 = 0, y1 = 1;
        while (b != 0) {
            int q = a / b;
            int tempA = a;
            a = b;
            b = tempA % b;

            long tempX = x0;
            x0 = x1;
            x1 = tempX - q * x1;

            long tempY = y0;
            y0 = y1;
            y1 = tempY - q * y1;
        }
        long[] result = new long[3];
        result[0] = a;
        result[1] = x0;
        result[2] = y0;
        return result;
    }

    public static long modInv(long a, int m) {
        long[] xgcdResult = xgcd((int)a, m);
        long g = xgcdResult[0];
        long x = xgcdResult[1];
        long y = xgcdResult[2];

        if (g != 1) {
            throw new RuntimeException("modular inverse does not exist");
        } else {
            return (x % m + m) % m;
        }
    }
}
```  
