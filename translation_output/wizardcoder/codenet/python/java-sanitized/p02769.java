import java.util.*;
import java.math.*;

public class p02769 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(n<=k){
            int x=1;
            for(int i=0;i<n-1;i++){
                x=(2*n-1-i)*x%mod;
            }
            int y=1;
            for(int i=0;i<n-1;i++){
                y=(i+1)*y%mod;
            }
            BigInteger b=new BigInteger("1000000005");
            System.out.println((x*bp(y,b))%mod);
        }
        else{
            int x=1;
            int y=1;
            int t=1;
            for(int i=0;i<k;i++){
                t=(i+1)*t%mod;
                y=(n-1-i)*(n-i)*y%mod;
                BigInteger b=new BigInteger("1000000005");
                x+=y*bp(t,b)*bp(t,b)%mod;
            }
            System.out.println(x);
        }
    }
    public static int mod=1000000007;
    public static int bp(int a,BigInteger n){
        int r=1;
        while(n.compareTo(BigInteger.ZERO)>0){
           if(n.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO)==1){
              r=r*a%mod;
           }
           a=a*a%mod;
           n=n.shiftRight(1);
        }
        return r;
    }
}