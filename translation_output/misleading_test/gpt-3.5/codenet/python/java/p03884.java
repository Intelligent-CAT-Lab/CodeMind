```java
import java.util.*;

public class Main {
    static long mod = (long) Math.pow(10, 18) + 3;
    
    public static long pow(long base, long exp, long mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            exp = exp >> 1;
            base = (base * base) % mod;
        }
        return result;
    }

    public static long[] frac(int limit) {
        long[] frac = new long[limit];
        frac[0] = 1;
        for (int i = 2; i < limit; i++) {
            frac[i] = (i * frac[i - 1]) % mod;
        }
        
        long[] fraci = new long[limit];
        fraci[limit - 1] = pow(frac[limit - 1], mod - 2, mod);
        for (int i = limit - 2; i >= 0; i--) {
            fraci[i] = (fraci[i + 1] * (limit + i + 1)) % mod;
        }
        return frac;
    }

    public static long comb(long a, long b, long[] frac, long[] fraci) {
        if (!(a >= b && b >= 0)) {
            return 0;
        }
        return (frac[(int)a] * fraci[(int)b] % mod * fraci[(int)(a - b)]) % mod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int K = scanner.nextInt();
        int seg = (int) Math.pow(2, 7);
        String OT = "EESSTTIIVVAALL";

        long[] L = new long[301];
        for (int i = 300; i >= 0; i--) {
            long ci = 0;
            for (int j = 0; j < 8; j++) {
                ci += comb(j + i, i, frac(1341), frac(1341)) * Math.pow(2, j);
            }
            L[i] = K / ci;
            K %= ci;
        }

        String ans = "F".repeat((int) K) + "ESTIVAL";
        for (long l : L) {
            ans = "F".repeat((int) l) + OT + ans;
        }

        System.out.println(ans);
    }
}
```
