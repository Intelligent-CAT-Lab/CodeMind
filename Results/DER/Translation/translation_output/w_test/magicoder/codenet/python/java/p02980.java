<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
8


```
N, M = map(int, input().split())
mod = 998244353

if N > M:
  N, M = M, N

fact = [0] * (M + 1)
powm = [0] * (M + 1)
pown = [0] * (M + 1)
fact[0] = 1
powm[0] = 1
pown[0] = 1
for i in range(1, M + 1):
  fact[i] = fact[i - 1] * i % mod
  powm[i] = powm[i - 1] * (M + 1) % mod
  pown[i] = pown[i - 1] * (N + 1) % mod

def pow(n, m):
  if m == 0:
    return 1
  elif m == 1:
    return n
  elif m % 2 == 0:
    return pow(n, m // 2)**2 % mod
  else:
    return pow(n, m // 2)**2 % mod * n % mod

inv_fact = [0] * (M + 1)
inv_fact[M] = pow(fact[M], mod-2)
for i in reversed(range(0, M)):
  inv_fact[i] = inv_fact[i + 1] * (i + 1) % mod
    
def C(n, r):
  return fact[n] * inv_fact[r] % mod * inv_fact[n - r] % mod
  
ans = 0
for i in range(N+1):
  ans += (-1)**i * C(N, i) * C(M, i) * fact[i] * powm[N - i] * pown[M - i]
  ans = ans % mod

print(ans)

```

@@ Response
```java
import java.util.*;

public class Main {
    static long mod = 998244353;
    static long[] fact, powm, pown, inv_fact;

    static void preprocess(int M) {
        fact = new long[M + 1];
        powm = new long[M + 1];
        pown = new long[M + 1];
        fact[0] = 1;
        powm[0] = 1;
        pown[0] = 1;
        for (int i = 1; i <= M; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
            powm[i] = (powm[i - 1] * (M + 1)) % mod;
            pown[i] = (pown[i - 1] * (M + 1)) % mod;
        }
        inv_fact = new long[M + 1];
        inv_fact[M] = pow(fact[M], mod - 2);
        for (int i = M - 1; i >= 0; i--) {
            inv_fact[i] = (inv_fact[i + 1] * (i + 1)) % mod;
        }
    }

    static long pow(long n, long m) {
        if (m == 0) return 1;
        if (m == 1) return n;
        if (m % 2 == 0) return pow((n * n) % mod, m / 2);
        return (pow((n * n) % mod, m / 2) * n) % mod;
    }

    static long C(int n, int r) {
        return (fact[n] * inv_fact[r] % mod * inv_fact[n - r]) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (N > M) {
            int temp = N;
            N = M;
            M = temp;
        }
        preprocess(M);
        long ans = 0;
        for (int i = 0; i <= N; i++) {
            ans = (ans + ((((i % 2 == 0) ? 1 : -1) * C(N, i) % mod * C(M, i) % mod * fact[i] % mod * powm[N - i] % mod * pown[M - i] % mod)) % mod) % mod;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and M from the input, and then calculates the result as per the given conditions. The `preprocess` function calculates the factorial, power of M, power of N, and inverse factorial arrays. The `pow` function calculates the power of a number modulo `mod`. The `C` function calculates the combination of two numbers. The `main` function reads the input, checks if N is greater than M and then calls the `preprocess` function, calculates the result and prints it.<｜end▁of▁sentence｜>
