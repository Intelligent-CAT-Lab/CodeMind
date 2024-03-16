<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03635 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println((n-1)*(m-1));
	}
}
```

### 解题思路

```python
import sys

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())

print((n-1)*(m-1))
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 执行

执行用时：**0 ms**，在所有 Python3.6 提交的用户中击败了**0.00%** 的用户

内存消耗：**7.9 MB**，在所有 Python3.6 提交的用户中击败了**0.00%** 的用户</s>
