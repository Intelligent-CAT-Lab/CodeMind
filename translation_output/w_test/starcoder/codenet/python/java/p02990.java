<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
3
6
1


```
import bisect
import sys
sys.setrecursionlimit(10**9)

def main():
    N,K = map(int,input().split())
    MOD = 10**9+7

    def between(n,k,i):
        if i == 1:
            return 1
        return comb(k-1,i-1,MOD)

    def comb(n, r, mod):
        r = min(r, n-r)
        res = 1
        for i in range(r):
            res = res * (n - i) * pow(i+1, mod-2, mod) % mod
        return res

    for i in range(1,K+1):
        if i > K or i > N-K+1:
            print(0)
        else:
            ans = comb(N-K+1,i,MOD) * between(N,K,i)
            ans %= MOD
            print(ans)



if __name__ == "__main__":
  main()
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;

        long[][] dp = new long[N+1][K+1];
        for(int i=1;i<=N;i++) {
            dp[i][0] = 1;
        }
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=K;j++) {
                if(j > i) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = (dp[i-1][j] + dp[i-1][j-1]) % MOD;
                }
            }
        }
        for(int i=1;i<=K;i++) {
            System.out.println(dp[N][i]);
        }
    }
}
```
<|endoftext|>
