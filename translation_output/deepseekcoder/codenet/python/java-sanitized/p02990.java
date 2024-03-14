import java.util.*;
import java.math.*;

public class p02990 {
    private static final BigInteger MOD = BigInteger.valueOf((long)Math.pow(10,9)+7);
    private static BigInteger[][] comb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        comb = new BigInteger[N+1][K+1];
        for(int i=0; i<=N; i++) {
            for(int j=0; j<=Math.min(i,K); j++) {
                if(j==0 || j==i) comb[i][j] = BigInteger.ONE;
                else comb[i][j] = comb[i-1][j-1].add(comb[i-1][j]);
                comb[i][j] = comb[i][j].mod(MOD);
            }
        }

        for(int i=1; i<=K; i++) {
            if(i > K || i > N-K+1) {
                System.out.println(0);
            } else {
                BigInteger ans = comb[N-K+1][i].multiply(between(N,K,i));
                ans = ans.mod(MOD);
                System.out.println(ans);
            }
        }
    }

    private static BigInteger between(int n, int k, int i) {
        if(i==1) return BigInteger.ONE;
        return comb[k-1][i-1];
    }
}