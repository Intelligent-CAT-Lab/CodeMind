import java.util.*;
import java.io.*;
public class p02169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(n<k) {
            System.out.println(0);
            return;
        }
        if(m<k) {
            System.out.println(0);
            return;
        }
        long ans = 1;
        for(int i=1;i<=k;i++) {
            ans = (ans*m)%1000000007;
        }
        long c = m;
        long[][] comb = new long[k+1][k+1];
        comb[0][0] = 1;
        for(int i=0;i<k;i++) {
            for(int j=0;j<=i;j++) {
                comb[i+1][j] += comb[i][j];
                comb[i+1][j+1] += comb[i][j];
            }
        }
        for(int i=1;i<k;i++) {
            long k1 = 0;
            for(int j=1;j<=i;j++) {
                if((i+j)&1) {
                    k1 -= comb[i][j]*pow(j,n,1000000007);
                } else {
                    k1 += comb[i][j]*pow(j,n,1000000007);
                }
            }
            k1 *= c;
            c *= (m-i);
            c *= pow(i+1,1000000007-2,1000000007);
            c %= 1000000007;
            ans -= k1;
            ans %= 1000000007;
        }
        System.out.println(ans);
    }
}