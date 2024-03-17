<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
0.50000000


```
dp=[1]+[0]*1000
n,m=map(int,input().split())
for i in range(n):
    j=1
    while i+j<=n and j<=m:dp[i+j]+=dp[i]/(n-i);j+=1
print('%.10f'%dp[n])
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double[] dp = new double[1001];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
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
This code uses a dynamic programming approach to solve the problem. It first initializes an array `dp` of size 1001, where `dp[i]` represents the probability of reaching position `i` in the game. The initial value of `dp[1]` is set to 1, as the probability of reaching position 1 is 100%.

The code then iterates over the positions from 2 to `n`, and for each position `i`, it calculates the probability of reaching position `i + j` for `j` from 1 to `m`, and updates the value of `dp[i + j]` accordingly.

Finally, the code prints the value of `dp[n]` as the final answer.

Note that the code uses the `String.format()` method to format the output to 10 decimal places.</s>
