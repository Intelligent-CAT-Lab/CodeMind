<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class p03463 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		
		int k = b - a;
		if(k % 2 == 1) System.out.println("Borys");
		else System.out.println("Alice");
	}
}
```

### 解答

```python
import java.util
import java.io

def main():
    n = int(input())
    a = int(input())
    b = int(input())
    k = b - a
    if k % 2 == 1:
        print("Borys")
    else:
        print("Alice")
```

### 解析

1. 使用 `import` 语句导入所需的包
2. 使用 `main` 函数作为程序的入口
3. 使用 `Scanner` 类来读取输入
4. 使用 `if` 语句判断输入
5. 使用 `print` 语句输出结果

### 总结

1. 使用 `import` 语句导入所需的包
2. 使用 `main` 函数作为程序的入口
3. 使用 `Scanner` 类来读取输入
4. 使用 `if` 语句判断输入
5. 使用 `print` 语句输出结果

### 参考

1. [Java to Python](https://www.programiz.com/python-programming/examples/java-to-python)
</s>
