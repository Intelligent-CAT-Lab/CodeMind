<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int list[] = new int[S + 1];
		long ans = 0;
		for (int i = 1; i < S + 1; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
			} else {
				ans = ans + i;
			}
		}
		System.out.println(ans);
	}
}

```

### 解题思路

```python
import sys

S = int(sys.stdin.readline())
list = [0] * (S + 1)
ans = 0
for i in range(2, S + 1):
    if i % 3 == 0 or i % 5 == 0:
        continue
    ans += i
list[S] = ans
for i in range(S, 0, -1):
    if list[i] == 0:
        continue
    ans += list[i]
    list[i] = 0
print(ans)
```

### 复杂度分析

- 时间复杂度：O(S)。
- 空间复杂度：O(S)。

### 相关题目

- [p02711](../p02711)
</s>
