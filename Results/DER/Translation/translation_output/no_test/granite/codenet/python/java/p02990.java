System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.io.*;
import java.util.*;

public class Main {
    static long MOD = 100000007;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = in.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int K = Integer.parseInt(arr[1]);
        long[][] comb = new long[N-K+2][N-K+2];
        for (int i = 0; i <= N-K+1; i++) {
            comb[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                comb[i][j] = (comb[i-1][j-1] + comb[i-1][j]) % MOD;
            }
        }
        long[] between = new long[K+1];
        for (int i = 1; i <= K; i++) {
            between[i] = comb[K-1][i-1];
        }
        for (int i = 1; i <= K; i++) {
            if (i > K || i > N-K+1) {
                out.println(0);
            } else {
                long ans = comb[N-K+1][i] * between[i] % MOD;
                out.println(ans);
            }
        }
        in.close();
        out.close();
    }
}
```<|endoftext|>
