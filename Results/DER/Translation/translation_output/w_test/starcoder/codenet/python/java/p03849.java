<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
5


```
MOD = 10**9 + 7
n = int(input())
dp = [[0 for _ in range(3)] for _ in range(61)]
dp[60][0] = 1
for i in range(59, -1, -1):
	if (n>>i)&1 == 1:
		dp[i][0] += dp[i+1][0]
		dp[i][1] += dp[i+1][0] + dp[i+1][1]
		dp[i][2] += 2*dp[i+1][1] + 3*dp[i+1][2]
	else:
		dp[i][0] += dp[i+1][0] + dp[i+1][1]
		dp[i][1] += dp[i+1][1]
		dp[i][2] += dp[i+1][1] + 3*dp[i+1][2]
	for j in range(3):
		dp[i][j] %= MOD
print(sum(dp[0])%MOD)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int MOD = 1000000007;
		int[][] dp = new int[61][3];
		dp[60][0] = 1;
		for(int i = 59; i >= 0; i--){
			if((n>>i)&1 == 1){
				dp[i][0] += dp[i+1][0];
				dp[i][1] += dp[i+1][0] + dp[i+1][1];
				dp[i][2] += 2*dp[i+1][1] + 3*dp[i+1][2];
			}
			else{
				dp[i][0] += dp[i+1][0] + dp[i+1][1];
				dp[i][1] += dp[i+1][1];
				dp[i][2] += dp[i+1][1] + 3*dp[i+1][2];
			}
			for(int j = 0; j < 3; j++){
				dp[i][j] %= MOD;
			}
		}
		System.out.println(dp[0][0] + dp[0][1] + dp[0][2]);
	}
}
```
<|endoftext|>
