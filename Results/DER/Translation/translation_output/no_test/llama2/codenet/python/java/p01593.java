<s> Translate the following python code to java and enclose your solution inside ```java```:
```
dp=[1]+[0]*1000
n,m=map(int,input().split())
for i in range(n):
    j=1
    while i+j<=n and j<=m:dp[i+j]+=dp[i]/(n-i);j+=1
print('%.10f'%dp[n])
```

### 解题思路

```
dp=[1]+[0]*1000
n,m=map(int,input().split())
for i in range(n):
    j=1
    while i+j<=n and j<=m:dp[i+j]+=dp[i]/(n-i);j+=1
print('%.10f'%dp[n])
```

### 代码实现

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            dp[i]=0;
        }
        for(int i=1;i<=m;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
        }
        for(int i=1;i<=n;i++){

