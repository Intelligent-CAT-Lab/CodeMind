<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02897 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double n = sc.nextDouble();

    double odd = 0;
    double notOdd = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        notOdd++;
      } else {
        odd++;
      }
    }
    System.out.println(odd / n);
  }
}

```

### 解答

```python
import math

n = int(input())

odd = 0
notOdd = 0
for i in range(1, n+1):
    if i % 2 == 0:
        notOdd += 1
    else:
        odd += 1

print(odd / n)
```

### 解析

1. 使用 ```range()``` 函数来生成一个从 1 到 n 的序列，然后使用 ```if``` 语句来判断当前序列的值是否为奇数，如果是奇数，则加 1 到 ```odd``` 中，如果是偶数，则加 1 到 ```notOdd``` 中。
2. 最后使用 ```/``` 进行除法，得到结果。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p02896](../p02896)
- [p02898](../p02898)
</s>
