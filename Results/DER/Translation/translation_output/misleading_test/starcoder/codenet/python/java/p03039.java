<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 2

Expected output:
-12

```
n,m,k=map(int,input().split())
ans=0
INF=10**9+7
if n<=m:
    M=-(m-1)*m*(2*m-1)//3+m*m*(m-1)
    Ms=m*m*(m-1)//2-(m-1)*m*(2*m-1)//6
    M=M%INF
    Ms=Ms%INF
    for i in range(1,n+1):
        for j in range(i,n+1):
            if i==j:
                ans=ans+Ms
            else:
                d=j-i
                ans=ans+d*m**2+M
            ans=ans%INF
else:
    (n,m)=(m,n)
    M=-(m-1)*m*(2*m-1)//3+m*m*(m-1)
    Ms=m*m*(m-1)//2-(m-1)*m*(2*m-1)//6
    M=M%INF
    Ms=Ms%INF
    for i in range(1,n+1):
        for j in range(i,n+1):
            if i==j:
                ans=ans+Ms
            else:
                d=j-i
                ans=ans+d*m**2+M
            ans=ans%INF
import math
ans=(math.factorial(n*m-2)//(math.factorial(n*m-k)*math.factorial(k-2)))*ans
ans=ans%INF
print(ans)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main (String[] args)
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
            int Ms=m*(m-1)*(m-1)/4-(m-1)*(m*(2*m-1))/12;
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
            int Ms=m*(m-1)*(m-1)/4-(m-1)*(m*(2*m-1))/12;
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
```
<|endoftext|>
