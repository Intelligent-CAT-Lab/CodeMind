<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * A : ???????????Â°?????? / Finger Counting
 */
public class p01852 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;

		long n = sc.nextLong();
		int count = 0;

		if (n > 0) {
			while (n >= 2) {
				n /= 2;
				count++;
			}
			count++;
		}
		System.out.println(count);
	}
}
```

### 解答

```python
import sys

n = int(sys.stdin.readline())

if n > 0:
    count = 0
    while n >= 2:
        n //= 2
        count += 1
    count += 1
    print(count)
```

### 解析

1. 读取输入
2. 判断输入是否大于0
3. 如果大于0，则开始计数
4. 每次减去一半，然后加1
5. 最后输出结果

### 复杂度分析

- 时间复杂度：O(logn)
- 空间复杂度：O(1)
</s>
