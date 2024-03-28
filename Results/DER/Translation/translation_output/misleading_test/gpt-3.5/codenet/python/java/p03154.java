```java
public class Solution {
    public static void main(String[] args) {
        long MOD = (long)Math.pow(10, 9) + 7;
        int list_size = 20000001;

        long[] f_list = new long[list_size];
        long[] f_r_list = new long[list_size];

        for (int i = 0; i < list_size - 1; i++) {
            f_list[i + 1] = (f_list[i] * (i + 1)) % MOD;
        }

        f_r_list[list_size - 1] = modPow(f_list[list_size - 1], MOD - 2, MOD);

        for (int i = list_size - 2; i >= 0; i--) {
            f_r_list[i] = (f_r_list[i + 1] * (i + 1)) % MOD;
        }

        // Input
        int h = 2;
        int w = 1;
        int k = 2;

        long ans = k * f_list[h+w] % MOD * f_r_list[h+w-k] % MOD;
        ans += (h+w) * k * (k+1) % MOD * f_list[h+w-1] % MOD * f_r_list[2] % MOD * f_r_list[h+w-k] % MOD;
        ans %= MOD;
        ans += h * w % MOD * f_list[h+w-2] % MOD * (k-1) % MOD * k % MOD * (k+1) % MOD * modPow(3, MOD-2, MOD) % MOD * f_r_list[h+w-k] % MOD;
        ans %= MOD;

        System.out.println(ans);
    }

    public static long modPow(long base, long exp, long mod) {
        if (exp == 0) {
            return 1;
        }
        long half = modPow(base, exp / 2, mod);
        long result = (half * half) % mod;
        if (exp % 2 == 1) {
            result = (result * base) % mod;
        }
        return result;
    }
}
```
```
