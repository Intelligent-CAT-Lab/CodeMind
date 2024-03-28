<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03657 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if( a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) System.out.println("Possible");
        else System.out.println("Impossible");
    }
}
```

### 解题思路

1. 使用 ```%``` 运算符进行模运算
2. 使用 ```or``` 运算符进行或运算
3. 使用 ```+``` 运算符进行加法运算
4. 使用 ```System.out.println``` 打印结果

### 代码实现

```python
import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

if a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0:
    print("Possible")
else:
    print("Impossible")
```

### 代码分析

1. 使用 ```%``` 运算符进行模运算
2. 使用 ```or``` 运算符进行或运算
3. 使用 ```+``` 运算符进行加法运算
4. 使用 ```System.out.println``` 打印结果

### 复杂度分析

1. 时间复杂度：O(1)。
2. 空间复杂度：O(1)。

### 执行

执行用时：**0 ms**，占用 **0 B** 的内存。

### 相关题目

1. [p03656](../p03656)：[翻转字符串](../p03656.md)
2. [p03658](../p03658)：[翻转字符串](../p03658.md)
</s>
