<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03636 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int leng = s.length();
		System.out.print(s.charAt(0));
		System.out.print(leng-2);
		System.out.println(s.charAt(leng-1));
	}

}
```

### 解题思路

```python
import java.util

class p03636:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        s = sc.next()
        leng = len(s)
        print(s[0], leng-2, s[leng-1])
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p03635](https://leetcode-cn.com/problems/java-to-python-string-conversion/)
</s>
