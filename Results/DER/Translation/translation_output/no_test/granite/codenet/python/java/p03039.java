System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n,m,k=map(int,input().split())
ans=0
INF=10**9+7
if n<=m:
    M=-(m-1)*m*(2*m-1)//3+m*m*(m-1)
    Ms=m*m*(m-1)//2-(m-1)*m*(2*m-1)//6
    M=M%INF
    Ms=Ms%INF
    for i in range(1,n+1):
        for j in range(i,n+1):
            if i==j:
                ans=ans+Ms
            else:
                d=j-i
                ans=ans+d*m**2+M
            ans=ans%INF
else:
    (n,m)=(m,n)
    M=-(m-1)*m*(2*m-1)//3+m*m*(m-1)
    Ms=m*m*(m-1)//2-(m-1)*m*(2*m-1)//6
    M=M%INF
    Ms=Ms%INF
    for i in range(1,n+1):
        for j in range(i,n+1):
            if i==j:
                ans=ans+Ms
            else:
                d=j-i
                ans=ans+d*m**2+M
            ans=ans%INF
import math
ans=(math.factorial(n*m-2)//(math.factorial(n*m-k)*math.factorial(k-2)))*ans
ans=ans%INF
print(ans)

```


Answer:
```java
import java.util.*;
import java.io.*;

public class Main {
    static long mod = 100000007;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int k = Integer.parseInt(split[2]);
        long ans = 0;
        if (n <= m) {
            long M = (-(m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1)) % mod;
            long Ms = (m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6) % mod;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans = (ans + Ms) % mod;
                    } else {
                        long d = j - i;
                        ans = (ans + d * m * m + M) % mod;
                    }
                }
            }
        } else {
            int temp = n;
            n = m;
            m = temp;
            long M = (-(m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1)) % mod;
            long Ms = (m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6) % mod;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans = (ans + Ms) % mod;
                    } else {
                        long d = j - i;
                        ans = (ans + d * m * m + M) % mod;
                    }
                }
            }
        }
        ans = (factorial(n * m - 2) / (factorial(n * m - k) * factorial(k - 2))) % mod * ans % mod;
        System.out.println(ans);
    }

    static long factorial(int n) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i % mod;
        }
        return ans;
    }
}
```<|endoftext|>
