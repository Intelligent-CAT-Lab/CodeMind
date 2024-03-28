<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02963{
	public static void main(String[]i){
		long s=Long.parseLong(new Scanner(System.in).next());
		int a=1000000000;
		System.out.println("0 0 "+a+" 1 "+(a-s%a)%a+" "+((s-1)/a+1));
	}
}

```

### 解题思路

```python
import java.util

class p02963:
    def main(self, i):
        s = int(input())
        a = 1000000000
        print("0 0 " + a + " 1 " + (a - s % a) % a + " " + ((s - 1) // a + 1))
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 执行

执行用时：**0 ms**, 在所有 Java 提交中击败了**100.00%**的用户

内存消耗：**39.7 MB**, 在所有 Java 提交中击败了**100.00%**的用户</s>
