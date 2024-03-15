<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03813{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(s.nextInt()<1200?"ABC":"ARC");
	}
}
```

### 解题思路

```python
import java.util

def main():
    num = int(input())
    if num < 1200:
        print("ABC")
    else:
        print("ARC")

if __name__ == "__main__":
    main()
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p03812](https://leetcode-cn.com/problems/p03812/)
</s>
