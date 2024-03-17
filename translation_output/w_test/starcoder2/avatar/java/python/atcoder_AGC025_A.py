

```python
n = input()

for i in range(1, len(n)):
    if n[i] != '0':
        sum = 0
        for j in range(len(n)):
            sum += int(n[j])
        print(sum)
        break

if n[0] == '1':
    print(10)
else:
    print(int(n[0]))
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;

public class atcoder_AGC025_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        long k = in.nextLong();

        long mod = 998244353;
        long[] fact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % mod;
        }

        long ans = 0;
        for (int i = 0; i <= n; i++) {
            if (k - a * i < 0) {
                break;
            }
            if ((k - a * i) % b != 0) {
                continue;
            }
            long j = (k - a * i) / b;
            if (j > n) {
                continue;
            }
            long tmp = fact[n];
            tmp = tmp * pow(fact[i], mod - 2, mod) % mod;
            tmp = tmp * pow(fact[j], mod - 2, mod) % mod;
            tmp = tmp * pow(fact[n - i - j], mod - 2, mod) % mod;
            ans = (ans + tmp) % mod;
        }

        System.out.println(ans);
    }

    static long pow(long a, long b, long mod) {
        if (b == 0) {
            return 1;
        }
        long res = pow(a, b / 2, mod);
        res = res * res % mod;
        if (b % 2 == 1) {
            res = res * a % mod;
        }
        return res;
    }
}
```

python code:

```python
n, a, b, k = map(int, input().split())

mod = 998244353
fact = [1] * (n + 1)
for i in range(1, n + 1):
    fact[i] = fact[i - 1] * i % mod

ans = 0
for i in range(n + 1):
    if k - a * i < 0:
        break
    if (k - a * i) % b != 0:
        continue
    j = (k - a * i) // b
    if j > n:
        continue
    tmp = fact[n]
    tmp = tmp * pow(fact[i], mod - 2, mod) % mod
    tmp = tmp * pow(fact[j], mod - 2, mod) % mod
    tmp = tmp * pow(fact[n - i - j], mod - 2, mod) % mod
    ans = (ans + tmp) % mod

print(ans)
```
/2020/04/20200420.md
# 20200420

## 1.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;

public class atcoder_AGC025_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        long k = in.nextLong();

        long mod = 998244353;
        long[] fact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % mod;
        }

        long ans = 0;
        for (int i = 0; i <= n; i++) {
            if (k - a * i < 0) {
                break;
            }
            if ((k - a * i) % b != 0) {
                continue;
            }
            long j = (k - a * i) / b;
            if (j > n) {
                continue;
            }
            long tmp = fact[n];
            tmp = tmp * pow(fact[i], mod - 2, mod) % mod;
            tmp = tmp * pow(fact[j], mod - 2, mod) % mod;
            tmp = tmp * pow(fact[n - i - j], mod - 2, mod) % mod;
            ans = (ans + tmp) % mod;
        }

        System.out.println(ans);
    }

    static long pow(long a, long b, long mod) {
        if (b == 0) {
            return 1;
        }
        long res = pow(a, b / 2, mod);
        res = res * res % mod;
        if (b % 2 == 1) {
            res = res * a % mod;
        }
        return res;
    }
}
```

python code:

```python
n, a, b, k = map(int, input().split())

mod = 998244353
fact = [1] * (n + 1)
for i in range(1, n + 1):
    fact[i] = fact[i - 1] * i % mod

ans = 0
for i in range(n + 1):
    if k - a * i < 0:
        break
    if (k - a * i) % b != 0:
        continue
    j = (k - a * i) // b
    if j > n:
        continue
    tmp = fact[n]
    tmp = tmp * pow(fact[i], mod - 2, mod) % mod
    tmp = tmp * pow(fact[j], mod - 2, mod) % mod
    tmp = tmp * pow(fact[n - i - j], mod - 2, mod) % mod
    ans = (ans + tmp) % mod

print(ans)
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;

public class atcoder_AGC025_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        long k = in.nextLong();

        long mod = 9982
