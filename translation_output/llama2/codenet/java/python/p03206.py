<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03206 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int D=stdIn.nextInt();
		if(D==25)
			System.out.println("Christmas");
		if(D==24)
			System.out.println("Christmas Eve");
		if(D==23)
			System.out.println("Christmas Eve Eve");
		if(D==22)
			System.out.println("Christmas Eve Eve Eve");
	}
}
```

### 解答

```python
import sys

D = int(sys.stdin.readline())

if D == 25:
    print("Christmas")
elif D == 24:
    print("Christmas Eve")
elif D == 23:
    print("Christmas Eve Eve")
elif D == 22:
    print("Christmas Eve Eve Eve")
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入，并将其转换为整数。
2. 使用 `if` 语句判断输入的值是否为 25，24，23，22。
3. 如果输入的值为 25，则输出“Christmas”；如果输入的值为 24，则输出“Christmas Eve”；如果输入的值为 23，则输出“Christmas Eve Eve”；如果输入的值为 22，则输出“Christmas Eve Eve Eve”。

### 思路

1. 使用 `sys.stdin.readline()` 读取输入，并将其转换为整数。
2. 使用 `if` 语句判断输入的值是否为 25，24，23，22。
3. 如果输入的值为 25，则输出“Christmas”；如果输入的值为 24，则输出“Christmas Eve”；如果输入的值为 23，则输出“Christmas Eve Eve”；如果输入的值为 22，则输出“Christmas Eve Eve Eve”。

### 代码

```python
import sys

D = int(sys.stdin.readline())

if D == 25:
    print("Christmas")
elif D == 24:
    print("Christmas Eve")
elif D == 23:
    print("Christmas Eve Eve")
elif D == 22:
    print("Christmas Eve Eve Eve")
```
</s>
