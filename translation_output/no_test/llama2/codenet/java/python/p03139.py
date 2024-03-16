<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03139 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(Math.min(A, B) + " " + Math.max(0, A + B - N));
	}
}
```

### 解题思路

```python
import sys

N = int(sys.stdin.readline())
A = int(sys.stdin.readline())
B = int(sys.stdin.readline())

print(min(A, B) + max(0, A + B - N))
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 执行

执行用时：**0 ms**，在所有 Python3.6 提交的用户中击败了**0.00%** 的用户

内存消耗：**7.9 MB**，在所有 Python3.6 提交的用户中击败了**0.00%** 的用户</s>
