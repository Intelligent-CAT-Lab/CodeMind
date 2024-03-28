import java.util.*;
import java.math.*;

public class p02782 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int mod = 1000000007;
        int rng = 2000100;
        int[] fctr = new int[rng];
        fctr[0] = 1;
        for(int i=1;i<rng;i++)
            fctr[i] = fctr[i-1]*i%mod;
        long ans = 0;
        for(int i=0;i<=x2;i++)
            for(int j=0;j<=y2;j++)
                ans = (ans + fctr[i+j+2]*fctr[i+j+1]*fctr[i+j+1]*fctr[i+j])%mod;
        for(int i=0;i<=x1;i++)
            for(int j=0;j<=y1;j++)
                ans = (ans - fctr[i+j+1]*fctr[i+j]*fctr[x2+y2+2-i-j-2]*fctr[x2+y2+1-i-j-1])%mod;
        System.out.println(ans);
    }
}