<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
B, W = map(int, input().split())
mod = int(1e9) + 7
def doubling(n, m):
  y = 1
  base = n
  while m!= 0:
    if m % 2 == 1:
      y *= base
      y %= mod
    base *= base
    base %= mod
    m //= 2
  return y
def inved(a):
  x, y, u, v, k, l = 1, 0, 0, 1, a, mod
  while l!= 0:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    static long mod = (long) (1e9 + 7);
    static long[] fact = new long[100001];
    static long[] invf = new long[100001];
    static long[] bina = new long[100001];
    static long[] invb = new long[100001];
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int B, W;
        B = sc.nextInt();
        W = sc.nextInt();
        fact[0] = 1;
        invf[0] = 1;
        bina[0] = 1;
        invb[0] = 1;
        for (int i = 1; i <= B + W; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
            invf[i] = (invf[i - 1] * inved(i)) % mod;
            bina[i] = (bina[i - 1] * 2) % mod;
            invb[i] = (invb[i - 1] * inved(2)) % mod;
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
            for (int i = W + 1; i <= B; i++) {
                long F = (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
            for (int i = B + 1; i <= B + W; i++) {
                long F = invf[i - 1 - B] * invf[B - 1];
                F %= mod;
                F *= fact[i - 2];
                F %= mod;
                F *= mod - 1;
                F += (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                F %= mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
        } else {
            for (int i = 0; i < B; i++) {
                System.out.println(invf[2]);
            }
            long P = invf[2];
            for (int i = B + 1; i <= W; i++) {
                long F = (fact[i - 2] * invf[i - 1 - B] * invf[B - 1]) % mod;
                F *= mod - 1;
                F %= mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
            for (int i = W + 1; i <= B + W; i++) {
                long F = invf[i - 1 - B] * invf[B - 1];
                F %= mod;
                F *= fact[i - 2];
                F %= mod;
                F *= mod - 1;
                F += (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                F %= mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
        }
    }
    public static long inved(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l!= 0) {
            x = u;
            y = v;
            u = x - u * (k / l);
            v = y - v * (k / l);
            k = l;
            l = k % l;
        }
        return x % mod;
    }
}
```
'''
<|endoftext|>
