<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1

Expected output:
499122178


```
M=8**7
m,f,g,i=M*476+1,[j:=1],[k:=1]*M,1
while i<M:f+=f[-1]*i%m,;i+=1
g+=pow(M*f[-1],m-2,m),
while i:g[i-1]=g[i]*i%m;i-=1
A,B=map(int,input().split())
if A<B:A,B=B,A
while j<=B:i+=k*f[A+B-j]*g[B-j];k=k*2%m;j+=1
print((i*f[B]*g[A+B]+A)%m)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
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
```
<|endoftext|>
