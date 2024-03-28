<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
499999932
750000005
749999993

```
B, W = map(int, input().split())
mod = int(1e9) + 7
def doubling(n, m):
  y = 1
  base = n
  while m != 0:
    if m % 2 == 1:
      y *= base
      y %= mod
    base *= base
    base %= mod
    m //= 2
  return y
def inved(a):
  x, y, u, v, k, l = 1, 0, 0, 1, a, mod
  while l != 0:
    x, y, u, v = u, v, x - u * (k // l), y - v * (k // l)
    k, l = l, k % l
  return x % mod

fact = [1 for i in range(B+W+1)]
invf = [1 for i in range(B+W+1)]
for i in range(B+W):
  fact[i+1] = (fact[i] * (i+1)) % mod
invf[-1] = inved(fact[-1])
for i in range(B+W, 0, -1):
  invf[i-1] = (invf[i] * i) % mod
bina = [1 for i in range(B+W+1)]
invb = [1 for i in range(B+W+1)]
for i in range(B+W):
  bina[i+1] = (bina[i] * 2) % mod
invb[-1] = inved(bina[-1])
for i in range(B+W, 0, -1):
  invb[i-1] = (invb[i] * 2) % mod
if B == W:
  for i in range(B+W):
    print(invf[2])
elif B > W:
  for i in range(W):
    print(invf[2])
  P = invf[2]
  for i in range(W+1, B+1):
    F = (fact[i-2] * invf[i-1-W] * invf[W-1]) % mod
    F *= invb[i]
    F %= mod
    F += P
    F %= mod
    print(F)
    P = F
  for i in range(B+1, B+W+1):
    F = invf[i-1-B] * invf[B-1]
    F %= mod
    F *= fact[i-2]
    F %= mod
    F *= mod - 1
    F += (fact[i-2] * invf[i-1-W] * invf[W-1]) % mod
    F %= mod
    F *= invb[i]
    F %= mod
    F += P
    F %= mod
    print(F)
    P = F
elif B < W:
  for i in range(B):
    print(invf[2])
  P = invf[2]
  for i in range(B+1, W+1):
    F = (fact[i-2] * invf[i-1-B] * invf[B-1]) % mod
    F *= mod - 1
    F %= mod
    F *= invb[i]
    F %= mod
    F += P
    F %= mod
    print(F)
    P = F
  for i in range(W+1, B+W+1):
    F = invf[i-1-B] * invf[B-1]
    F %= mod
    F *= fact[i-2]
    F %= mod
    F *= mod - 1
    F += (fact[i-2] * invf[i-1-W] * invf[W-1]) % mod
    F %= mod
    F *= invb[i]
    F %= mod
    F += P
    F %= mod
    print(F)
    P = F
```

@@ Response
```java
import java.util.*;

public class Main {
    static long mod = (long) Math.pow(10, 9) + 7;
    static long[] fact, invf, bina, invb;

    static long doubling(long n, long m) {
        long y = 1;
        long base = n;
        while (m != 0) {
            if (m % 2 == 1) {
                y *= base;
                y %= mod;
            }
            base *= base;
            base %= mod;
            m /= 2;
        }
        return y;
    }

    static long inved(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            long t = k / l;
            x -= u * t;
            y -= v * t;
            k -= t * l;
            long temp = u;
            u = x;
            x = temp;
            temp = v;
            v = y;
            y = temp;
            l = k % l;
        }
        return x % mod;
    }

    static void preprocess(int B, int W) {
        fact = new long[B + W + 1];
        invf = new long[B + W + 1];
        bina = new long[B + W + 1];
        invb = new long[B + W + 1];
        fact[0] = 1;
        invf[B + W] = inved(fact[B + W]);
        for (int i = B + W; i > 0; i--) {
            invf[i - 1] = (invf[i] * i) % mod;
        }
        bina[0] = 1;
        invb[B + W] = inved(bina[B + W]);
        for (int i = B + W; i > 0; i--) {
            invb[i - 1] = (invb[i] * 2) % mod;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int W = sc.nextInt();
        preprocess(B, W);
        for (int i = 1; i <= B + W; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }
        if (B == W) {
            for (int i = 0; i < B + W; i++) {
                System.out.println(invf[2]);
            }
        } else if (B > W) {
            for (int i = 0; i < W; i++) {
                System.out.println(invf[2]);
            }
            long P = invf[2];
            for (int i = W + 1; i <= B + 1; i++) {
                long F = (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                F = (F * invb[i]) % mod;
                F = (F + P) % mod;
                System.out.println(F);
                P = F;
            }
            for (int i = B + 2; i <= B + W + 1; i++) {
                long F = (invf[i - 1 - B] * invf[B - 1]) % mod;
                F = (F * fact[i - 2]) % mod;
                F = (F * (mod - 1)) % mod;
                F = (F + (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod) % mod;
                F = (F * inv
