Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
127

Expected output:
4


```
import copy
N=int(input())
six = [6**i for i in range(1,8)][::-1]
nine = [9**i for i in range(1,8)] [::-1]
def DP(n):
	if n < 6:
		return n
	tmp = n
	count6 = 0
	count9 = 0
	for sixx in six:
		if sixx <= n:
			n -= sixx
			count6 = 1
			break
	count6 += DP(n)
	n = tmp
	if n < 9:
		return count6
	for ninee in nine:
		if ninee<= n:
			n -= ninee
			count9 = 1
			break
	count9 += DP(n)
	n = tmp
	return min(count6,count9)
print(DP(N))
```

### Response:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] six = {6, 36, 216, 1296, 7776, 46656, 279936};
        int[] nine = {9, 36, 216, 1296, 7776, 46656, 279936};
        int[][] dp = new int[N+1][2];
        dp[0][0] = 0;
        dp[0][1] = 0;
        for(int i=1;i<=N;i++){
            dp[i][0] = i;
            dp[i][1] = i;
            for(int j=0;j<7;j++){
                if(six[j]<=i){
                    dp[i][0] = Math.min(dp[i][0], dp[i-six[j]][0]+1);
                }
                if(nine[j]<=i){
                    dp[i][1] = Math.min(dp[i][1], dp[i-nine[j]][1]+1);
                }
            }
        }
        System.out.println(dp[N][0]);
    }
}
```<|endoftext|>
