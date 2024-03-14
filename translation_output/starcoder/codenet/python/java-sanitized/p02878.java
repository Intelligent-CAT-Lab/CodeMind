import java.util.*;
public class p02878 {
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