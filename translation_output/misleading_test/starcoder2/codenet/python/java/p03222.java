
```java

```


```

java code:
```java

```
/2019/01/01/01.md
# 01

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
/2019/01/02/02.md
# 02

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

java code:
```java

```
/2019/01/03/03.md
# 03

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
                dp2[i+1][j+1]=(dp
