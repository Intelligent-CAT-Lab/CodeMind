<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import sys

def main():
    A = list(sys.stdin.readline().strip())
    N = len(A)
    cnt = [0]*26
    for i in range(N):
        cnt[ord(A[i])-ord('a')] += 1

    ans = N*(N+1)//2 + 1
    for i in range(26):
        if cnt[i] > 0:
            ans -= cnt[i]*(cnt[i]+1)//2

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, counts the occurrences of each character, and then calculates the answer. The `ord()` function is used to convert a character to its ASCII value. The `//` operator is used for integer division in Python.<｜end▁of▁sentence｜>
