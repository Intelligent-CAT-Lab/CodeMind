<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02663 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = nextInt(scanner);
        int m1 = nextInt(scanner);
        int h2 = nextInt(scanner);
        int m2 = nextInt(scanner);
        int k = nextInt(scanner);
        int h = h2 - h1;
        int m = m2 - m1;
        int day = (h * 60) + m;
        System.out.println(day - k);

    }

    public static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }
}

```

### 解题思路

```python
import sys

def nextInt(scanner):
    return int(scanner.next())

def main():
    h1, m1, h2, m2, k = map(nextInt, sys.stdin.readline().split())
    h = h2 - h1
    m = m2 - m1
    day = (h * 60) + m
    print(day - k)

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p02662](https://leetcode-cn.com/problems/p02662/)
</s>
