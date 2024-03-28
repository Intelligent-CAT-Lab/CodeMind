import java.util.*;
import java.lang.*;
import java.io.*;

public class p01489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = 0,r = k;
        while(r-l>1){
            int m = (l+r)/2;
            if(m*(m+1)<k)
                l = m;
            else
                r = m;
        }
        int b = l;
        int ad = k - (b*(b+1));
        int d = ((ad-1)%(b+1))+1;
        int x = 2*b+1;
        int y = 1;
        if(ad-d>0)
            x+=1;
        if(d<=((b+1+1)/2))
            dd = d*2-1;
        else
            dz = (b+1-d);
            dd = dz*2+2;
        x -= (dd-1);
        y += (dd-1);
        int mod = 1000000007;
        long ans = 1;
        for(int i=x-1;i>0;i--)
            ans = (ans*i)%mod;
        for(int i=y-1;i>0;i--)
            ans = (ans*i)%mod;
        System.out.println(ans);
    }
}