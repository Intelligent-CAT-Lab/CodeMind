<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		double a;
		a = (double) T / X;
		System.out.println(a);
	}
}

```

### 解题思路

1. 使用 ```Scanner``` 类读取输入
2. 使用 ```System.out.println``` 打印结果

### 代码实现

```python
import java.util.Scanner

def main():
    sc = Scanner(System.in)
    T = sc.nextInt()
    X = sc.nextInt()
    sc.close()
    a = (T / X)
    print(a)

if __name__ == '__main__':
    main()
```

### 测试用例

```
Input:
4
10
Output:
0.4
```

### 代码复杂度分析

- 时间复杂度：O(1)
- 空间复杂度：O(1)

### 相关题目

- [p03134](https://leetcode-cn.com/problems/p03134/)
</s>
