```java
public class Main {
    static long mod = (long) Math.pow(10, 18) + 3;

    public static void main(String[] args) {
        long[] frac = new long[1341];
        long[] fraci = new long[1341];
        long[] output = frac(1341, frac, fraci);

        int K = 123456; // example value for K
        int seg = 1 << 7;
        String OT = "EESSTTIIVVAALL";

        int[] L = new int[301];
        for (int i = 300; i >= 0; i--) {
            long ci = 0;
            for (int j = 0; j < 8; j++) {
                ci += comb(j+i, i, frac, fraci) * (1 << j);
            }
            L[i] = K / ci;
            K %= ci;
        }

        StringBuilder ans = new StringBuilder();
        ans.append("F".repeat(K)).append("ESTIVAL");
        for (int l : L) {
            ans.insert(0, "F".repeat(l) + OT);
        }

        System.out.println(ans);
    }

    public static long[] frac(int limit, long[] frac, long[] fraci) {
        frac[0] = 1;
        for (int i = 1; i < limit; i++) {
            frac[i] = (long) i * frac[i-1] % mod;
        }

        fraci[limit-1] = pow(frac[limit-1], mod - 2, mod);
        for (int i = limit-2; i >= 0; i--) {
            fraci[i] = (fraci[i+1] * (limit + i + 1)) % mod;
        }

        return new long[]{frac, fraci};
    }

    public static long comb(int a, int b, long[] frac, long[] fraci) {
        if (!(a >= b && b >= 0)) {
            return 0;
        }
        return (frac[a] * fraci[b] % mod) * fraci[a-b] % mod;
    }

    public static long pow(long base, long exponent, long modulus) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }
            base = (base * base) % modulus;
            exponent = exponent / 2;
        }
        return result;
    }
}
```
