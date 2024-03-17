Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 6

Expected output:
4


```
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
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int MAX = 2*10**5+1;
        int MOD = 10**9+7;
        int[] fact = new int[MAX];
        int[] inv = new int[MAX];
        int[] invfact = new int[MAX];
        comb_build(MAX);
        int ans = 1;
        for (int e : prime_factor(m).values()) {
            ans = (ans * nCk(e+n-1, e)) % MOD;
        }
        System.out.println(ans);
    }

    public static void comb_build(int n) {
        fact[0] = inv[0] = invfact[0] = 1;
        fact[1] = inv[1] = invfact[1] = 1;
        for (int i = 2; i < n; i++) {
            fact[i] = (fact[i-1] * i) % MOD;
            inv[i] = (inv[MOD%i] * (MOD-MOD/i)) % MOD;
            invfact[i] = (invfact[i-1] * inv[i]) % MOD;
        }
    }

    public static int nCk(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return ((fact[n] * invfact[k]) % MOD * invfact[n-k]) % MOD;
    }

    public static Map<Integer, Integer> prime_factor(int n) {
        Map<Integer, Integer> ret = new HashMap<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                ret.put(i, ret.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n!= 1) {
            ret.put(n, 1);
        }
        return ret;
    }
}
```<|endoftext|>
