import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class p01452 {
    final static int MOD = 1000000007;
    final static int CMS = 1000000;
    static BigInteger[] cm = new BigInteger[CMS];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        
        ArrayList<Integer> rr = new ArrayList<>(); 
        
        combInit();
        
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            
            if (n == 0) {
                break;
            }
            
            rr.add(f(n, m, k));
        }
        
        for (Integer result : rr) {
            out.println(result);
        }
        
        out.flush();
        sc.close();
    }

    static void combInit() {
        cm[0] = BigInteger.ONE;
        for (int i = 1; i < CMS; i++) {
            cm[i] = cm[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
        }
    }

    static BigInteger comb(int a, int b) {
        BigInteger inverseAminusB = cm[a - b].modInverse(BigInteger.valueOf(MOD));
        BigInteger inverseB = cm[b].modInverse(BigInteger.valueOf(MOD));
        return cm[a].multiply(inverseAminusB).mod(BigInteger.valueOf(MOD)).multiply(inverseB).mod(BigInteger.valueOf(MOD));
    }

    static int f(int n, int m, int k) {
        BigInteger r = BigInteger.ZERO;
        for (int i = 0; i <= k; i++) {
            int j = k - i;
            BigInteger mt = comb(n + m + k * 2, n + i * 2);
            BigInteger lk = BigInteger.ONE;
            BigInteger rk = BigInteger.ONE;
            if (i > 0) {
                lk = comb(n + i * 2, i).subtract(comb(n + i * 2, i - 1)).mod(BigInteger.valueOf(MOD));
            }
            if (j > 0) {
                rk = comb(m + j * 2, j).subtract(comb(m + j * 2, j - 1)).mod(BigInteger.valueOf(MOD));
            }
            r = r.add(mt.multiply(lk).multiply(rk)).mod(BigInteger.valueOf(MOD));
        }

        return r.intValue();
    }
}