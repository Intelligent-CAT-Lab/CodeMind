<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3

Expected output:
41
86
72
-53
36

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
        int[] answer = new int[K];
        for(int S = 3;S <= K+3;S += 2) {
            int x = 0;
            for(int i = 0;i <= (S-1)/2;i++) {
                x = (x + (pow(2, i, MOD) * comb(S-1, i, MOD) * comb(N+K-S+1, i+K-S+1, MOD) % MOD)) % MOD;
            }
            answer[S/2-1] = x;
        }
        if(K & 1 == 1) {
            for(int i = 0;i < K/2;i++) {
                answer[K-1-i] = answer[i];
            }
        }
        for(int i = 0;i < K;i++) {
            System.out.println(answer[i]);
        }
    }
    public static int pow(int a, int b, int mod) {
        int ans = 1;
        while(b > 0) {
            if((b & 1) == 1) {
                ans = (ans * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return ans;
    }
    public static int comb(int n, int k, int mod) {
        if(k < 0 || k > n) {
            return 0;
        }
        return (fact[n] * fact_inv[k] * fact_inv[n-k]) % mod;
    }
    public static int[] init() {
        int[] fact = new int[10001];
        int[] fact_inv = new int[10001];
        fact[0] = 1;
        fact_inv[0] = 1;
        for(int i=1;i<=10000;i++) {
            fact[i] = (fact[i-1] * i) % 998244353;
            fact_inv[i] = (fact_inv[i-1] * i) % 998244353;
            fact_inv[i] = (fact_inv[i] * pow(fact[i], 998244353-2, 998244353)) % 998244353;
        }
        return new int[]{fact, fact_inv};
    }
}

```

'''
<|endoftext|>
