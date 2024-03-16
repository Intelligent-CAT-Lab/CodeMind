<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class p02687 {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		String s = sc.next();
		sc.close();
		out.println(s.equals("ABC")?"ARC":"ABC");
	}
}

```

### 解题思路

```python
import java.util
import java.io
import static java.lang.Integer
import static java.lang.Long
import static java.lang.Math
import static java.lang.System

def main():
    i,j = 0,0
    sc = java.io.Scanner(java.io.System.in)
    s = sc.next()
    sc.close()
    print(s.equals("ABC")?"ARC":"ABC")

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p02686](https://leetcode-cn.com/problems/p02686/)
</s>
