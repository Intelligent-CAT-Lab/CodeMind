<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 1 3

Expected output:
7


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
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MOD = 1000000007;
        long X = (long)Math.pow(2,n)%MOD;
        long A = 1;
        long B = 1;
        for(int i=0;i<a;i++) A = (A*(n-i))%MOD;
        for(int i=0;i<b;i++) B = (B*(n-i))%MOD;
        System.out.println((X-A-B+MOD)%MOD);
    }
}
```
<|endoftext|>
