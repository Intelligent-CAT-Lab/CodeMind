<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 6

Expected output:
4


```
import java.util.*;
public class p03253 {
    static long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = m;
        long ans = 1;
        for (int i = 2; i * i <= res; i++) {
            int cnt = 0;
            while (res % i == 0) {
                cnt++;
                res /= i;
            }
            ans *= calcComb(cnt + n - 1, n - 1);
            ans %= MOD;
        }
        if (res != 1) {
            ans *= calcComb(n, 1);
            ans %= MOD;
        }
        System.out.println(ans);
    }
    public static long calcComb(int n, int k) {
        if (k > n - k) {
            return calcComb(n, n - k);
        }
        long ansMul = 1;
        long ansDiv = 1;
        for (int i = 0; i < k; i++) {
            ansMul *= (long) (n - i);
            ansDiv *= (long) (i + 1);
            ansMul %= MOD;
            ansDiv %= MOD;
        }
        long ans = ansMul * pow(ansDiv, MOD - 2);
        ans %= MOD;
        return ans;
    }
    public static long pow(long x, long n) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        return ans;
    }
}

```

@@ Response
```python
def calc_comb(n, k):
    if k > n - k:
        return calc_comb(n, n - k)
    ans_mul = 1
    ans_div = 1
    for i in range(k):
        ans_mul = (ans_mul * (n - i)) % MOD
        ans_div = (ans_div * (i + 1)) % MOD
    ans = (ans_mul * pow(ans_div, MOD - 2, MOD)) % MOD
    return ans

def pow(x, n, mod):
    ans = 1
    while n > 0:
        if n & 1:
            ans = (ans * x) % mod
        x = (x * x) % mod
        n >>= 1
    return ans

MOD = 1000000007
n, m = map(int, input().split())
res = m
ans = 1
for i in range(2, int(res**0.5) + 1):
    cnt = 0
    while res % i == 0:
        cnt += 1
        res //= i
    ans = (ans * calc_comb(cnt + n - 1, n - 1)) % MOD
if res != 1:
    ans = (ans * calc_comb(n, 1)) % MOD
print(ans)
```

This Python code does the same thing as the Java code. It reads two integers from the input, calculates the combination of the two integers, and prints the result. The `calc_comb` function calculates the combination of two integers, and the `pow` function calculates the power of a number modulo a given modulus. The `MOD` variable is the modulus used in the calculations.<｜end▁of▁sentence｜>
