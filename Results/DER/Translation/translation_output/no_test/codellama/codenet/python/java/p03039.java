<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = 0;
        int INF = 1000000007;

        if (n <= m) {
            int M = -((m - 1) * m * (2 * m - 1)) / 3 + m * m * (m - 1) % INF;
            int Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6 % INF;

            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans += Ms;
                    } else {
                        int d = j - i;
                        ans += d * m * m + M;
                    }
                    ans %= INF;
                }
            }
        } else {
            int temp = n;
            n = m;
            m = temp;

            int M = -((m - 1) * m * (2 * m - 1)) / 3 + m * m * (m - 1) % INF;
            int Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6 % INF;

            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans += Ms;
                    } else {
                        int d = j - i;
                        ans += d * m * m + M;
                    }
                    ans %= INF;
                }
            }
        }

        ans = (int) (Math.factorial(n * m - 2) / (Math.factorial(n * m - k) * Math.factorial(k - 2))) * ans % INF;

        System.out.println(ans);
    }
}
```
This is the Java code for the given Python code. It uses the same logic and variables as the Python code, but it is written in Java. The code uses the `Scanner` class to read input from the user, and it uses the `Math` class to calculate the factorials. The code also uses the `%` operator to perform modular arithmetic, which is necessary to avoid overflow errors.</s>
