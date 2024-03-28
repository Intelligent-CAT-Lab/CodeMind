import java.util.*;
import java.math.*;

public class p03270 {
    static final BigInteger MOD = BigInteger.valueOf(998244353);
    static final int U = 10000;
    static BigInteger[] fact = new BigInteger[U+1];
    static BigInteger[] fact_inv = new BigInteger[U+1];

    static void precompute() {
        fact[0] = BigInteger.ONE;
        fact_inv[0] = BigInteger.ONE;
        for (int n = 1; n <= U; ++n) {
            fact[n] = fact[n-1].multiply(BigInteger.valueOf(n));
            fact[n] = fact[n].mod(MOD);
            fact_inv[n] = fact[n].modInverse(MOD);
        }
        for (int n = U; n > 0; --n) {
            fact_inv[n-1] = fact_inv[n].multiply(BigInteger.valueOf(n));
            fact_inv[n-1] = fact_inv[n-1].mod(MOD);
        }
    }

    static BigInteger comb(int n, int k) {
        if (k < 0 || k > n) {
            return BigInteger.ZERO;
        }
        return fact[n].multiply(fact_inv[k]).multiply(fact_inv[n-k]).mod(MOD);
    }

    static BigInteger F(int x, int y, int N) {
        int n = Math.min(x, N);
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i <= n; ++i) {
            BigInteger temp = comb(x,i).multiply(BigInteger.valueOf(2).modPow(BigInteger.valueOf(i))).multiply(comb(N+y-1,i+y-1));
            sum = sum.add(temp.mod(MOD));
        }
        return sum.mod(MOD);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int N = in.nextInt();
        precompute();
        ArrayList<BigInteger> answer = new ArrayList<>();
        for (int S = 3; S <= K+2; S += 2) {
            BigInteger x = F((S-1)/2, K - S + 1, N);
            answer.add(x);
            answer.add(x);
        }
        if ((K & 1) == 1) {
            answer.remove(answer.size()-1);
        } else {
            int size = answer.size();
            for (int i = size-2; i >= 0; --i) {
                answer.add(answer.get(i));
            }
        }
        for (BigInteger num : answer) {
            System.out.println(num);
        }
    }
}