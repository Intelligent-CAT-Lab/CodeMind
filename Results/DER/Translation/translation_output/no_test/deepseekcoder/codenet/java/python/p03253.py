<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
MOD = 1000000007

def main():
    n, m = map(int, input().split())
    res = m
    ans = 1
    i = 2
    while i * i <= res:
        cnt = 0
        while res % i == 0:
            cnt += 1
            res //= i
        ans = (ans * calcComb(cnt + n - 1, n - 1)) % MOD
        i += 1
    if res != 1:
        ans = (ans * calcComb(n, 1)) % MOD
    print(ans)

def calcComb(n, k):
    if k > n - k:
        return calcComb(n, n - k)
    ansMul = 1
    ansDiv = 1
    for i in range(k):
        ansMul = (ansMul * (n - i)) % MOD
        ansDiv = (ansDiv * (i + 1)) % MOD
    ans = (ansMul * pow(ansDiv, MOD - 2)) % MOD
    return ans

def pow(x, n):
    ans = 1
    while n > 0:
        if n & 1 == 1:
            ans = (ans * x) % MOD
        x = (x * x) % MOD
        n >>= 1
    return ans

if __name__ == "__main__":
    main()
```
<|EOT|>
