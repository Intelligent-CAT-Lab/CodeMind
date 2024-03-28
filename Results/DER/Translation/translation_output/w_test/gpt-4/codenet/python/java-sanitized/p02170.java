import java.util.Scanner;
import java.math.BigInteger;

public class p02170 {
    static final long mod = 998244353;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        int a = in.nextInt();
        
        long[] lst = new long[k + 1];
        lst[k - 1] = 1;

        long A = BigInteger.valueOf(a)
                .multiply(BigInteger.valueOf(100L * n).modInverse(BigInteger.valueOf(mod)))
                .mod(BigInteger.valueOf(mod))
                .longValue();

        long inv = BigInteger.valueOf(n).modInverse(BigInteger.valueOf(mod)).longValue();

        for (int i = k - 2; i >= 0; i--) {
            if (k > i + n) {
                lst[i] = A * (lst[i + 1] - lst[i + n + 1]) + lst[i + 1];
                lst[i] %= mod;
            } else {
                lst[i] = A * (lst[i + 1] - lst[k]) + (n - (k - i) + 1) * inv + lst[i + 1];
                lst[i] %= mod;
            }
        }
        
        System.out.println((lst[0] - lst[1] + mod) % mod);
        
        in.close();
    }
}