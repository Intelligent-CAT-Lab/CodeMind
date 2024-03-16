import java.io.*;
import java.util.*;

public class p02965 {
    public static final int MOD = 998244353;
    
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("_in.txt")); // Only if local environment is set
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        
        int[] factorials = getFactorials(M * 3 / 2 + N, MOD);
        int[] finvs = getInverses(factorials, MOD);
        
        long[] odds = Arrays.stream(IntStream.rangeClosed(0, M).filter(x -> x % 2 == M % 2).toArray()).mapToLong(x -> x).toArray();
        long[] halves = Arrays.stream(odds).map(x -> (M * 3 - x) / 2).toArray();
        
        long oc1 = 0;
        long oc2 = 0;
        for (int odd : IntStream.range(0, odds.length).toArray()) {
            oc1 += ncr(N, (int)odds[odd], factorials, finvs, MOD);
            oc2 += ncr(N - 1, (int)odds[odd], factorials, finvs, MOD);
        }
        
        long c1 = 0;
        for (int half : IntStream.range(0, halves.length).toArray()) {
            c1 += ncr((int)halves[half] + N - 1, N - 1, factorials, finvs, MOD) * oc1 % MOD;
        }
        
        long c2a = 0;
        long c2b = 0;
        for (int odd : IntStream.range(0, odds.length).toArray()) {
            long newHalf = (M - odds[odd]) / 2;
            c2a += ncr((int)newHalf + N - 1, N - 1, factorials, finvs, MOD) * oc1 % MOD;
            c2b += ncr((int)newHalf + N - 2, N - 2, factorials, finvs, MOD) * oc2 % MOD;
        }
        
        long c2 = ((c2a - c2b + MOD) % MOD) * N % MOD;
        System.out.println((c1 - c2 + MOD) % MOD);
    }
    
    public static int[] getFactorials(int max, int mod) {
        int[] ret = new int[max + 1];
        ret[0] = 1;
        for (int i = 1; i <= max; i++) {
            ret[i] = (int)((long)ret[i - 1] * i % mod);
        }
        return ret;
    }
    
    public static int[] getInverses(int[] factorials, int mod) {
        int[] invs = new int[factorials.length];
        invs[1] = 1;
        for (int i = 2; i < invs.length; i++) {
            invs[i] = mod - (int)((long)(mod / i) * invs[mod % i] % mod);
        }
        invs[0] = 1;
        for (int i = 1; i < invs.length; i++) {
            invs[i] = (int)((long)invs[i - 1] * invs[i] % mod);
        }
        return invs;
    }
    
    public static long ncr(int n, int r, int[] factorials, int[] invs, int mod) {
        if (n < r) return 0;
        return ((long)factorials[n] * invs[r] % mod * invs[n - r] % mod);
    }
}