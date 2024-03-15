<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02831 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A, B;
		A = sc.nextLong();
		B = sc.nextLong();
		sc.close();

		long gcd = 0;
		for (int i = 1; i < Math.max(A, B); i++) {
			if (A % i == 0 && B % i == 0) {
				gcd = i;
			}
		}
		long lcm = A * B / gcd;
		System.out.println(lcm);
	}
}
```

### 解题思路

```python
import sys

A, B = map(int, sys.stdin.readline().split())

gcd = 0
for i in range(1, max(A, B)):
    if A % i == 0 and B % i == 0:
        gcd = i

lcm = A * B // gcd
print(lcm)
```

### 复杂度分析

- 时间复杂度：O(log(max(A, B)))
- 空间复杂度：O(1)

### 相关题目

- [p02830](https://leetcode-cn.com/problems/gcd-of-two-integers/)
</s>
