<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02729 {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			

			int n = sc.nextInt();
			int m = sc.nextInt();

			int nComb = n * (n-1) / 2;
			int mComb = m * (m-1) / 2;
			
			System.out.println(nComb + mComb);
			
		}
	}

}
```

### 解答

```python
import sys

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())

nComb = n * (n-1) / 2
mComb = m * (m-1) / 2

print(nComb + mComb)
```

### 解析

```
import java.util.Scanner;

public class p02729 {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			

			int n = sc.nextInt();
			int m = sc.nextInt();

			int nComb = n * (n-1) / 2;
			int mComb = m * (m-1) / 2;
			
			System.out.println(nComb + mComb);
			
		}
	}

}
```

- 使用 `try-with-resources` 语句来声明 `Scanner` 对象，并在 `finally` 块中关闭 `Scanner` 对象。
- 使用 `Scanner` 对象读取输入，并将输入转换为整数。
- 使用 `nComb` 和 `mComb` 变量来计算 `nComb` 和 `mComb` 的值。
- 使用 `print` 语句输出 `nComb + mComb` 的值。

### 复杂度分析

- 时间复杂度：`O(n)`。
- 空间复杂度：`O(1)`。

### 相关题目

- [p02728](../p02728)
- [p02730](../p02730)
</s>
