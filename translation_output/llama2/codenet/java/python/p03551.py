<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03551 {

	public static void main(String[] args) {
		p03551 m = new p03551();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		long base = n*100+m*1800;
		
		System.out.println(base << m);
		
	}
}

```

### 解答

```python
import sys

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())

base = n*100+m*1800

print(base << m)
```

### 解析

1. 使用 ```sys.stdin``` 读取输入
2. 使用 ```base = n*100+m*1800``` 计算 ```base```
3. 使用 ```print(base << m)``` 打印结果

### 复杂度分析

1. 时间复杂度：$$O(1)$$
2. 空间复杂度：$$O(1)$$

### 相关题目

1. [p03550](../p03550)
2. [p03552](../p03552)
</s>
