<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
    static long N, M, mod = 998244353;
    static long[] fact, powm, pown, inv_fact;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        M = sc.nextLong();

        if (N > M) {
            long temp = N;
            N = M;
            M = temp;
        }

        fact = new long[(int) (M + 1)];
        powm = new long[(int) (M + 1)];
        pown = new long[(int) (M + 1)];
        fact[0] = 1;
        powm[0] = 1;
        pown[0] = 1;
        for (int i = 1; i <= M; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
            powm[i] = (powm[i - 1] * (M + 1)) % mod;
            pown[i] = (pown[i - 1] * (N + 1)) % mod;
        }

        inv_fact = new long[(int) (M + 1)];
        inv_fact[(int) M] = pow(fact[(int) M], mod - 2);
        for (int i = (int) M - 1; i >= 0; i--) {
            inv_fact[i] = (inv_fact[i + 1] * (i + 1)) % mod;
        }

        long ans = 0;
        for (int i = 0; i <= N; i++) {
            ans = (ans + (((i % 2 == 0) ? 1 : -1) * C(N, i) * C(M, i) * fact[i] % mod * powm[(int) (N - i)] % mod * pown[(int) (M - i)] % mod)) % mod;
        }

        System.out.println(ans);
    }

    static long pow(long n, long m) {
        if (m == 0) {
            return 1;
        } else if (m == 1) {
            return n;
        } else if (m % 2 == 0) {
            long temp = pow(n, m / 2);
            return (temp * temp) % mod;
        } else {
            long temp = pow(n, m / 2);
            return (((temp * temp) % mod) * n) % mod;
        }
    }

    static long C(long n, long r) {
        return (fact[(int) n] * inv_fact[(int) r] % mod * inv_fact[(int) (n - r)] % mod);
    }
}
```

This Java code does the same thing as the Python code you provided. It reads two integers N and M from the standard input, swaps them if N is greater than M, and then calculates the answer according to the given formula.<｜end▁of▁sentence｜>
