import java.util.*;
public class p03622 {
    public static void main(String[] args){
        int M=8**7;
        int m=M*476+1;
        int[] f=new int[M];
        int[] g=new int[M];
        int i=1;
        f[0]=1;
        while(i<M){
            f[i]=f[i-1]*i%m;
            i++;
        }
        g[0]=1;
        g[1]=1;
        i=2;
        while(i<M){
            g[i]=g[i-1]*i%m;
            i++;
        }
        g[M-1]=pow(M*f[M-1],m-2,m);
        i=M-2;
        while(i>=0){
            g[i]=g[i]*i%m;
            i--;
        }
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        if(A<B){
            int temp=A;
            A=B;
            B=temp;
        }
        int i1=0;
        int j=1;
        int k=1;
        while(j<=B){
            i1+=k*f[A+B-j]*g[B-j];
            k=k*2%m;
            j++;
        }
        System.out.println((i1*f[B]*g[A+B]+A)%m);
    }
}