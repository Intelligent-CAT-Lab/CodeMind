<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 解题思路

```python
import sys

def main():
    N = int(sys.stdin.readline())
    A = sys.stdin.readline().strip()
    cnt = [0]*26
    for i in A:
        cnt[ord(i)-ord('a')] += 1
    ans = N*(N+1)/2 + 1
    for i in range(26):
        ans -= (cnt[i]*(cnt[i]+1))/2
    print(ans)

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：$O(N)$。
- 空间复杂度：$O(1)$。

### 相关题目

- [p03617](https://leetcode-cn.com/problems/p03617/)
</s>
