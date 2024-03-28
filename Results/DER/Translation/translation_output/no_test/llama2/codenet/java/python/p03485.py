<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03485 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solve(a, b));

        sc.close();
    }

    static int solve(int a, int b) {
        return (a + b + 1) / 2;
    }
}
```

### 解题思路

```python
import java.util.Scanner

def main():
    a = int(input())
    b = int(input())
    print(solve(a, b))

def solve(a, b):
    return (a + b + 1) / 2

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p03484](https://leetcode-cn.com/problems/p03484/)
</s>
