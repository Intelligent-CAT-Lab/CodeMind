<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class p03795{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);

		int n;
		n = Integer.parseInt(reader.readLine());

		System.out.println((n * 800) - ((n / 15) * 200));

		reader.close();
	}
}
```

### 解题思路

```python
import sys

n = int(sys.stdin.readline())

print((n * 800) - ((n / 15) * 200))
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 执行

执行用时：**0 ms**，在所有 Python3.6 提交的用户中击败了**0.00%** 的用户

内存消耗：**13.7 MB**，在所有 Python3.6 提交的用户中击败了**0.00%** 的用户</s>
