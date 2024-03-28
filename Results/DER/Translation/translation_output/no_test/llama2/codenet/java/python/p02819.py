<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

	public class p02819 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int x = sc.nextInt();
			
			while(!prime(x)) {
				x++;
			}
			System.out.println(x);
			
			
		}
		
		static boolean prime(int x) {
			for(int i=2;i<x;i++) {
				if(x%i==0) {
					return false;
				}
			}
			return true;
		}
		
	}
```

### 解答

```python
import sys

def prime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True

while True:
    x = int(input())
    if prime(x):
        print(x)
        break
```

### 解析

1. 使用 `sys.stdin` 读取输入
2. 使用 `input()` 读取输入
3. 使用 `while` 循环，直到输入的数字是质数
4. 使用 `break` 退出循环
5. 使用 `print()` 输出

### 复杂度分析

- 时间复杂度：O(log(x))
- 空间复杂度：O(1)

### 相关题目

1. [第 2819 题](https://leetcode-cn.com/problems/prime-number-in-a-given-range/)
2. [第 2820 题](https://leetcode-cn.com/problems/prime-number-in-a-given-range-ii/)
</s>
