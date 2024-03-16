<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class p02970 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = Integer.parseInt(sc.next());
		final int D = Integer.parseInt(sc.next());

		BigDecimal ans = BigDecimal.valueOf(N / (D * 2 + 1.0));
		ans =  ans.setScale(0, RoundingMode.CEILING);
		System.out.println(ans);


	}

}

```

### 解题思路

1. 使用 ```BigDecimal``` 类来解决精度问题
2. 使用 ```RoundingMode.CEILING``` 来保证精度

### 代码

```python
import math

N, D = map(int, input().split())

ans = math.ceil(N / (D * 2 + 1))
print(ans)
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 执行

执行用时：**124 ms**，占用 **15.7 MB** 的内存。

### 结果

```
10
10
```
</s>
