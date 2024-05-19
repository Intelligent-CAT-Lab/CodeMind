System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    static long mod = (long)Math.pow(10,9)+7;
    static long[] fctr = new long[200010];
    static long[] finv = new long[200010];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        fctr[0] = 1;
        finv[0] = 1;
        for(int i=1;i<200010;i++){
            fctr[i] = (fctr[i-1]*i)%mod;
            finv[i] = modinv(fctr[i]);
        }
        long ans = (comb(x2+y2+2,x2+1)-comb(x2+y1+1,y1)-comb(x1+y2+1,x1)+comb(x1+y1,x1))%mod;
        System.out.println(ans);
    }

    public static long comb(int n, int k){
        if(n<0 || k<0){
            return 0;
        }
        return (fctr[n]*((finv[k]*finv[n-k])%mod))%mod;
    }

    public static long modinv(long a){
        return modpow(a,mod-2);
    }

    public static long modpow(long a, long n){
        long res = 1;
        while(n>0){
            if(n%2==1){
                res = (res*a)%mod;
            }
            a = (a*a)%mod;
            n /= 2;
        }
        return res;
    }
}
```<|endoftext|>
