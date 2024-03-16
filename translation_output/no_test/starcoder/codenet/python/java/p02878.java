<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
N,A,B=map(int,input().split());M=998244353;P=N+1;f=1;F=[1]*P;I=[1]*P;z=0;R=range
for n in R(1,P):F[n]=f=f*n%M
I[N]=i=pow(f,M-2,M)
for n in R(N,1,-1):I[n-1]=i=i*n%M
for k in R(min(A+1,N-B)if N-B-A else A+1):Q=N-B-k-1;z+=(B-k)*F[B+k-1]*I[B]*I[k]*F[Q+A-k]*I[Q]*I[A-k]
print(z%M if B else 1)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
        int m=998244353,p=n+1,f=1,F[]=new int[p],I[]=new int[p],z=0;
        for(int i=1;i<p;i++)f=f*i%m;
        F[0]=1;
        for(int i=1;i<p;i++)F[i]=f;
        I[n]=1;
        for(int i=n;i>=1;i--)I[i-1]=I[i]*i%m;
        for(int k=Math.min(a+1,n-b)if(n-b-a)>=0 else a+1;k>=1;k--){
            int q=n-b-k-1;
            z+=((b-k)*F[b+k-1]*I[b]*I[k]*F[q+a-k]*I[q]*I[a-k])%m;
        }
        System.out.println(z%m if b==0 else 1);
    }
}
```
<|endoftext|>
