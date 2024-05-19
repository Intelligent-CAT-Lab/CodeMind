System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;

public class Main {
    static int MOD = 924844033;
    static int RNG = 2010;
    static int[] fctr = new int[RNG];
    static int[] finv = new int[RNG];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        fctr[0] = 1;
        finv[0] = 1;
        for (int i = 1; i < RNG; i++) {
            fctr[i] = (int) ((long) fctr[i - 1] * i % MOD);
            finv[i] = pow(fctr[i], MOD - 2, MOD);
        }
        if ((n - k) * 2 <= n) {
            int x = (n - k) * 2;
            int ans = 0;
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0) {
                    ans += cmb(x, i) * fctr[n - i] % MOD;
                } else {
                    ans -= cmb(x, i) * fctr[n - i] % MOD;
                }
                ans %= MOD;
            }
            System.out.println(ans);
            return;
        }
        Map<Integer, Integer> dc = new HashMap<>();
        for (int j = 1; j <= k; j++) {
            int a = j;
            int b = k + j;
            int cnt = 0;
            while (a <= n && b <= n) {
                if (a > b) {
                    b += 2 * k;
                } else {
                    a += 2 * k;
                }
                cnt++;
            }
            dc.put(cnt, dc.getOrDefault(cnt, 0) + 2);
        }
        int nn = (n - k) * 2;
        Set<Integer> cp = new HashSet<>();
        int cpp = 1;
        for (Map.Entry<Integer, Integer> entry : dc.entrySet()) {
            for (int j = 0; j < entry.getValue(); j++) {
                cpp += entry.getKey();
                cp.add(cpp);
            }
        }
        cp.add(1);
        int[][] dp = new int[nn + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= nn; i++) {
            dp[i] = Arrays.copyOf(dp[i - 1], n + 1);
            if (!cp.contains(i)) {
                for (int j = 1; j <= n; j++) {
                    dp[i][j] += dp[i - 2][j - 1];
                    dp[i][j] %= MOD;
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    dp[i][j] += dp[i - 1][j - 1];
                    dp[i][j] %= MOD;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                ans += fctr[n - i] * dp[nn][i] % MOD;
            } else {
                ans -= fctr[n - i] * dp[nn][i] % MOD;
            }
            ans %= MOD;
        }
        System.out.println(ans);
    }

    static int cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        }
        return (int) ((long) fctr[n] * finv[n - k] % MOD * finv[k] % MOD);
    }

    static int pow(int a, int b, int m) {
        int result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (int) ((long) result * a % m);
            }
            a = (int) ((long) a * a % m);
            b /= 2;
        }
        return result;
    }
}
```<|endoftext|>
