System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.io.*;
import java.util.*;

public class Main {
    static int MOD = 998244353;
    static int U = 100000;
    static long[] fact = new long[U+1];
    static long[] fact_inv = new long[U+1];

    static long comb(int n, int k) {
        if (n < 0 || k < 0 || n < k) {
            return 0;
        }
        return fact[n] * fact_inv[k] % MOD * fact_inv[n-k] % MOD;
    }

    static long F(int x, int y, int N) {
        long ans = 0;
        int n = Math.min(x, N);
        for (int i = 0; i <= n; i++) {
            ans += comb(x, i) * pow(2, i, MOD) % MOD * comb(N+y-1, i+y-1) % MOD;
            ans %= MOD;
        }
        return ans;
    }

    static long pow(long a, long n, long mod) {
        long ans = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                ans = ans * a % mod;
            }
            a = a * a % mod;
            n /= 2;
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = in.readLine().split(" ");
        int K = Integer.parseInt(arr[0]);
        int N = Integer.parseInt(arr[1]);
        fact[0] = 1;
        fact_inv[0] = 1;
        for (int i = 1; i <= U; i++) {
            fact[i] = fact[i-1] * i % MOD;
            fact_inv[i] = pow(fact[i], MOD-2, MOD);
        }
        List<Long> answer = new ArrayList<>();
        for (int S = 3; S <= K+2; S += 2) {
            int x = (S-1)/2;
            int y = K - S + 1;
            long ans = F(x, y, N);
            answer.add(ans);
            answer.add(ans);
        }
        if (K % 2 == 1) {
            answer.remove(answer.size()-1);
            Collections.reverse(answer);
            for (int i = 0; i < answer.size(); i++) {
                out.println(answer.get(i));
            }
        } else {
            Collections.reverse(answer);
            for (int i = 0; i < answer.size(); i++) {
                out.println(answer.get(i));
            }
        }
        out.close();
    }
}
```<|endoftext|>
