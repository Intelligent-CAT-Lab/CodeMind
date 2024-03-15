<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
```python
import sys

def calcComb(n, k):
    if k > n - k:
        return calcComb(n, n - k)
    ansMul = 1
    ansDiv = 1
    for i in range(k):
        ansMul *= (n - i)
        ansDiv *= (i + 1)
        ansMul %= 1000000007
        ansDiv %= 1000000007
    ans = ansMul * pow(ansDiv, 1000000006)
    ans %= 1000000007
    return ans

def pow(x, n):
    ans = 1
    while n > 0:
        if (n & 1) == 1:
            ans = ans * x % 1000000007
        x = x * x % 1000000007
        n >>= 1
    return ans

n = int(input())
m = int(input())
res = m
ans = 1
for i in range(2, int(res**0.5) + 1):
    cnt = 0
    while res % i == 0:
        cnt += 1
        res //= i
    ans *= calcComb(cnt + n - 1, n - 1)
    ans %= 1000000007
if res != 1:
    ans *= calcComb(n, 1)
    ans %= 1000000007
print(ans)
```</s>
