<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1

Expected output:
2


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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 924844033;
        int rng = 2010;
        long[] fctr = new long[rng];
        long[] finv = new long[rng];
        fctr[0] = 1;
        finv[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = fctr[i - 1] * i % mod;
        }
        finv[1] = 1;
        for (int i = 2; i < rng; i++) {
            finv[i] = finv[i - 1] * i % mod;
        }
        long cmb(int n, int k) {
            if (n < 0 || k < 0) {
                return 0;
            } else {
                return fctr[n] * finv[n - k] * finv[k] % mod;
            }
        }
        if ((n - k) * 2 <= n) {
            int x = (n - k) * 2;
            long ans = 0;
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0) {
                    ans += cmb(x, i) * fctr[n - i];
                } else {
                    ans -= cmb(x, i) * fctr[n - i];
                }
                ans %= mod;
            }
            System.out.println(ans);
            return;
        }
        Map<Integer, Integer> dc = new HashMap<Integer, Integer>();
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
            if (dc.containsKey(cnt)) {
                dc.put(cnt, dc.get(cnt) + 2);
            } else {
                dc.put(cnt, 2);
            }
        }
        int nn = (n - k) * 2;
        Set<Integer> cp = new HashSet<Integer>();
        int cpp = 1;
        for (int i : dc.keySet()) {
            for (int j = 0; j < dc.get(i); j++) {
                cpp += i;
                cp.add(cpp);
            }
        }
        cp.add(1);
        long[][] dp = new long[nn + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= nn; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = dp[i - 1][j];
                if (i!= 1 && i!= 2 && i!= 3 && i!= 4 && i!= 5 && i!= 6 && i!= 7 && i!= 8 && i!= 9 && i!= 10 && i!= 11 && i!= 12 && i!= 13 && i!= 14 && i!= 15 && i!= 16 && i!= 17 && i!= 18 && i!= 19 && i!= 20 && i!= 21 && i!= 22 && i!= 23 && i!= 24 && i!= 25 && i!= 26 && i!= 27 && i!= 28 && i!= 29 && i!= 30 && i!= 31 && i!= 32 && i!= 33 && i!= 34 && i!= 35 && i!= 36 && i!= 37 && i!= 38 && i!= 39 && i!= 40 && i!= 41 && i!= 42 && i!= 43 && i!= 44 && i!= 45 && i!= 46 && i!= 47 && i!= 48 && i!= 49 && i!= 50 && i!= 51 && i!= 52 && i!= 53 && i!= 54 && i!= 55 && i!= 56 && i!= 57 && i!= 58 && i!= 59 && i!= 60 && i!= 61 && i!= 62 && i!= 63 && i!= 64 && i!= 65 && i!= 66 && i!= 67 && i!= 68 && i!= 69 && i!= 70 && i!= 71 && i!= 72 && i!= 73 && i!= 74 && i!= 75 && i!= 76 && i!= 77 && i!= 78 && i!= 79 && i!= 80 && i!= 81 && i!= 82 && i!= 83 && i!= 84 && i!= 85 && i!= 86 && i!= 87 && i!= 88 && i!= 89 && i!= 90 && i!= 91 && i!= 92 && i!= 93 && i!= 94 && i!= 95 && i!= 96 && i!= 97 && i!= 98 && i!= 99 && i!= 100 && i!= 101 && i!= 102 && i!= 103 && i!= 104 && i!= 105 && i!= 106 && i!= 107 && i!= 108 && i!= 109 && i!= 110 && i!= 111 && i!= 1
