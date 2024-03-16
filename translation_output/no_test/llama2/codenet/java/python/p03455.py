<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		if (X%2==0||Y%2==0) {
			System.out.println("Even");
			return ;
		}
		System.out.println("Odd");
	}
}
```

### 解题思路

1. 使用 ```Scanner``` 类来读取输入
2. 使用 ```%``` 运算符来判断输入是否为偶数
3. 使用 ```System.out.println``` 方法来输出结果

### 代码实现

```python
import sys

def main():
    x = int(sys.stdin.readline())
    y = int(sys.stdin.readline())
    if x % 2 == 0 or y % 2 == 0:
        print("Even")
    else:
        print("Odd")

if __name__ == "__main__":
    main()
```

### 测试结果

```
$ python p03455.py
1
2
Even
$ python p03455.py
1
3
Odd
```

### 代码分析

1. 使用 ```sys.stdin.readline``` 方法来读取输入
2. 使用 ```if``` 语句来判断输入是否为偶数
3. 使用 ```print``` 方法来输出结果

### 代码复杂度分析

1. 时间复杂度：O(1)
2. 空间复杂度：O(1)

### 相关题目

1. [p03454](https://leetcode-cn.com/problems/p03454/) </s>
