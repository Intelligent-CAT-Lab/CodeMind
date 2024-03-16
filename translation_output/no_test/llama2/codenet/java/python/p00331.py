<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int H = sc.nextInt();
            int R = sc.nextInt();

            if ( H < 0 && Math.abs(H) == R ) {
                System.out.println(0);
            } else if ( H + R > 0 ) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}


```

### 解答

```python
import sys

def main():
    H, R = map(int, sys.stdin.readline().split())
    if abs(H) == R:
        print(0)
    elif H + R > 0:
        print(1)
    else:
        print(-1)

if __name__ == '__main__':
    main()
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入，然后使用 `map` 将输入转换为 `int` 类型。
2. 使用 `if` 语句判断输入是否满足条件，并根据条件输出结果。

### 复杂度分析

- 时间复杂度：O(N)。
- 空间复杂度：O(1)。

### 相关题目

- [p00330](https://leetcode-cn.com/problems/p00330/)
</s>
