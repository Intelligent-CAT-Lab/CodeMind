import java.util.*;
import java.io.*;

public class p04040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mod = 1000000007;
        int ans = 0;
        for(int i=0;i<h-a;i++){
            ans = (ans + comb(b-1+i,i)*comb(h-1-i+w-1-b,h-1-i))%mod;
        }
        System.out.println(ans);
    }
    public static int comb(int n,int k){
        if(n<k) return 0;
        if(n<0 || k<0) return 0;
        long ans = 1;
        for(int i=n-k+1;i<=n;i++){
            ans = ans*i%1000000007;
        }
        for(int i=2;i<=k;i++){
            ans = ans*i%1000000007;
        }
        return (int)ans;
    }
}