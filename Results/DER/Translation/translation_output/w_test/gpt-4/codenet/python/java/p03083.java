Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {

    static final int MOD = (int) (1e9) + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int W = sc.nextInt();

        int[] fact = new int[B + W + 1];
        int[] invf = new int[B + W + 1];
        int[] bina = new int[B + W + 1];
        int[] invb = new int[B + W + 1];

        fact[0] = invf[0] = bina[0] = invb[0] = 1;
        for (int i = 1; i < fact.length; i++) fact[i] = (int) ((fact[i - 1] * (long) i) % MOD);
        invf[fact.length - 1] = inved(fact[fact.length - 1]);
        for (int i = fact.length - 1; i > 0; i--) invf[i - 1] = (int) ((invf[i] * (long) i) % MOD);
        for (int i = 1; i < bina.length; i++) bina[i] = (int) ((bina[i - 1] * 2L) % MOD);
        invb[bina.length - 1] = inved(bina[bina.length - 1]);
        for (int i = bina.length - 1; i > 0; i--) invb[i - 1] = (int) ((invb[i] * 2L) % MOD);

        if (B == W) {
            for (int i = 0; i < B + W; i++) System.out.println(invf[2]);
        } else {
            int P = invf[2];
            for (int i = 0; i < Math.min(B, W); i++) System.out.println(P);
            for (int i = Math.min(B, W) + 1; i <= Math.max(B, W); i++) {
                long F = (fact[i - 2] * (long) invf[i - 1 - Math.min(B, W)] % MOD * invf[Math.min(B, W) - 1]) % MOD;
                F = F * invb[i] % MOD;
                F += P;
                F %= MOD;
                System.out.println(F);
                P = (int) F;
            }
            for (int i = Math.max(B, W) + 1; i < B + W + 1; i++) {
                long F = ((fact[i - 2] * (long) invf[i - 1 - Math.min(B, W)] % MOD * invf[Math.min(B, W) - 1]) + MOD - fact[i - 2]) % MOD;
                F = (F + (long) invf[i - 1 - Math.max(B, W)] * invf[Math.max(B, W) - 1] + P) % MOD;
                F = F * invb[i] % MOD;
                System.out.println(F);
                P = (int) F;
            }
        }

        sc.close();
    }

    static long doubling(long n, long m) {
        long y = 1;
        long base = n;
        while (m != 0) {
            if (m % 2 == 1) {
                y = (y * base) % MOD;
            }
            base = (base * base) % MOD;
            m /= 2;
        }
        return y;
    }

    static int inved(int a) {
        int x = 1, y = 0, u = 0, v = 1, k = a, l = MOD;
        while (l != 0) {
            int div = k / l;
            x -= u * div;
            y -= v * div;

            int temp = u;
            u = x;
            x = temp;

            temp = v;
            v = y;
            y = temp;

            temp = l;
            l = k % l;
            k = temp;
        }
        return (x + MOD) % MOD;
    }
}
```

This Java code includes all the necessary functions to achieve the same results as the original Python code when provided with the same input. Remember to run the Java code within a class structure and to include the necessary imports, e.g., for `Scanner`.
