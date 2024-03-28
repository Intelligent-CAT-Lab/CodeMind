<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 6

Expected output:
56

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
[/INST]

Here is the Python code that implements the same logic as the Java code:
```python
import math

MOD = 1000000007

def calc_comb(n, k):
    if k > n - k:
        return calc_comb(n, n - k)
    ans_mul = 1
    ans_div = 1
    for i in range(k):
        ans_mul *= (n - i) % MOD
        ans_div *= (i + 1) % MOD
        ans_mul %= MOD
        ans_div %= MOD
    ans = ans_mul * pow(ans_div, MOD - 2, MOD)
    ans %= MOD
    return ans

def pow(x, n):
    ans = 1
    while n > 0:
        if (n & 1) == 1:
            ans = ans * x % MOD
        x = x * x % MOD
        n >>= 1
    return ans

def main():
    n, m = map(int, input().split())
    res = m
    ans = 1
    for i in range(2, int(math.sqrt(res)) + 1):
        cnt = 0
        while res % i == 0:
            cnt += 1
            res //= i
        ans *= calc_comb(cnt + n - 1, n - 1)
        ans %= MOD
    if res != 1:
        ans *= calc_comb(n, 1)
        ans %= MOD
    print(ans)

if __name__ == "__main__":
    main()
```
Note that the `calc_comb` function is implemented using the same logic as the `calcComb` function in the Java code, and the `pow` function is implemented using the same logic as the `pow` function in the Java code. The `main` function is also implemented in a similar way, with the only difference being that the input is read using the `input` function in Python, rather than the `Scanner` class in Java.</s>
