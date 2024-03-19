<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 2

Expected output:
-12

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
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        int ans = 0;
        int INF = 1000000007;
        if (n <= m) {
            int M = -((m - 1) * m * (2 * m - 1)) / 3 + m * m * (m - 1);
            int Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n + 1; i++) {
                for (int j = i; j <= n + 1; j++) {
                    if (i == j) {
                        ans = ans + Ms;
                    } else {
                        int d = j - i;
                        ans = ans + d * m * m + M;
                    }
                    ans = ans % INF;
                }
            }
        } else {
            (n, m) = (m, n);
            int M = -((m - 1) * m * (2 * m - 1)) / 3 + m * m * (m - 1);
            int Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n + 1; i++) {
                for (int j = i; j <= n + 1; j++) {
                    if (i == j) {
                        ans = ans + Ms;
                    } else {
                        int d = j - i;
                        ans = ans + d * m * m + M;
                    }
                    ans = ans % INF;
                }
            }
        }

        int factorial = 1;
        for (int i = 1; i <= n * m - 2; i++) {
            factorial = (factorial * i) % INF;
        }
        for (int i = 1; i <= n * m - k; i++) {
            factorial = (factorial * i) % INF;
        }
        for (int i = 1; i <= k - 2; i++) {
            factorial = (factorial * i) % INF;
        }
        ans = (factorial * ans) % INF;

        System.out.println(ans);
    }
}
```
This is the Java code for the given Python code. It uses the `Scanner` class to read the input from the user, and then it calculates the answer using the same logic as the Python code. The `INF` variable is used to represent the modulo value, and the `factorial` function is used to calculate the factorial of the input values. The final answer is printed to the console.</s>
