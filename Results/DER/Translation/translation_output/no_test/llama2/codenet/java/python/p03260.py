<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class p03260 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if((n*k) % 2 == 1) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}
}

```

### 解题思路

```python
import java.util
import java.io

def main():
    n = int(input())
    k = int(input())
    if (n*k) % 2 == 1:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p03259](https://leetcode-cn.com/problems/p03259/)
</s>
