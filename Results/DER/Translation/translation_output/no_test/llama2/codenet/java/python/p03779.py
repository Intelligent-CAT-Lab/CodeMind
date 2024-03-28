<s> Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p03779{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int ans = 0;

		for (int i = 0; i < 100000; i++) {
			if (x <= i * (i + 1) / 2) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}

```

### 解题思路

```python
import math

def solve(x):
    ans = 0
    for i in range(100000):
        if x <= i * (i + 1) / 2:
            ans = i
            break
    return ans

if __name__ == '__main__':
    x = int(input())
    print(solve(x))
```

### 复杂度分析

- 时间复杂度：O(100000)。
- 空间复杂度：O(1)。

### 相关题目

- [p03778](../p03778)
</s>
