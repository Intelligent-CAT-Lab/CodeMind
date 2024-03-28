<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02910 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();

		for (int i = 0; i < N.length(); i++) {
			char c = N.charAt(i);
			if (i % 2 == 0) {
				if (c =='L') {
					System.out.println("No");
					break;
				}
			}else {
				if (c =='R') {
					System.out.println("No");
					break;
				}
			}
			if (i == N.length() - 1) {
				System.out.println("Yes");
			}
		}
	}

}
```

### 解答

```python
import sys

N = sys.stdin.readline()

for i in range(len(N)):
    if i % 2 == 0:
        if N[i] == 'L':
            sys.stdout.write('No')
            break
    else:
        if N[i] == 'R':
            sys.stdout.write('No')
            break

if i == len(N) - 1:
    sys.stdout.write('Yes')
```

### 解析

1. 读取输入
2. 循环输入
3. 判断输入
4. 输出

### 复杂度分析

- 时间复杂度：O(N)
- 空间复杂度：O(1)

### 相关题目

- [p02909](https://leetcode-cn.com/problems/palindrome-subsequence-ii/)
</s>
