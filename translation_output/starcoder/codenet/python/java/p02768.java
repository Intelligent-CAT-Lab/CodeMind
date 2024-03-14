<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n,a,b = map(int, input().split())
MOD = 10**9 + 7

def modcomb(n,a,mod):
    cnt = 1
    for i in range(a):
        cnt *= (n-i)
        cnt *= pow(i+1,mod-2,mod)
        cnt %= mod
    # print(cnt)
    return cnt
    


X = pow(2,n,MOD)-1
A = modcomb(n,a,MOD)
B = modcomb(n,b,MOD)
ans = (X-A-B)%MOD
print(ans)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MOD = 1000000007;
        long X = (long)Math.pow(2,n)%MOD;
        long A = 1;
        for(int i=0;i<a;i++) A = (A*n-i)%MOD;
        A = (A*pow(n-a,MOD-2,MOD))%MOD;
        long B = 1;
        for(int i=0;i<b;i++) B = (B*n-i)%MOD;
        B = (B*pow(n-b,MOD-2,MOD))%MOD;
        System.out.println((X-A-B+MOD)%MOD);
    }
}
```
<|endoftext|>
