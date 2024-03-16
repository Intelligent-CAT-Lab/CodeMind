<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03759 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a-b == b-c) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
```

### 解题思路

1. 使用 ```Scanner``` 类来读取输入
2. 使用 ```if``` 语句来判断 ```a-b == b-c``` 的结果
3. 使用 ```System.out.println``` 语句来输出结果

### 代码实现

```python
import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
c = int(sys.stdin.readline())

if a-b == b-c:
    print("YES")
else:
    print("NO")
```

### 复杂度分析

- 时间复杂度：$$O(1)$$
- 空间复杂度：$$O(1)$$

### 相关题目

1. [p03758](../p03758)
2. [p03757](../p03757)
</s>
