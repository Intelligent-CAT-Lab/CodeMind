<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3

Expected output:
7
7
4
7
7


```
import sys
input = sys.stdin.readline

# K+1 - x ã§ãã¤ã -> i ã¨ 2K+2-i ã¯åã

MOD = 998244353
U = 10000
fact = [1] * (U+1)
fact_inv = [1] * (U+1)
for n in range(1,U+1):
    fact[n] = fact[n-1] * n % MOD
fact_inv[n] = pow(fact[n], MOD-2, MOD)
for n in range(U,0,-1):
    fact_inv[n-1] = fact_inv[n] * n % MOD

def comb(n,k):
    if not (0 <= k <= n):
        return 0
    return fact[n] * fact_inv[k] * fact_inv[n-k] % MOD

K,N = map(int,input().split())

def F(x,y,N):
    n = min(x, N)
    return sum(comb(x,i) * pow(2,i,MOD) * comb(N+y-1,i+y-1) % MOD for i in range(n+1)) % MOD

answer = []
for S in range(3,K+3,2):
    x = F((S-1)//2, K - S + 1, N)
    answer.append(x)
    answer.append(x)

if K & 1:
    answer = answer[:-1]
    answer += answer[:-1][::-1]
else:
    answer += answer[:-1][::-1]    

print('\n'.join(map(str,answer)))


```

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int MOD = 998244353;
        int U = 10000;
        int[] fact = new int[U+1];
        int[] fact_inv = new int[U+1];
        fact[0] = 1;
        fact_inv[0] = 1;
        for(int i=1;i<=U;i++) {
            fact[i] = (fact[i-1] * i) % MOD;
            fact_inv[i] = (fact_inv[i-1] * i) % MOD;
            fact_inv[i] = (fact_inv[i] * pow(fact[i], MOD-2, MOD)) % MOD;
        }
        int[] comb = new int[U+1];
        for(int i=0;i<=U;i++) comb[i] = 0;
        comb[0] = 1;
        for(int i=1;i<=U;i++) comb[i] = (comb[i-1] * i) % MOD;
        int[] ans = new int[K];
        for(int i=0;i<K;i++) {
            int x = (i+1) / 2;
            int y = K - i - 1;
            int n = Math.min(x, N);
            int sum = 0;
            for(int j=0;j<=n;j++) {
                sum = (sum + (comb[x] * pow(2, j, MOD) % MOD) * (comb[N+y-1] * pow(2, j+y-1, MOD) % MOD) % MOD) % MOD;
            }
            ans[i] = sum;
        }
        if(K % 2 == 1) {
            for(int i=0;i<K/2;i++) {
                System.out.println(ans[i]);
            }
            for(int i=K/2-1;i>=0;i--) {
                System.out.println(ans[i]);
            }
        } else {
            for(int i=0;i<K/2;i++) {
                System.out.println(ans[i]);
            }
            for(int i=K/2;i<K;i++) {
                System.out.println(ans[i]);
            }
        }
    }
}
```
<|endoftext|>
