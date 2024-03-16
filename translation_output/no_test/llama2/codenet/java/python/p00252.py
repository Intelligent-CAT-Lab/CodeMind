<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p00252 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[3];
		for(int i = 0; i < 3; i++) {
			a[i] = stdIn.nextInt();
		}
		if(a[0] == 1 && a[1] == 1) {
			System.out.println("Open");
		}
		else if(a[2] == 1) {
			System.out.println("Open");
		}
		else {
			System.out.println("Close");
		}
		
	}

}
```

### 解答

```python
import sys

a = [int(x) for x in sys.stdin.readline().split()]

if a[0] == 1 and a[1] == 1:
    print("Open")
elif a[2] == 1:
    print("Open")
else:
    print("Close")
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入，然后使用 `split()` 将输入分割成数组。
2. 使用 `if` 语句判断输入是否符合要求。
3. 使用 `print()` 打印结果。

### 执行结果

```
Open
```

### 参考

[https://www.jiuzhang.com/problem/p00252/](https://www.jiuzhang.com/problem/p00252/)
</s>
