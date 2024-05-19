System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
import java.io.*;
import java.util.*;

public class Main {
    static final long MOD = 998244353;
    static final int U = 10000;
    static long[] fact = new long[U+1];
    static long[] fact_inv = new long[U+1];

    static long comb(int n, int k) {
        if (k < 0 || k > n) return 0;
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

    static long pow(long a, long b, long p) {
        long ans = 1;
        while (b > 0) {
            if (b % 2 == 1) ans = ans * a % p;
            a = a * a % p;
            b /= 2;
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        fact[0] = 1;
        for (int i = 1; i <= U; i++) fact[i] = fact[i-1] * i % MOD;
        fact_inv[U] = pow(fact[U], MOD-2, MOD);
        for (int i = U-1; i >= 0; i--) fact_inv[i] = fact_inv[i+1] * (i+1) % MOD;

        String[] arr = in.readLine().split(" ");
        int K = Integer.parseInt(arr[0]);
        int N = Integer.parseInt(arr[1]);

        List<Long> ans = new ArrayList<>();
        for (int S = 3; S <= K+2; S += 2) {
            int x = (S-1)/2;
            int y = K - S + 1;
            ans.add(F(x, y, N));
            ans.add(F(x, y, N));
        }
        if (K % 2 == 1) ans.remove(ans.size()-1);

        for (long a : ans) out.println(a);
        out.close();
    }
}<|endoftext|>
