Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from math import factorial
def comb (x,y):
	return factorial(x)//factorial(x-y)//factorial(y)

w,h,ax,ay,bx,by=map(int,input().split())
dx=min(w-abs(ax-bx),abs(ax-bx))
dy=min(h-abs(ay-by),abs(ay-by))
ans=1
if dx*2==w:ans*=2
if dy*2==h:ans*=2
ans*=comb(dx+dy,dx)
print(ans%100000007)
```

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int h=sc.nextInt();
        int ax=sc.nextInt();
        int ay=sc.nextInt();
        int bx=sc.nextInt();
        int by=sc.nextInt();
        int dx=Math.min(w-Math.abs(ax-bx),Math.abs(ax-bx));
        int dy=Math.min(h-Math.abs(ay-by),Math.abs(ay-by));
        int ans=1;
        if(dx*2==w) ans*=2;
        if(dy*2==h) ans*=2;
        int n=dx+dy;
        int r=dx;
        BigInteger fact=BigInteger.valueOf(1);
        BigInteger fact1=BigInteger.valueOf(1);
        BigInteger fact2=BigInteger.valueOf(1);
        for(int i=1;i<=n;i++){
            fact=fact.multiply(BigInteger.valueOf(i));
            if(i<=r) fact1=fact1.multiply(BigInteger.valueOf(i));
            if(i<=n-r) fact2=fact2.multiply(BigInteger.valueOf(i));
        }
        ans=ans*(fact.divide(fact1.multiply(fact2))).intValue();
        System.out.println(ans%100000007);
    }
}
```<|endoftext|>
