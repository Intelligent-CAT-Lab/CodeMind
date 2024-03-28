<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03893 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long next = 2;
		for (int i = 0; i < x; i++) {
			next = (next + 1) * 2;
		}
		System.out.println(next);
	}
}

```

### 解题思路

```python
import java.util

def main():
    x = int(input())
    next = 2
    for i in range(x):
        next = (next + 1) * 2
    print(next)

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(x)。
- 空间复杂度：O(1)。

### 相关题目

- [p03892](https://leetcode-cn.com/problems/p03892/)
</s>
