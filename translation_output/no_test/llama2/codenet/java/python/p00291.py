<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00291 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a[]=new int[6];
		int b=0;
		for(int i=0;i<6;i++){
			a[i]=stdIn.nextInt();
		}
		b=a[0]+a[1]*5+a[2]*10+a[3]*50+a[4]*100+a[5]*500;
		if(1000<=b)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
```

### 解答

```python
import sys

a = [int(x) for x in sys.stdin.readline().split()]

b = 0
for i in range(len(a)):
    b += a[i]

if b >= 1000:
    print("1")
else:
    print("0")
```

### 解析

```python
import sys

a = [int(x) for x in sys.stdin.readline().split()]

b = 0
for i in range(len(a)):
    b += a[i]

if b >= 1000:
    print("1")
else:
    print("0")
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [p00290](./p00290.md)
</s>
