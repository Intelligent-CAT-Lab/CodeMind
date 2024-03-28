<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03889 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'b') {
				arr[i] = 'd';
			} else if (arr[i] == 'd') {
				arr[i] = 'b';
			} else if (arr[i] == 'p') {
				arr[i] = 'q';
			} else if (arr[i] == 'q') {
				arr[i] = 'p';
			}
		}
		StringBuilder sb = new StringBuilder(new String(arr));
		sb.reverse();
		if (s.equals(sb.toString())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

```

### 解题思路

```python
import java.util

class p03889:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        s = sc.next()
        arr = s.toCharArray()
        for i in range(len(arr)):
            if arr[i] == 'b':
                arr[i] = 'd'
            elif arr[i] == 'd':
                arr[i] = 'b'
            elif arr[i] == 'p':
                arr[i] = 'q'
            elif arr[i] == 'q':
                arr[i] = 'p'
        sb = java.lang.StringBuilder(new java.lang.String(arr))
        sb.reverse()
        if s == sb.toString():
            print("Yes")
        else:
            print("No")
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [p03888](./p03888.md)
</s>
