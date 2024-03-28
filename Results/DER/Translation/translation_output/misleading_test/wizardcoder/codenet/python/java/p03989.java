Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1

Expected output:
88

```
from collections import defaultdict
n,k = map(int,input().split())
mod = 924844033
rng = 2010
fctr = [1]
finv = [1]
for i in range(1,rng):
  fctr.append(fctr[-1]*i%mod)
for i in range(1,rng):
  finv.append(pow(fctr[i],mod-2,mod))
def cmb(n,k):
  if n<0 or k<0:
    return 0
  else:
    return fctr[n]*finv[n-k]*finv[k]%mod
if (n-k)*2 <= n:
  x = (n-k)*2
  ans = 0
  for i in range(x+1):
    if i%2 == 0:
      ans += cmb(x,i)*fctr[n-i]
    else:
      ans -= cmb(x,i)*fctr[n-i]
    ans %= mod
  print(ans)
  exit()
dc = defaultdict(int)
for j in range(1,k+1):
  a = j
  b = k+j
  cnt = 0
  while a<=n and b<=n:
    if a>b:
      b += 2*k
    else:
      a += 2*k
    cnt += 1
  dc[cnt] += 2
nn = (n-k)*2
cp = set()
cpp = 1
for i,x in dc.items():
  for j in range(x):
    cpp += i
    cp.add(cpp)
cp.add(1)
dp = [[0 for j in range(n+1)] for i in range(nn+1)]
dp[0][0] = 1
for i in range(1,nn+1):
  dp[i] = dp[i-1][:]
  if i not in cp:
    for j in range(1,min(i,n)+1):
      dp[i][j] += dp[i-2][j-1]
      dp[i][j] %= mod
  else:
    for j in range(1,min(i,n)+1):
      dp[i][j] += dp[i-1][j-1]
      dp[i][j] %= mod
ans = 0
for i in range(n+1):
  if i%2 == 0:
    ans += fctr[n-i]*dp[nn][i]
  else:
    ans -= fctr[n-i]*dp[nn][i]
  ans %= mod
print(ans)
```

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int mod = 924844033;
    int rng = 2010;
    int[] fctr = new int[rng];
    int[] finv = new int[rng];
    fctr[0] = 1;
    finv[0] = 1;
    for (int i = 1; i < rng; i++) {
      fctr[i] = (int) ((long) fctr[i-1] * i % mod);
      finv[i] = (int) pow(fctr[i], mod-2, mod);
    }
    int[][] dp = new int[n+1][n+1];
    for (int i = 0; i <= n; i++) {
      dp[i][0] = 1;
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        dp[i][j] = dp[i-1][j] + dp[i][j-1];
        dp[i][j] %= mod;
      }
    }
    int ans = 0;
    for (int i = 0; i <= n; i++) {
      ans += dp[n][i] * fctr[n-i];
      ans %= mod;
    }
    System.out.println(ans);
  }

  public static long pow(long a, long b, long mod) {
    if (b == 0) return 1;
    if (b % 2 == 0) {
      long x = pow(a, b/2, mod);
      return (x*x) % mod;
    } else {
      return (a * pow(a, b-1, mod)) % mod;
    }
  }
}
```<|endoftext|>
