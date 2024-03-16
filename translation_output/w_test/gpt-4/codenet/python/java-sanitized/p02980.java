import java.util.Scanner;
import java.math.BigInteger;

public class p02980 {
    private static final int mod = 998244353;
    private static BigInteger[] fact;
    private static BigInteger[] powm;
    private static BigInteger[] pown;
    private static BigInteger[] inv_fact;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        if (N > M) {
            int temp = N;
            N = M;
            M = temp;
        }
        fact = new BigInteger[M + 1];
        powm = new BigInteger[M + 1];
        pown = new BigInteger[M + 1];
        
        fact[0] = BigInteger.ONE;
        powm[0] = BigInteger.ONE;
        pown[0] = BigInteger.ONE;
        for (int i = 1; i <= M; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(mod));
            powm[i] = powm[i - 1].multiply(BigInteger.valueOf(M + 1)).mod(BigInteger.valueOf(mod));
            pown[i] = pown[i - 1].multiply(BigInteger.valueOf(N + 1)).mod(BigInteger.valueOf(mod));
        }

        inv_fact = new BigInteger[M + 1];
        inv_fact[M] = pow(fact[M], mod - 2);
        for (int i = M - 1; i >= 0; i--) {
            inv_fact[i] = inv_fact[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(BigInteger.valueOf(mod));
        }

        BigInteger ans = BigInteger.ZERO;
        for(int i = 0; i <= N; i++) {
            BigInteger term = C(N, i).multiply(C(M, i)).multiply(fact[i]).multiply(powm[N - i]).multiply(pown[M - i]);
            if (i % 2 == 1) {
                term = term.negate();
            }
            ans = ans.add(term).mod(BigInteger.valueOf(mod));
        }

        System.out.println(ans);
        scanner.close();
    }

    private static BigInteger pow(BigInteger n, int m) {
        if (m == 0) {
            return BigInteger.ONE;
        } else if (m == 1) {
            return n;
        } else if (m % 2 == 0) {
            return pow(n, m / 2).pow(2).mod(BigInteger.valueOf(mod));
        } else {
            return pow(n, m / 2).pow(2).multiply(n).mod(BigInteger.valueOf(mod));
        }
    }
    
    private static BigInteger C(int n, int r) {
        return fact[n].multiply(inv_fact[r]).mod(BigInteger.valueOf(mod)).multiply(inv_fact[n - r]).mod(BigInteger.valueOf(mod));
    }
}