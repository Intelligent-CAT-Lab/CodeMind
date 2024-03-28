<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03844 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in);
		int c = 0;
		int a = sc.nextInt();
		String s = sc.next();
		int b = sc.nextInt();
		if(s.equals("+")) {
			c = a + b;
		}else if(s.equals("-")) {
			c = a - b;
		}
		System.out.print(c);
	}
}
```

### 解题思路

```python
import java.util

def main():
    a = int(input())
    b = int(input())
    if input() == "+":
        c = a + b
    elif input() == "-":
        c = a - b
    print(c)

if __name__ == "__main__":
    main()
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p03843](https://leetcode-cn.com/problems/translate-java-code-to-python-2/)
</s>
