import java.util.*;
public class p02769 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(n<=k)
        {
            long x=1;
            for(int i=0;i<n-1;i++)
            {
                x=x*(2*n-1-i);
                x%=1000000007;
            }
            long y=1;
            for(int i=0;i<n-1;i++)
            {
                y=y*(i+1);
                y%=1000000007;
            }
            long z=1;
            for(int i=0;i<1000000005;i++)
            {
                z=z*i;
                z%=1000000007;
            }
            System.out.println((x*power(y,z))%1000000007);
        }
        else
        {
            long x=1;
            long y=1;
            long t=1;
            for(int i=0;i<k;i++)
            {
                t=t*(i+1);
                t%=1000000007;
                y=y*(n-1-i);
                y%=1000000007;
                y=y*(n-i);
                y%=1000000007;
                long c=power(t,1000000005);
                x=x+(y*c*c);
                x%=1000000007;
            }
            System.out.println(x);
        }
    }
    public static long power(long a,long b)
    {
        long ans=1;
        while(b>0)
        {
            if((b&1)==1)
            {
                ans=ans*a;
                ans%=1000000007;
            }
            a=a*a;
            a%=1000000007;
            b>>=1;
        }
        return ans;
    }
}