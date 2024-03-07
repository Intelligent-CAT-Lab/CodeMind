<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n, m = list(map(int, input().split()))

MAX = 2*10**5+1
MOD = 10**9+7
fact = [0 for i in range(MAX)]
inv = [0 for i in range(MAX)]
invfact = [0 for i in range(MAX)]

def comb_build(n):
  fact[0] = inv[0] = invfact[0] = 1
  fact[1] = inv[1] = invfact[1] = 1
  for i in range(2, n):
    fact[i] = fact[i-1]*i%MOD
    inv[i] = inv[MOD%i]*(MOD-MOD//i)%MOD
    invfact[i] = invfact[i-1]*inv[i]%MOD

def nCk(n, k):
  if n<k or n<0 or k<0:
    return 0
  return (((fact[n]*invfact[k])%MOD)*invfact[n-k])%MOD

def prime_factor(n):
  from collections import defaultdict
  ret = defaultdict(int)
  for i in range(2, int(n**(1/2))+10):
    while n%i==0:
      ret[i] += 1
      n //= i
  if n!=1:
    ret[n] = 1
  return ret

comb_build(MAX)
ans = 1
for e in prime_factor(m).values():
  ans *= nCk(e+n-1, e)%MOD
print(ans%MOD)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int MAX = 2 * 100000 + 1;
        int MOD = 1000000007;
        long[] fact = new long[MAX];
        long[] inv = new long[MAX];
        long[] invfact = new long[MAX];

        combBuild(n);

        long ans = 1;
        for (Map.Entry<Integer, Integer> entry : primeFactor(m).entrySet()) {
            ans *= nCk(entry.getKey() + n - 1, entry.getKey()) % MOD;
        }

        System.out.println(ans % MOD);
    }

    private static void combBuild(int n) {
        fact[0] = inv[0] = invfact[0] = 1;
        fact[1] = inv[1] = invfact[1] = 1;
        for (int i = 2; i < n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = inv[MOD % i] * (MOD - MOD / i) % MOD;
            invfact[i] = invfact[i - 1] * inv[i] % MOD;
        }
    }

    private static long nCk(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return (((fact[n] * invfact[k]) % MOD) * invfact[n - k]) % MOD;
    }

    private static Map<Integer, Integer> primeFactor(int n) {
        Map<Integer, Integer> ret = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                ret.put(i, ret.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        return ret;
    }
}
```
Note that I have used `long` instead of `int` for the variables that can hold large values, and I have also used `HashMap` instead of `defaultdict` for the `primeFactor` method.</s>
