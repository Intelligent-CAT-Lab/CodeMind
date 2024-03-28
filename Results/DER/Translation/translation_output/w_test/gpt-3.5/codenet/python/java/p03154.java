```java
import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;
    static final int listSize = 20000001;

    public static void main(String[] args) {
        long[] fList = new long[listSize];
        long[] fRList = new long[listSize];

        fList[0] = 1;
        for (int i = 1; i < listSize; i++) {
            fList[i] = (fList[i - 1] * i) % MOD;
        }

        fRList[listSize - 1] = pow(fList[listSize - 1], MOD - 2, MOD);
        for (int i = listSize - 2; i >= 0; i--) {
            fRList[i] = (fRList[i + 1] * (i + 1)) % MOD;
        }

        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int k = scanner.nextInt();
        
        long ans = k * fList[h + w] % MOD * fRList[h + w - k] % MOD;
        ans += ((h + w) * k % MOD) * (k + 1) % MOD * fList[h + w - 1] % MOD *
               fRList[2] % MOD * fRList[h + w - k] % MOD;
        ans %= MOD;
        ans += h * w % MOD * fList[h + w - 2] % MOD * (k - 1) % MOD * k % MOD * (k + 1) % MOD *
               pow(3, MOD - 2, MOD) % MOD * fRList[h + w - k] % MOD;
        ans %= MOD;

        System.out.println(ans);
    }

    public static long pow(long x, long y, long p) {
        long res = 1;
        x = x % p;

        while (y > 0) {
            if (y % 2 == 1) {
                res = (res * x) % p;
            }
            y = y >> 1;
            x = (x * x) % p;
        }

        return res;
    }
}
```
```
