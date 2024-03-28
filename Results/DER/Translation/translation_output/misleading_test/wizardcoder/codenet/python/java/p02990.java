Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
3
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

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;

        BigInteger[][] dp = new BigInteger[N+1][K+1];
        for(int i=0;i<=N;i++){
            for(int j=0;j<=K;j++){
                dp[i][j] = BigInteger.ZERO;
            }
        }

        for(int i=1;i<=K;i++){
            dp[i][i] = BigInteger.ONE;
        }

        for(int i=K+1;i<=N;i++){
            for(int j=1;j<=K;j++){
                dp[i][j] = dp[i-1][j].multiply(BigInteger.valueOf(i-1)).divide(BigInteger.valueOf(j)).mod(BigInteger.valueOf(MOD));
            }
        }

        for(int i=1;i<=K;i++){
            if(i > K || i > N-K+1){
                System.out.println(0);
            }else{
                BigInteger ans = dp[N-K+1][i].multiply(BigInteger.valueOf(between(N,K,i))).mod(BigInteger.valueOf(MOD));
                System.out.println(ans);
            }
        }
    }

    public static int between(int n, int k, int i){
        if(i == 1){
            return 1;
        }
        int res = 1;
        for(int j=1;j<=i-1;j++){
            res = res * (k-j) % 1000000007;
        }
        return res;
    }
}
```<|endoftext|>
