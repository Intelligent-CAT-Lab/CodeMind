```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MOD = 1000000007;

        int X = modPow(2, n, MOD) - 1;
        int A = modComb(n, a, MOD);
        int B = modComb(n, b, MOD);
        int ans = (X - A - B + MOD) % MOD;
        System.out.println(ans);
    }

    public static int modPow(int base, int exponent, int mod) {
        if (mod == 1) return 0;
        long result = 1;
        long x = base % mod;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * x) % mod;
            }
            x = (x * x) % mod;
            exponent /= 2;
        }
        return (int) result;
    }

    public static int modInverse(int base, int mod) {
        return modPow(base, mod - 2, mod);
    }

    public static int modComb(int n, int a, int mod) {
        int cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt = (int) (((long) cnt * (n - i) % mod) * modInverse(i + 1, mod) % mod);
        }
        return cnt;
    }
}
```

