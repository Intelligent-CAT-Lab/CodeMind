<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
dp=[1]+[0]*1000
n,m=map(int,input().split())
for i in range(n):
    j=1
    while i+j<=n and j<=m:dp[i+j]+=dp[i]/(n-i);j+=1
print('%.10f'%dp[n])
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        double[] dp=new double[1001];
        dp[0]=1;
        for(int i=0;i<n;i++){
            for(int j=1;j<=m;j++){
                if(i+j<=n)dp[i+j]+=dp[i]/(n-i);
            }
        }
        System.out.printf("%.10f",dp[n]);
    }
}
```
<|endoftext|>
