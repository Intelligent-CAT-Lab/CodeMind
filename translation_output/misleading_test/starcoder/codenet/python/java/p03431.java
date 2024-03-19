<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 4

Expected output:
99

```
n,k=map(int,input().split());p=998244353
r=range
f=[1]
for i in r(k):f+=[-~i*f[i]%p]
print(sum(f[-2]*pow(f[i]*f[-2-i],-1,p)for i in r(n-1,k))%p)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int p=998244353;
        int[] f=new int[k+1];
        f[0]=1;
        for(int i=1;i<=k;i++)f[i]=-~i*f[i-1]%p;
        long ans=0;
        for(int i=n-1;i>=k;i--)ans=(ans+f[i]*pow(f[i-k]*f[k],-1,p))%p;
        System.out.println(ans);
    }
}
```
'''
<|endoftext|>
