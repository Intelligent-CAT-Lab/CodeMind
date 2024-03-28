import java.util.*;
public class p03622 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=8**7;
        int m,f,g,i=M*476+1,j=1,k=1;
        f=1;
        while(i<M){
            f=(f+f%m*i)%m;
            i++;
        }
        g=1;
        g=(g+pow(M*f%m,m-2,m))%m;
        while(i>0){
            g=(g*i%m+g%m)%m;
            i--;
        }
        int A=sc.nextInt();
        int B=sc.nextInt();
        if(A<B){
            int temp=A;
            A=B;
            B=temp;
        }
        int i1=0,j1=A+B-1,k1=1;
        while(j1>=A){
            i1=(i1+k1*f%m*g%m)%m;
            k1=(k1*2%m+k1%m)%m;
            j1--;
        }
        System.out.println((i1+A)%m);
    }
}