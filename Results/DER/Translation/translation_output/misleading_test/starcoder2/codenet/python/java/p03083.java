
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int W = sc.nextInt();
        int mod = 1000000007;
        int doubling(int n, int m) {
            int y = 1;
            int base = n;
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
        int inved(int a) {
            int x = 1;
            int y = 0;
            int u = 0;
            int v = 1;
            int k = a;
            int l = mod;
            while (l != 0) {
                x = u;
                y = v;
                u = x - u * (k / l);
                v = y - v * (k / l);
                k = l;
                l = k % l;
            }
            return x % mod;
        }
        int[] fact = new int[B+W+1];
        int[] invf = new int[B+W+1];
        for (int i = 0; i < B+W+1; i++) {
            fact[i] = 1;
        }
        for (int i = 1; i < B+W+1; i++) {
            fact[i] = (fact[i-1] * i) % mod;
        }
        invf[B+W] = inved(fact[B+W]);
        for (int i = B+W-1; i >= 0; i--) {
            invf[i] = (invf[i+1] * (i+1)) % mod;
        }
        int[] bina = new int[B+W+1];
        int[] invb = new int[B+W+1];
        for (int i = 0; i < B+W+1; i++) {
            bina[i] = 1;
        }
        for (int i = 1; i < B+W+1; i++) {
            bina[i] = (bina[i-1] * 2) % mod;
        }
        invb[B+W] = inved(bina[B+W]);
        for (int i = B+W-1; i >= 0; i--) {
            invb[i] = (invb[i+1] * 2) % mod;
        }
        if (B == W) {
            for (int i = 0; i < B+W; i++) {
                System.out.println(invf[2]);
            }
        } else if (B > W) {
            for (int i = 0; i < W; i++) {
                System.out.println(invf[2]);
            }
            int P = invf[2];
            for (int i = W+1; i < B+1; i++) {
                int F = (fact[i-2] * invf[i-1-W] * invf[W-1]) % mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
            for (int i = B+1; i < B+W+1; i++) {
                int F = invf[i-1-B] * invf[B-1];
                F %= mod;
                F *= fact[i-2];
                F %= mod;
                F *= mod - 1;
                F += (fact[i-2] * invf[i-1-W] * invf[W-1]) % mod;
                F %= mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
        } else if (B < W) {
            for (int i = 0; i < B; i++) {
                System.out.println(invf[2]);
            }
            int P = invf[2];
            for (int i = B+1; i < W+1; i++) {
                int F = (fact[i-2] * invf[i-1-B] * invf[B-1]) % mod;
                F *= mod - 1;
                F %= mod;
                F *= invb
