import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int ans=0;
        int INF=1000000007;
        if(n<=m)
        {
            int M=-(m-1)*(m*(2*m-1))/6+m*(m-1)*(m-1);
            int Ms=m*(m-1)*(m-1)/2-(m-1)*(m*(2*m-1))/6;
            M=M%INF;
            Ms=Ms%INF;
            for(int i=1;i<=n;i++)
            {
                for(int j=i;j<=n;j++)
                {
                    if(i==j)
                        ans=ans+Ms;
                    else
                    {
                        int d=j-i;
                        ans=ans+d*m*m+M;
                    }
                    ans=ans%INF;
                }
            }
        }
        else
        {
            int M=-(m-1)*(m*(2*m-1))/6+m*(m-1)*(m-1);
            int Ms=m*(m-1)*(m-1)/2-(m-1)*(m*(2*m-1))/6;
            M=M%INF;
            Ms=Ms%INF;
            for(int i=1;i<=n;i++)
            {
                for(int j=i;j<=n;j++)
                {
                    if(i==j)
                        ans=ans+Ms;
                    else
                    {
                        int d=j-i;
                        ans=ans+d*m*m+M;
                    }
                    ans=ans%INF;
                }
            }
        }
        ans=(fact(n*m-2)/(fact(n*m-k)*fact(k-2)))*ans;
        ans=ans%INF;
        System.out.println(ans);
    }
    public static int fact(int n)
    {
        int ans=1;
        for(int i=2;i<=n;i++)
            ans=ans*i;
        return ans;
    }
}