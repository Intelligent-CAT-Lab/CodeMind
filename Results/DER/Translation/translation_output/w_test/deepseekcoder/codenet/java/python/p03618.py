<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
import sys

def p03618():
    A = list(sys.stdin.readline().strip())
    N = len(A)
    cnt = [0]*26
    for i in range(N):
        cnt[ord(A[i])-ord('a')] += 1

    ans = (N*(N+1))//2+1
    for i in range(26):
        if cnt[i] > 0:
            ans -= (cnt[i]*(cnt[i]+1))//2

    print(ans)

p03618()
```

In this Python code, we use the `sys.stdin.readline().strip()` function to read the input string. The `ord()` function is used to get the ASCII value of a character. The rest of the code is translated directly from the Java code.
<|EOT|>
