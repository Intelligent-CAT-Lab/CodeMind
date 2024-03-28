<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    static int N, M;
    static long mod = 998244353;
    static long[] fact, powm, pown, inv_fact;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        if (N > M) {
            int temp = N;
            N = M;
            M = temp;
        }

        fact = new long[M + 1];
        powm = new long[M + 1];
        pown = new long[M + 1];
        fact[0] = 1;
        powm[0] = 1;
        pown[0] = 1;
        for (int i = 1; i <= M; i++) {
            fact[i] = fact[i - 1] * i % mod;
            powm[i] = powm[i - 1] * (M + 1) % mod;
            pown[i] = pown[i - 1] * (N + 1) % mod;
        }

        inv_fact = new long[M + 1];
        inv_fact[M] = pow(fact[M], (int) (mod - 2));
        for (int i = M - 1; i >= 0; i--) {
            inv_fact[i] = inv_fact[i + 1] * (i + 1) % mod;
        }

        long ans = 0;
        for (int i = 0; i <= N; i++) {
            long temp = fact[i] * pow(inv_fact[N - i], mod - 2) % mod * pow(inv_fact[M - i], mod - 2) % mod;
            temp = temp * powm[N - i] % mod * pown[M - i] % mod;
            if (i % 2 == 1) {
                ans -= temp;
            } else {
                ans += temp;
            }
            ans %= mod;
        }

        System.out.println(ans);
    }

    static long pow(long n, int m) {
        if (m == 0) {
            return 1;
        } else if (m == 1) {
            return n;
        } else if (m % 2 == 0) {
            long temp = pow(n, m / 2);
            return temp * temp % mod;
        } else {
            long temp = pow(n, m / 2);
            return temp * temp % mod * n % mod;
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers N and M from the input, and then calculates the answer to the problem. The answer is printed to the standard output.
<|EOT|>
