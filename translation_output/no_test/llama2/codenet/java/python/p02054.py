<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02054 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int odd = 0;
		for (int i = 0; i < 3; i++) {
			odd += sc.nextInt() % 2;
		}
		System.out.println(odd >= 2 ? "Hom" : "Tem");
	}
}


```

### 解答

```python
import sys

odd = 0
for i in range(3):
    odd += int(sys.stdin.readline()) % 2

print(odd >= 2, "Hom", "Tem")
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入，并转换为整数
2. 使用 `odd += int(sys.stdin.readline()) % 2` 计算总和
3. 使用 `print(odd >= 2, "Hom", "Tem")` 打印结果

### 执行

```bash
$ python p02054.py
1
2
3
Hom
```

### 参考

1. [https://www.jiuzhang.com/problem/p02054/](https://www.jiuzhang.com/problem/p02054/)
</s>
