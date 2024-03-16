<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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



Translate the above python code to java.

java code:

[/INST]
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
This is the Java code for the given Python code. The code uses the same logic and data structures as the Python code, but it is written in Java. The `Scanner` class is used to read input from the user, and the `System.out.println()` method is used to print the result. The `MOD` variable is defined as `1000000000 + 7`, which is the same as the Python code. The `dp` and `dp2` arrays are defined as `int[]` and `int[][]` respectively, and they are used to store the values of the dynamic programming algorithm. The `for` loops are used to iterate over the arrays and perform the calculations. The `if` statements are used to check if the indices are within the bounds of the arrays. The `System.out.println()` method is used to print the result.</s>
