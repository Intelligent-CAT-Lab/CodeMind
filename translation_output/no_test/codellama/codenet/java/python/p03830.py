<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

MOD = 1000000007
N = int(sys.stdin.readline().strip())
cnt = [0] * (N + 1)

for i in range(2, N + 1):
    temp = i
    for j in range(2, int(temp ** 0.5) + 1):
        while temp % j == 0:
            cnt[j] += 1
            temp //= j
    if temp > 1:
        cnt[temp] += 1

ans = 1
for i in range(2, N + 1):
    ans = (ans * (cnt[i] + 1)) % MOD

print(ans)
```
This is the Python code equivalent to the given Java code. The main difference is that Python uses `//` for integer division instead of `/`, and it uses `range` instead of `for` loops with explicit indices. Additionally, Python uses `strip()` to remove trailing whitespace from the input string, and it uses `int(sys.stdin.readline())` to read a single integer from standard input.</s>
