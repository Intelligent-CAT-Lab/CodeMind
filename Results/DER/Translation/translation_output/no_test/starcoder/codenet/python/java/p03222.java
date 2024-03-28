<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    static int MOD=1000000000+7;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        int K=sc.nextInt();
        K=K-1;
        int[] dp=new int[1000];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<1000;i++){
            dp[i]=(dp[i-1]+dp[i-2])%MOD;
        }
        int[][] dp2=new int[H+1][W];
        dp2[0][0]=1;
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                dp2[i+1][j]=(dp2[i+1][j]+dp2[i][j]*dp[j]*dp[W-j-1])%MOD;
                if(j-1>=0)
                    dp2[i+1][j-1]=(dp2[i+1][j-1]+dp2[i][j]*dp[j-1]*dp[W-j-1])%MOD;
                if(j+1<W)
                    dp2[i+1][j+1]=(dp2[i+1][j+1]+dp2[i][j]*dp[j]*dp[W-j-2])%MOD;
            }
        }
        System.out.println(dp2[H][K]);
    }
}
```
<|endoftext|>
