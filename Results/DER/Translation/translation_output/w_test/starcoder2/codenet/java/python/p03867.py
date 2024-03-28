

```python
import math

MOD = 1000000007

def pow(n, k):
    ans = 1
    tmp = n
    while True:
        if k == 0:
            return ans
        if k % 2 == 1:
            ans = (ans * tmp) % MOD
        tmp = (tmp * tmp) % MOD
        k /= 2

def divisors(n):
    list = []
    for i in range(1, int(math.sqrt(n)) + 1):
        if n % i == 0:
            list.append(i)
            if i != n / i:
                list.append(n / i)
    list.sort()
    return list

N = int(input())
K = int(input())
divisor = divisors(N)
num = [0] * len(divisor)
tmpSum = 0
for i in range(len(divisor)):
    num[i] = pow(K, (divisor[i] + 1) / 2)
    for j in range(i):
        if divisor[i] % divisor[j] == 0:
            num[i] -= num[j]
    while num[i] < 0:
        num[i] += MOD
    tmpSum += num[i]
    tmpSum %= MOD
ans = 0
for i in range(len(divisor)):
    if num[i] < 0:
        num[i] += MOD
    num[i] = num[i] % MOD
for i in range(len(divisor)):
    d = divisor[i]
    if d % 2 == 0:
        ans += num[i] * d / 2
    else:
        ans += num[i] * d
    ans = ans % MOD
print(ans)
```

## 03868 - 1000000007

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Collections;

public class p03868 {
    public static long MOD = 1000000007;

    // calcurate n^k
    public static long pow(long n, long k) {
        long ans = 1;
        long tmp = n;
        while(true) {
            if(k==0) {
                return ans;
            }
            if(k % 2 == 1) {
                ans = (ans * tmp) % MOD;
            }
            tmp = (tmp * tmp) % MOD;
            k /= 2;
        }
    }

    public static ArrayList<Integer> divisors(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1; i*i <= n; i++) {
            if(n % i == 0) {
                list.add(i);
                if(i != n/i) list.add(n/i);
            }
        }
        Collections.sort(list);
        return list;
    }

    public static
