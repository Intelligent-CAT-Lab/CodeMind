<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
    private static final BigInteger MOD = BigInteger.valueOf((long)Math.pow(10,9)+7);
    private static BigInteger[][] comb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        comb = new BigInteger[N+1][K+1];
        for(int i=0; i<=N; i++) {
            for(int j=0; j<=Math.min(i,K); j++) {
                if(j==0 || j==i) comb[i][j] = BigInteger.ONE;
                else comb[i][j] = comb[i-1][j-1].add(comb[i-1][j]);
                comb[i][j] = comb[i][j].mod(MOD);
            }
        }

        for(int i=1; i<=K; i++) {
            if(i > K || i > N-K+1) {
                System.out.println(0);
            } else {
                BigInteger ans = comb[N-K+1][i].multiply(between(N,K,i));
                ans = ans.mod(MOD);
                System.out.println(ans);
            }
        }
    }

    private static BigInteger between(int n, int k, int i) {
        if(i==1) return BigInteger.ONE;
        return comb[k-1][i-1];
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and K from the standard input, calculates the combinations and between values, and prints the results. The calculations are done modulo 10^9+7 to prevent overflow.
<|EOT|>
