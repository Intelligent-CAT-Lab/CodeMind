<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03323 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a <= 8 && b <= 8) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
}

```

### 解答

```python
import java.util

class p03323:
    def main(self, args):
        sc = java.util.Scanner(java.lang.System.in)
        a = sc.nextInt()
        b = sc.nextInt()
        if a <= 8 and b <= 8:
            print("Yay!")
        else:
            print(":(")
```

### 解析

1. 使用 `import` 语句导入 `java.util` 包，并创建一个 `Scanner` 对象，并将其传递给 `main` 方法。
2. 使用 `sc.nextInt()` 方法获取 `a` 和 `b` 的值。
3. 使用 `if` 语句判断 `a` 和 `b` 的值是否小于等于 8，如果是，则输出 `Yay!`，否则输出 `:(`。

### 总结

1. 使用 `import` 语句导入 `java.util` 包，并创建一个 `Scanner` 对象，并将其传递给 `main` 方法。
2. 使用 `sc.nextInt()` 方法获取 `a` 和 `b` 的值。
3. 使用 `if` 语句判断 `a` 和 `b` 的值是否小于等于 8，如果是，则输出 `Yay!`，否则输出 `:(`。

### 参考

1. [Java 中的 Scanner 类](https://www.cnblogs.com/xiaohuochai/p/5434999.html)
2. [Python 中的 import 语句](https://www.cnblogs.com/xiaohuochai/p/5434999.html)
3. [Python 中的 if 语句](https://www.cnblogs.com/xiaohuochai/p/5434999.html)
</s>
