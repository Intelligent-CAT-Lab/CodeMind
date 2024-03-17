<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
aatt

Expected output:
5


```
import java.util.*;

public class p03618 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] A = sc.next().toCharArray();
		int N = A.length;
		int[] cnt = new int[26];
		for(int i=0; i<N; i++)
			cnt[A[i]-'a']++;
		
		long ans = (long)N*(N+1)/2+1;
		for(int i=0; i<26; i++)
			if(cnt[i]>0)
				ans -= (long)cnt[i]*(cnt[i]+1)/2;
		
		System.out.println(ans);
		
		sc.close();
	}
}

```
[/INST]
```python
import sys

N = int(input())
A = list(map(str, input().split()))

cnt = [0] * 26
for i in range(N):
    cnt[ord(A[i]) - ord('a')] += 1

ans = (N * (N + 1)) // 2 / 2
for i in range(26):
    if cnt[i] > 0:
        ans -= (cnt[i] * (cnt[i] + 1)) // 2 / 2

print(ans)
```</s>
