import java.util.*;
import java.math.*;

public class p03257 {
    static final int U = 100000;
    static boolean[] isPrime = new boolean[U+1];
    static ArrayList<Integer> primes = new ArrayList<>();
    static BigInteger[][] A;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        sieve();
        int MM = 510;
        int M = 255;
        A = new BigInteger[MM][MM];
        for (int i = 0; i < MM; i++)
            Arrays.fill(A[i], BigInteger.ONE);
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < M; i++) {
                    A[n][i*2] = A[n][i*2].multiply(BigInteger.valueOf(primes.get(n/2+i)));
                    A[n][i*2] = A[n][i*2].multiply(BigInteger.valueOf(primes.get(MM+M-n/2+i)));
                    if (i > 0) {
                        A[n][i*2] = A[n][i*2].multiply(A[n][(i-1)*2+1]);
                        A[n][i*2+1] = A[n][i*2];
                    }
                }
                for (int i = M; i < MM-n/2; i++) {
                    A[n][i*2] = A[n][i*2].multiply(BigInteger.valueOf(primes.get(MM+i)));
                    A[n][i*2] = A[n][i*2].multiply(BigInteger.valueOf(primes.get(2*MM-n/2-i)));
                    if (i > 0) {
                        A[n][i*2] = A[n][i*2].multiply(A[n][(i-1)*2+1]);
                        A[n][i*2+1] = A[n][i*2];
                    }
                }
            } else {
                for (int i = 0; i < M; i++) {
                    A[n][i*2+1] = A[n][i*2+1].multiply(BigInteger.valueOf(primes.get((n+1)/2+i)));
                    A[n][i*2+1] = A[n][i*2+1].multiply(BigInteger.valueOf(primes.get(MM+M-(n-1)/2+i)));
                    if (i > 0) {
                        A[n][i*2+1] = A[n][i*2+1].multiply(A[n][(i-1)*2]);
                        A[n][i*2] = A[n][i*2+1];
                    }
                }
                for (int i = M; i < MM-(n-1)/2; i++) {
                    A[n][i*2+1] = A[n][i*2+1].multiply(BigInteger.valueOf(primes.get(MM+i)));
                    A[n][i*2+1] = A[n][i*2+1].multiply(BigInteger.valueOf(primes.get(2*MM-(n-1)/2-i)));
                    if (i > 0) {
                        A[n][i*2+1] = A[n][i*2+1].multiply(A[n][(i-1)*2]);
                        A[n][i*2] = A[n][i*2+1];
                    }
                }
            }
            for (int i = 0; i < MM; i++)
                A[n][i] = A[n][i].add(BigInteger.ONE);
        }
        int N = in.nextInt();
        for (int i = 0; i < N; i++)
            System.out.println(A[i].toString());
    }

    static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int p = 2; p*p <= U; p++) {
            if (isPrime[p]) {
                for (int i = p*p; i <= U; i += p)
                    isPrime[i] = false;
            }
        }
        for (int p = 2; p <= U; p++) {
            if (isPrime[p])
                primes.add(p);
        }
    }
}