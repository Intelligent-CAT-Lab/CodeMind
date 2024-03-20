Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
-79

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
```java
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int mod = 998244353;

    if (N > M) {
      int temp = N;
      N = M;
      M = temp;
    }

    int[] fact = new int[M + 1];
    int[] powm = new int[M + 1];
    int[] pown = new int[M + 1];
    fact[0] = 1;
    powm[0] = 1;
    pown[0] = 1;
    for (int i = 1; i <= M; i++) {
      fact[i] = (fact[i - 1] * i) % mod;
      powm[i] = (powm[i - 1] * (M + 1)) % mod;
      pown[i] = (pown[i - 1] * (N + 1)) % mod;
    }

    int[][] inv_fact = new int[M + 1][mod];
    inv_fact[M][mod - 2] = 1;
    for (int i = M - 1; i >= 0; i--) {
      for (int j = 0; j < mod; j++) {
        inv_fact[i][j] = (inv_fact[i + 1][j] + (i + 1) * inv_fact[i + 1][(j + mod - fact[i + 1]) % mod]) % mod;
      }
    }

    int ans = 0;
    for (int i = 0; i <= N; i++) {
      int temp = 1;
      for (int j = 0; j < i; j++) {
        temp = (temp * (N - j) % mod * inv_fact[j][mod - 2] % mod) % mod;
      }
      ans = (ans + temp * powm[N - i] * pown[M - i] % mod) % mod;
    }

    System.out.println(ans);
  }
}
```<|endoftext|>
