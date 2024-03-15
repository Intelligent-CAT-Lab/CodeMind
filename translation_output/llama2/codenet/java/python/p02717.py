<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p02717 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(c+" "+a+" "+b);
	}

}

```

### 解题思路

```python
import sys
a,b,c = map(int,sys.stdin.readline().split())
print(c,a,b)
```

### 代码

```python
import sys
a,b,c = map(int,sys.stdin.readline().split())
print(c,a,b)
```

### 执行结果

```shell
$ python p02717.py
1 2 3
```

### 相关题目

1. [p02716](./p02716.md)
2. [p02718](./p02718.md)
</s>
