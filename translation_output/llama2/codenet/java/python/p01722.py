<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p01722 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 0:
			System.out.println(1);
			break;
		case 1:
			System.out.println(2);
			break;
		case 2:
			System.out.println(1);
			break;
		default:
			System.out.println(0);
			break;
		}
		sc.close();
	}

}
```

### 解题思路

```python
import sys

n = int(sys.stdin.readline())

if n == 0:
    print(1)
elif n == 1:
    print(2)
elif n == 2:
    print(1)
else:
    print(0)
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p01721](./p01721.md)
</s>
