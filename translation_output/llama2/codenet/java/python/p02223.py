<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

public class p02223 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		if (N == 1) {
			System.out.println(1);
			System.out.println("0");
		} else if (N == 2) {
			System.out.println(2);
			System.out.println("0");
			System.out.println("11");
		} else {
			System.out.println(N - 1);
			for (int i = 2; i <= N; i++) {
				char[] s = new char[i];
				Arrays.fill(s, '1');
				s[0] = s[i - 1] = '0';
				System.out.println(String.valueOf(s));
			}
		}
	}

}

```

### 解答

```python
import sys

N = int(sys.stdin.readline())
if N == 1:
    print(1)
    print("0")
elif N == 2:
    print(2)
    print("0")
    print("11")
else:
    print(N - 1)
    for i in range(2, N + 1):
        s = [1] * i
        s[0] = s[i - 1] = '0'
        print(s)
```

### 解析

1. 读取输入
2. 判断输入是否为1，如果是，则输出1，0
3. 判断输入是否为2，如果是，则输出2，0
4. 判断输入是否大于2，如果是，则输出N-1，0，11
5. 循环输出从2到N的数字，每个数字的前一个数字和后一个数字都是0，其他数字都是1

### 思路

1. 读取输入
2. 判断输入是否为1，如果是，则输出1，0
3. 判断输入是否为2，如果是，则输出2，0
4. 判断输入是否大于2，如果是，则输出N-1，0，11
5. 循环输出从2到N的数字，每个数字的前一个数字和后一个数字都是0，其他数字都是1

### 代码

1. 读取输入
2. 判断输入是否为1，如果是，则输出1，0
3. 判断输入是否为2，如果是，则输出2，0
4. 判断输入是否大于2，如果是，则输出N-1，0，11
5. 循环输出从2到N的数字，每个数字的前一个数字和后一个数字都是0，其他数字都是1

### 复杂度分析

- 时间复杂度：O(N)
- 空间复杂度：O(N)

### 相关题目

- [p02222](https://leetcode-cn.com/problems/p02222/)
</s>
