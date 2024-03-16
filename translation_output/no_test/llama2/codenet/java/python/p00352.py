<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.IOException;
import java.util.Scanner;

class p00352 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println((sc.nextInt() + sc.nextInt()) / 2);
	}
}

```

### 解答

```python
import sys

sys.stdin = open('00352.in', 'r')
sys.stdout = open('00352.out', 'w')

a, b = map(int, sys.stdin.readline().split())
print(a + b) // 2
```

### 解析

1. 使用 `sys.stdin = open('00352.in', 'r')` 将输入文件的输入流重定向到 `00352.in` 文件，使得程序可以读取输入文件的内容。
2. 使用 `sys.stdout = open('00352.out', 'w')` 将输出文件的输出流重定向到 `00352.out` 文件，使得程序可以写入输出文件的内容。
3. 使用 `a, b = map(int, sys.stdin.readline().split())` 将输入文件中的第一行内容 `a b` 转换为 `a` 和 `b` 两个整数，然后将它们存储在 `a` 和 `b` 两个变量中。
4. 使用 `print(a + b) // 2` 将 `a` 和 `b` 两个整数相加，然后除以 2 得到一个整数，然后将结果输出到 `00352.out` 文件中。

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

1. [00351](../00351)：[翻译](../00351.md)
2. [00353](../00353)：[翻译](../00353.md)
</s>
