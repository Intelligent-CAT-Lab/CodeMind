<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 2

Expected output:
9

```
MOD=1000000000+7
def run():
    H,W,K=map(int,input().split())
    K=K-1
    dp=[0]*1000 #dp[i]=iåç¸¦æ£ãããæãã®ä¸­ããä½éãé¸ã¶æ¹æ³ãããã
    dp[0]=1
    dp[1]=1
    dp[2]=2
    for i in range(3,1000):
        dp[i]=(dp[i-1]+dp[i-2])%MOD
    dp2=[[0 for j in range(W)] for i in range(H+1)]
    dp2[0][0]=1
    for i in range(H):
        for j in range(W):
            dp2[i+1][j]=(dp2[i+1][j]+dp2[i][j]*dp[j]%MOD*dp[W-j-1]%MOD)%MOD
            if(j-1>=0):
                dp2[i+1][j-1]=(dp2[i+1][j-1]+dp2[i][j]*dp[j-1]%MOD*dp[W-j-1]%MOD)%MOD
            if(j+1<W):
                dp2[i+1][j+1]=(dp2[i+1][j+1]+dp2[i][j]*dp[j]%MOD*dp[W-j-2]%MOD)%MOD
    print(dp2[H][K])
run()


```
[/INST]

Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000000 + 7;
        int[] dp = new int[1000];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < 1000; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        int[][] dp2 = new int[H + 1][W];
        dp2[0][0] = 1;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                dp2[i + 1][j] = (dp2[i + 1][j] + dp2[i][j] * dp[j] % MOD * dp[W - j - 1] % MOD) % MOD;
                if (j - 1 >= 0) {
                    dp2[i + 1][j - 1] = (dp2[i + 1][j - 1] + dp2[i][j] * dp[j - 1] % MOD * dp[W - j - 1] % MOD) % MOD;
                }
                if (j + 1 < W) {
                    dp2[i + 1][j + 1] = (dp2[i + 1][j + 1] + dp2[i][j] * dp[j] % MOD * dp[W - j - 2] % MOD) % MOD;
                }
            }
        }
        System.out.println(dp2[H][K]);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `MOD` variable is defined as a constant to avoid repetition. The `dp` and `dp2` arrays are initialized with the values from the Python code. The rest of the code is similar to the Python code, with the only difference being the use of the `Scanner` class to read input.</s>
