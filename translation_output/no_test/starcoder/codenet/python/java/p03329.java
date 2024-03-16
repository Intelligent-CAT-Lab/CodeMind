<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] six = new int[7];
		int[] nine = new int[7];
		six[0] = 6;
		nine[0] = 9;
		for(int i = 1;i<7;i++){
			six[i] = six[i-1]*6;
			nine[i] = nine[i-1]*9;
		}
		int[] dp = new int[N+1];
		for(int i = 1;i<=N;i++){
			dp[i] = i;
			for(int j = 0;j<7;j++){
				if(six[j]<=i){
					dp[i] = Math.min(dp[i],dp[i-six[j]]+1);
				}
				if(nine[j]<=i){
					dp[i] = Math.min(dp[i],dp[i-nine[j]]+1);
				}
			}
		}
		System.out.println(dp[N]);
	}
}
```
<|endoftext|>
