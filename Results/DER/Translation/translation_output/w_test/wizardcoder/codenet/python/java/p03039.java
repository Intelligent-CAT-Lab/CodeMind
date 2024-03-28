Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 2

Expected output:
8


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

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int ans=0;
        int INF=1000000007;
        if(n<=m){
            int M=-(m-1)*m*(2*m-1)//3+m*m*(m-1);
            int Ms=m*m*(m-1)//2-(m-1)*m*(2*m-1)//6;
            M=M%INF;
            Ms=Ms%INF;
            for(int i=1;i<=n;i++){
                for(int j=i;j<=n;j++){
                    if(i==j){
                        ans=ans+Ms;
                    }
                    else{
                        int d=j-i;
                        ans=ans+d*m*m+M;
                    }
                    ans=ans%INF;
                }
            }
        }
        else{
            int temp=n;
            n=m;
            m=temp;
            int M=-(m-1)*m*(2*m-1)//3+m*m*(m-1);
            int Ms=m*m*(m-1)//2-(m-1)*m*(2*m-1)//6;
            M=M%INF;
            Ms=Ms%INF;
            for(int i=1;i<=n;i++){
                for(int j=i;j<=n;j++){
                    if(i==j){
                        ans=ans+Ms;
                    }
                    else{
                        int d=j-i;
                        ans=ans+d*m*m+M;
                    }
                    ans=ans%INF;
                }
            }
        }
        int num=1;
        for(int i=1;i<=n*m;i++){
            num=num*(i%INF);
            num=num%INF;
        }
        int den=1;
        for(int i=1;i<=k;i++){
            den=den*(i%INF);
            den=den%INF;
        }
        for(int i=1;i<=n*m-k;i++){
            den=den*(i%INF);
            den=den%INF;
        }
        ans=(num//den)*ans;
        ans=ans%INF;
        System.out.println(ans);
    }
}
```<|endoftext|>
