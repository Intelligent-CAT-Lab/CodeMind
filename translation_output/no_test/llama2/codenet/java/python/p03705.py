<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

	public class p03705 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			
			if(a>b||(n==1&&a!=b)) {
				System.out.println(0);
				return;
			}
			if(a==b) {
				System.out.println(1);
				return;
			}
			
			System.out.println((n-2)*(b-a)+1);
			
	    }
				
	}

```

### 解答

```python
import sys

n = int(sys.stdin.readline())
a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

if a > b or (n == 1 and a != b):
    print(0)
    return
if a == b:
    print(1)
    return

print((n - 2) * (b - a) + 1)
```

### 解析

1. 读取输入
2. 判断输入是否合法
3. 计算结果
4. 输出结果

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03704](https://leetcode-cn.com/problems/p03704/)
</s>
