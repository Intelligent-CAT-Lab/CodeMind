Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
def i1():
 return int(input())
def i2():
 return [int(i) for i in input().split()]
mod=10**9+7
def bp(a,n):
        r=1
        while(n):
           if n%2:
              r=r*a%mod
           a=a*a%mod
           n>>=1
        return r
[n,k]=i2()
if n<=k:
   x=1
   for i in range(n-1):
      x*=2*n-1-i
      x%=mod
   y=1
   for i in range(n-1):
      y*=i+1
      y%=mod
   print((x*bp(y,10**9+5))%mod)   
   
else:
   x=1
   y=1
   t=1
   for i in range(k):
      t*=i+1
      t%=mod
      y*=n-1-i
      y%=mod
      y*=n-i
      y%=mod
      c=bp(t,10**9+5)
      x+=y*c*c
      x%=mod
   print(x)   
```

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
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
```<|endoftext|>
