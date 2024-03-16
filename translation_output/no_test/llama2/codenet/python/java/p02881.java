<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from math import *
n = int(input())

def ij(x):
    for i in range(x, 0, -1):
        if n/i == n//i:
            return i, n//i

print(sum(ij(int(sqrt(n)))) - 2)
```

### 解题思路

```
1. 使用循环来实现
2. 使用递归来实现
```

### 代码实现

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n / i == n // i) {
                sum += i;
            }
        }
        System.out.println(sum - 2);
    }
}
```

### 复杂度分析

- 时间复杂度：O(n)
- 空间复杂度：O(1)
</s>
