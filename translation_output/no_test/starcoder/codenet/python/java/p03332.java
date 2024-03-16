<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8

MOD = 998244353

def getInv(N):
    inv = [0] * (N + 1)
    inv[1] = 1
    inv[1] = 1
    for i in range(2, N + 1):
        inv[i] = (-(MOD // i) * inv[MOD % i]) % MOD

    return inv

def getCmb(N):
    inv = getInv(N)
    nCr = [0] * (N + 1)
    nCr[0] = 1
    nCr[0] = 1
    
    for i in range(1, N + 1):
        nCr[i] = (nCr[i - 1] * (N - i + 1) * inv[i]) % MOD
    
    return nCr

def solve(N, A, B, K):
    ans = 0
    nCr = getCmb(N)
    for a in range(N + 1):
        b = (K - A * a) // B
        if (A * a + B * b == K) and (0 <= b <= N):
            ans += (nCr[a] * nCr[b]) % MOD
            ans %= MOD
    return ans
    

if __name__ == "__main__":
    N, A, B, K = map(int, input().split())
    print(solve(N,A,B,K))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int K = in.nextInt();
        int MOD = 998244353;
        int[] inv = new int[N + 1];
        int[] nCr = new int[N + 1];
        inv[1] = 1;
        nCr[0] = 1;
        for (int i = 2; i <= N; i++) {
            inv[i] = (-(MOD / i) * inv[MOD % i]) % MOD;
        }
        for (int i = 1; i <= N; i++) {
            nCr[i] = (nCr[i - 1] * (N - i + 1) * inv[i]) % MOD;
        }
        int ans = 0;
        for (int a = 0; a <= N; a++) {
            int b = (K - A * a) / B;
            if (A * a + B * b == K && 0 <= b && b <= N) {
                ans += (nCr[a] * nCr[b]) % MOD;
                ans %= MOD;
            }
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
