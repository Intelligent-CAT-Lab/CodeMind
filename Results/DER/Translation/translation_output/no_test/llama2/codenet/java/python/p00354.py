<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p00354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("thu:fri:sat:sun:mon:tue:wed".split(":")[sc.nextInt()%7]);
    }
}

```

### 解答

```python
import sys

def main():
    n = int(sys.stdin.readline())
    print("thu:fri:sat:sun:mon:tue:wed".split(":")[n % 7])

if __name__ == "__main__":
    main()
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入，然后转换为整数，然后根据输入的日期，从 `thu:fri:sat:sun:mon:tue:wed`.split(":")[n % 7] 中取出对应的日期。

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p00353](https://leetcode-cn.com/problems/p00353/)
</s>
