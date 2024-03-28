Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s=int(input())
if  s<3:print(0);exit()
n=s//3
mod=10**9+7
fact=[1]*(2*s+1)
inv=[1]*(2*s+1)
for i in range(2,2*s+1):
    fact[i]=i*fact[i-1]%mod
inv[-1]=pow(fact[-1],-1,mod)
for i in range(2*s,1,-1):
    inv[i-1]=inv[i]*i%mod
def comb(x,y):return fact[x]*inv[y]%mod*inv[x-y]%mod if x>=y>=0 else 0
ans=0
for i in range(1,s+1):
    ans=(ans+comb(s-3*i+i-1,i-1))%mod
print(ans)
```

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        if(s<3){
            System.out.println(0);
            return;
        }
        int n=s/3;
        int mod=1000000007;
        int[] fact=new int[2*s+1];
        int[] inv=new int[2*s+1];
        fact[0]=1;
        for(int i=1;i<=2*s;i++){
            fact[i]=(i*fact[i-1])%mod;
        }
        inv[2*s]=pow(fact[2*s],mod-2,mod);
        for(int i=2*s-1;i>=0;i--){
            inv[i]=(inv[i+1]*(i+1))%mod;
        }
        long ans=0;
        for(int i=1;i<=s;i++){
            ans=(ans+comb(s-3*i+i-1,i-1))%mod;
        }
        System.out.println(ans);
    }
    public static int pow(int a,int b,int mod){
        int res=1;
        while(b>0){
            if(b%2==1)res=(res*a)%mod;
            a=(a*a)%mod;
            b/=2;
        }
        return res;
    }
    public static int comb(int n,int k){
        if(k>n)return 0;
        return fact[n]*inv[k]%mod*inv[n-k]%mod;
    }
}
```<|endoftext|>
