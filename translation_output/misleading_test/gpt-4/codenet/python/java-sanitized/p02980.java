import java.util.Scanner;
import java.math.BigInteger;

public class p02980 {
    private static final int mod = 998244353;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        if (N > M) {
            int temp = N;
            N = M;
            M = temp;
        }
        
        int[] fact = new int[M + 1];
        int[] powm = new int[M + 1];
        int[] pown = new int[M + 1];
        fact[0] = 1;
        powm[0] = 1;
        pown[0] = 1;
        
        for (int i = 1; i <= M; ++i) {
            fact[i] = (int)(((long)fact[i - 1] * i) % mod);
            powm[i] = (int)(((long)powm[i - 1] * (M + 1)) % mod);
            pown[i] = (int)(((long)pown[i - 1] * (N + 1)) % mod);
        }
        
        int[] inv_fact = new int[M + 1];
        inv_fact[M] = pow(fact[M], mod - 2);
        for (int i = M - 1; i >= 0; --i) {
            inv_fact[i] = (int)(((long)inv_fact[i + 1] * (i + 1)) % mod);
        }
        
        long ans = 0;
        for (int i = 0; i <= N; ++i) {
            long sign = (i % 2 == 0) ? 1 : -1;
            ans += sign * C(N, i) * C(M, i) * fact[i] * powm[N - i] * pown[M - i];
            ans = (ans % mod + mod) % mod;
        }
        
        System.out.println(ans);
        
        scanner.close();
    }
    
    private static int pow(int n, int m) {
        if (m == 0) {
            return 1;
        } else if (m == 1) {
            return n;
        } else if (m % 2 == 0) {
            long res = pow(n, m / 2);
            return (int)((res * res) % mod);
        } else {
            long res = pow(n, m / 2);
            return (int)((res * res % mod) * n % mod);
        }
    }
    
    private static long C(int n, int r) {
        return (long) fact(n) * inv_fact(r) % mod 
                * inv_fact(n - r) % mod;
    }

    private static int fact(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result.mod(BigInteger.valueOf(mod)).intValue();
    }

    private static int inv_fact(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(pow(i, mod - 2)));
        }
        return result.mod(BigInteger.valueOf(mod)).intValue();
    }
}