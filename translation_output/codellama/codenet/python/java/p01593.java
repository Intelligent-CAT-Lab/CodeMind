<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

dp=[1]+[0]*1000
n,m=map(int,input().split())
for i in range(n):
    j=1
    while i+j<=n and j<=m:dp[i+j]+=dp[i]/(n-i);j+=1
print('%.10f'%dp[n])

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double[] dp = new double[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            int j = 1;
            while (i + j <= n && j <= m) {
                dp[i + j] += dp[i] / (n - i);
                j++;
            }
        }
        System.out.println(String.format("%.10f", dp[n]));
    }
}
```
This is the Java code equivalent to the Python code you provided. It uses the `Scanner` class to read input from the user, and the `String.format()` method to format the output to 10 decimal places. The rest of the code is similar to the Python code, with the exception of the `import` statement at the beginning.</s>
