<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 2 2

Expected output:
14


```
mod = 10**9+7
rng = 2000100
fctr = [1]+[0]*(rng-1)
for i in range(1,rng):
  fctr[i] = fctr[i-1]*i%mod
def finv(x):
  return pow(fctr[x],mod-2,mod)
def cmb(n,k):
  if n<0 or k<0:
    return 0
  else:
    return fctr[n]*finv(n-k)*finv(k)%mod

x1,y1,x2,y2 = map(int,input().split())
print((cmb(x2+y2+2,x2+1)-cmb(x2+y1+1,y1)-cmb(x1+y2+1,x1)+cmb(x1+y1,x1))%mod)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int mod = 1000000007;
        int rng = 2000100;
        int[] fctr = new int[rng];
        fctr[0] = 1;
        for(int i=1;i<rng;i++)
            fctr[i] = fctr[i-1]*i%mod;
        long ans = 0;
        for(int i=0;i<=x2;i++)
            for(int j=0;j<=y2;j++)
                ans = (ans + fctr[i+j+2]*fctr[i+j+1]*fctr[i+j+1]*fctr[i+j])%mod;
        for(int i=0;i<=x1;i++)
            for(int j=0;j<=y1;j++)
                ans = (ans - fctr[i+j+1]*fctr[i+j]*fctr[x2+y2+2-i-j-2]*fctr[x2+y2+1-i-j-1])%mod;
        System.out.println(ans);
    }
}
```
'''
<|endoftext|>
