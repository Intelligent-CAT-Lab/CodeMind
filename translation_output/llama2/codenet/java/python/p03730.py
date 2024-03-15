<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03730 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		for (int i = 0; i < 5000; i++) {
			if (a * i % b == c) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}

```

### 解题思路

1. 使用 ```for``` 循环，循环 5000 次，每次都将 ```a * i % b``` 与 ```c``` 进行比较，如果相等，则输出 ```YES```，并退出循环。

2. 如果 ```a * i % b``` 与 ```c``` 不相等，则输出 ```NO```，并退出循环。

### 代码实现

```python
import sys

a, b, c = map(int, sys.stdin.readline().split())

for i in range(5000):
    if a * i % b == c:
        print("YES")
        break
else:
    print("NO")
```

### 复杂度分析

- 时间复杂度：$$O(5000)$$。
- 空间复杂度：$$O(1)$$。

### 相关题目

1. [简单](../03729.md)
2. [中等](../03731.md)
3. [困难](../03732.md)
</s>
