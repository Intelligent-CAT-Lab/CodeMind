import java.util.*;
import java.math.BigInteger;

public class p03066 {
    static final int MOD = 998244353;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        scanner.close();
        
        long[] fac = new long[N + 11];
        long[] inv = new long[N + 11];
        
        // Precompute factorials and inverses modulo MOD
        fac[0] = 1;
        for (int i = 1; i <= N + 10; i++) {
            fac[i] = fac[i - 1] * i % MOD;
        }
        
        // Fermat's Little