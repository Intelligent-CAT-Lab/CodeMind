Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
76.94891250961925

```
dp=[1]+[0]*1000
n,m=map(int,input().split())
for i in range(n):
    j=1
    while i+j<=n and j<=m:dp[i+j]+=dp[i]/(n-i);j+=1
print('%.10f'%dp[n])
```

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        double[] dp=new double[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m && i+j<=n;j++){
                dp[i+j]+=dp[i]/(n-i);
            }
        }
        System.out.printf("%.10f",dp[n]);
    }
}
```<|endoftext|>
