<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
-78

```
import java.util.*;

public class p03830 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final long MOD = 1000000007;
		int N = sc.nextInt();
		int[] cnt = new int[N+1];
		for(int i=2; i<=N; i++) {
			int temp = i;
			for(int j=2; j*j<=temp; j++) {
				while(temp%j==0) {
					cnt[j]++;
					temp/=j;
				}
			}
			if(temp>1)
				cnt[temp]++;
		}
		
		long ans = 1;
		for(int i=2; i<=N; i++)
			ans = (ans * (cnt[i]+1))%MOD;
		
		System.out.println(ans);
		sc.close();
	}
}

```
[/INST]
```python
import sys

N = int(input())
MOD = 1000000007

cnt = [0] * (N+1)

for i in range(2, N+1):
    temp = i
    for j in range(2, int(temp**0.5)+1):
        while temp % j == 0:
            cnt[j] += 1
            temp //= j
    if temp > 1:
        cnt[temp] += 1

ans = 1
for i in range(2, N+1):
    ans = (ans * (cnt[i]+1)) % MOD

print(ans)
```</s>
