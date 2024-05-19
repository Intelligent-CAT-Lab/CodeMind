System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 1 2 5

Expected output:
40


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


Answer:
```java
import java.util.*;

public class Main {
    static final int MOD = 998244353;

    static int[] getInv(int N) {
        int[] inv = new int[N + 1];
        inv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i <= N; i++) {
            inv[i] = (-(MOD / i) * inv[MOD % i]) % MOD;
        }
        return inv;
    }

    static int[] getCmb(int N) {
        int[] inv = getInv(N);
        int[] nCr = new int[N + 1];
        nCr[0] = 1;
        nCr[0] = 1;
        for (int i = 1; i <= N; i++) {
            nCr[i] = (nCr[i - 1] * (N - i + 1) * inv[i]) % MOD;
        }
        return nCr;
    }

    static int solve(int N, int A, int B, int K) {
        int ans = 0;
        int[] nCr = getCmb(N);
        for (int a = 0; a <= N; a++) {
            int b = (K - A * a) / B;
            if (A * a + B * b == K && 0 <= b && b <= N) {
                ans += (nCr[a] * nCr[b]) % MOD;
                ans %= MOD;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(solve(N, A, B, K));
    }
}
```<|endoftext|>
