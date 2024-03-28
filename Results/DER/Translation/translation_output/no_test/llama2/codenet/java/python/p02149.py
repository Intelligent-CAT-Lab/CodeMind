<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02149 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int idx = 0;
		for (int i = 0; i < 3; i++) {
		    int x = sc.nextInt();
		    if (max < x) {
		        max = x;
		        idx = i;
		    }
		}
		System.out.println((char)('A' + idx));
	}
}


```

### 解题思路

```python
import sys

def main():
    max = 0
    idx = 0
    for i in range(3):
        x = int(input())
        if max < x:
            max = x
            idx = i
    print(chr(ord('A') + idx))

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p02148](https://leetcode-cn.com/problems/p02148/)
</s>
