<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.*;

public class Main {
    static final long MOD = 998244353;

    static long[] getInv(int N) {
        long[] inv = new long[N + 1];
        inv[1] = 1;
        for (int i = 2; i <= N; i++) {
            inv[i] = (-(MOD / i) * inv[(int)(MOD % i)]) % MOD;
        }
        return inv;
    }

    static long[] getCmb(int N) {
        long[] inv = getInv(N);
        long[] nCr = new long[N + 1];
        nCr[0] = 1;
        for (int i = 1; i <= N; i++) {
            nCr[i] = (nCr[i - 1] * (N - i + 1) * inv[i]) % MOD;
        }
        return nCr;
    }

    static long solve(int N, int A, int B, int K) {
        long ans = 0;
        long[] nCr = getCmb(N);
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
```

This Java code does the same thing as the Python code. It calculates the combination and inverse of a number modulo MOD, and then uses these to solve the problem. The main difference is that Java uses `int` for integer types, and `long` for large integers. Also, Java uses `System.in` for input instead of `input()` in Python.<｜end▁of▁sentence｜>
