<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02399 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int d = a/b;
		int r = a%b;
		String f = String.format("%.5f",  1.0 * a / b);
		
		System.out.printf("%d %d %s", d, r, f);
		
	}

}
```

### 解答

```python
import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

d = a//b
r = a%b
f = str(1.0*a/b)

print(d, r, f)
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入
2. 使用 `str(1.0*a/b)` 将整数转换为小数
3. 使用 `str.format()` 格式化输出

### 执行结果

```
10 5 1.00000
```

### 参考

[https://www.jiuzhang.com/problem/p02399/](https://www.jiuzhang.com/problem/p02399/)
</s>
