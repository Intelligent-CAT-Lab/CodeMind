<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();

		for (int i = X - K + 1; i <= X + K - 1; i++) {
			if (i != X + K - 1) {
				System.out.print(i + " ");
			} else {
				System.out.println(i);
			}
		}
	}
}

```

### 解题思路

```python
import sys

K = int(sys.stdin.readline())
X = int(sys.stdin.readline())

for i in range(X - K + 1, X + K - 1):
    if i != X + K - 1:
        print(i, end=' ')
    else:
        print(i)
```

### 复杂度分析

- 时间复杂度：O(K)。
- 空间复杂度：O(1)。

### 相关题目

- [p02945](https://leetcode-cn.com/problems/p02945/)
</s>
