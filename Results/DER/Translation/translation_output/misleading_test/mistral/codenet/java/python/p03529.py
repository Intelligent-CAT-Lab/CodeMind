<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
58

```
import java.util.*;

class p03529 {
    static long powerMod(long x, long exponent) {
	long prod = 1;
	for (int i = 63; i >= 0; --i) {
	    prod = (prod * prod) % MOD;
	    if ((exponent & 1L << i) != 0) {
		prod = (prod * x) % MOD;
	    }
	}
	return prod;
    }
    static int f(int n, int k) {
        int t=0;
        for(int i=n;i>=1;--i){
            t+=(t+i)/i;
        }
        return t;
    }
    static final long MOD=1000000007;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int x=0;
        int l=f(n,k);
        long[][]dp=new long[n+1][l+1];
        for(int i=1;i<=n;++i){
            long m=powerMod(k+1,i-1);
            for(int u=0;u<=l;++u){
                long t=0;
                for(int j=0;j<=Math.min(i,k);++j)
                    if(u+(u+j)/i<=l){
                        t+=dp[i-1][u+(u+j)/i];
                        t+=((u+j)%i)*m%MOD;
                        t%=MOD;
                    }
                for(int j=Math.min(i,k)+1;j<=k;++j)
                    t=(t+dp[i-1][u]+(j+u)*m)%MOD;
                dp[i][u]=t;
            }
        }
        System.out.println(dp[n][0]);
    }
}

```
[/INST]
```python
import sys

def powerMod(x, exponent):
    prod = 1
    for i in range(63, -1, -1):
        prod = (prod * prod) % 1000000007
        if ((exponent & (1 << i)) != 0):
            prod = (prod * x) % 1000000007
    return prod

def f(n, k):
    t = 0
    for i in range(n, 1, -1):
        t += (t + i) // i
    return t

MOD = 1000000007

n, k = map(int, sys.stdin.readline().strip().split())
x = 0
l = f(n, k)

dp = [[0 for _ in range(l + 1)] for _ in range(n + 1)]
for i in range(1, n + 1):
    m = powerMod(k + 1, i - 1)
    for u in range(0, l + 1):
        t = 0
        for j in range(0, min(i, k) + 1):
            if u + (u + j) // i <= l:
                t += dp[i - 1][u + (u + j) // i]
                t += ((u + j) % i) * m % 1000000007
                t %= 1000000007
        for j in range(min(i, k) + 1, k + 1):
            t = (t + dp[i - 1][u] + (j + u) * m) % 1000000007
        dp[i][u] = t

print(dp[n][0])
```</s>
