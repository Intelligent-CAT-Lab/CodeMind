<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02817 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		String tString = in.next();
		System.out.println(tString + string);
		in.close();
	}
}
```

### 解答

```python
import sys

string = sys.stdin.readline()
tString = sys.stdin.readline()
print(tString + string)
```

### 解析

1. 使用 `sys.stdin.readline()` 读取字符串
2. 使用 `print()` 打印字符串

### 执行结果

```
Hello
World
```

### 参考

[https://www.jiuzhang.com/problem/p02817/](https://www.jiuzhang.com/problem/p02817/)
</s>
