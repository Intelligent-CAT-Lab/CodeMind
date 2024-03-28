Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 4 0

Expected output:
211

```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**13
mod = 10**9+7
dd = [(-1,0),(0,1),(1,0),(0,-1)]
ddn = [(-1,0),(-1,1),(0,1),(1,1),(1,0),(1,-1),(0,-1),(-1,-1)]

def LI(): return [int(x) for x in sys.stdin.readline().split()]
def LI_(): return [int(x)-1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def LS(): return sys.stdin.readline().split()
def I(): return int(sys.stdin.readline())
def F(): return float(sys.stdin.readline())
def S(): return input()
def pf(s): return print(s, flush=True)

def inv(x):
    return pow(x, mod - 2, mod)

cms = 10**6
cm = [0] * cms

def comb_init():
    cm[0] = 1
    for i in range(1, cms):
        cm[i] = cm[i-1] * i % mod

def comb(a, b):
    return (cm[a] * inv(cm[a-b]) % mod) * inv(cm[b]) % mod


def main():
    rr = []

    def f(n,m,k):
        comb_init()
        r = 0
        for i in range(k+1):
            j = k - i
            mt = comb(n+m+k*2, n+i*2)
            lk = rk = 1
            if i > 0:
                lk = (comb(n+i*2, i) - comb(n+i*2, i-1)) % mod
            if j > 0:
                rk = (comb(m+j*2, j) - comb(m+j*2, j-1)) % mod
            r += mt * lk * rk % mod
            r %= mod

        return r

    while 1:
        n,m,k = LI()
        if n == 0:
            break
        rr.append(f(n,m,k))
        break

    return '\n'.join(map(str, rr))


print(main())


```

### Response:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, m, k;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            m = Integer.parseInt(br.readLine());
            k = Integer.parseInt(br.readLine());

            int[][] dp = new int[n+1][n+1];
            for (int i = 0; i <= n; i++) {
                Arrays.fill(dp[i], -1);
            }

            int res = 0;
            for (int i = 0; i <= k; i++) {
                for (int j = 0; j <= k; j++) {
                    if (i + j > k) continue;
                    if (dp[i][j]!= -1) continue;
                    dp[i][j] = 0;
                    for (int x = 0; x <= i; x++) {
                        for (int y = 0; y <= j; y++) {
                            if (x + y > i + j) continue;
                            dp[i][j] = (dp[i][j] + dp[x][y] * dp[i-x][j-y]) % 1000000007;
                        }
                    }
                }
            }

            res = dp[k][k];
            bw.write(res + "\n");
        }

        bw.close();
        br.close();
    }
}
```<|endoftext|>
