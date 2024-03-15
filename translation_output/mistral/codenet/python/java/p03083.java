<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B, W;
        B = sc.nextInt();
        W = sc.nextInt();
        int mod = (int) 1e9 + 7;
        int fact[] = new int[B + W + 1];
        int invf[] = new int[B + W + 1];
        int bina[] = new int[B + W + 1];
        int invb[] = new int[B + W + 1];
        Arrays.fill(fact, 1);
        Arrays.fill(invf, 1);
        Arrays.fill(bina, 1);
        Arrays.fill(invb, 1);
        for (int i = 1; i <= B + W; i++) {
            fact[i] = (fact[i - 1] * (i + 1)) % mod;
            invf[i] = inved(fact[i]);
            bina[i] = (bina[i - 1] * 2) % mod;
            invb[i] = inved(bina[i]);
        }
        int invp = inved(fact[B + W - 2]);
        int p = invp * 2;
        int q = mod - 1;
        int r = 0;
        if (B == W) {
            for (int i = 1; i <= B + W; i++) {
                System.out.println(invf[2]);
            }
        } else if (B > W) {
            for (int i = 1; i <= W; i++) {
                System.out.println(invf[2]);
            }
            for (int i = 1; i <= B + W - W; i++) {
                int f = (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                f *= bina[i];
                f %= mod;
                f += p;
                f %= mod;
                System.out.println(f);
                p = f;
            }
            for (int i = 1; i <= B + W; i++) {
                int f = invf[i - 1 - B] * invf[B - 1];
                f %= mod;
                f *= fact[i - 2];
                f %= mod;
                f *= q;
                f += (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                f %= mod;
                f *= bina[i];
                f %= mod;
                f += p;
                f %= mod;
                System.out.println(f);
                p = f;
            }
        } else {
            for (int i = 1; i <= B; i++) {
                System.out.println(invf[2]);
            }
            for (int i = 1; i <= B + W - B; i++) {
                int f = (fact[i - 2] * invf[i - 1 - B] * invf[B - 1]) % mod;
                f *= bina[i];
                f %= mod;
                f += p;
                f %= mod;
                System.out.println(f);
                p = f;
            }
            for (int i = 1; i <= W + B; i++) {
                int f = invf[i - 1 - B] * invf[B - 1];
                f %= mod;
                f *= fact[i - 2];
                f %= mod;
                f *= q;
                f += (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                f %= mod;
                f *= bina[i];
                f %= mod;
                f += p;
                f
