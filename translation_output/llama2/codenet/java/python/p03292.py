<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class p03292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int R = sc.nextInt();
        int Y = sc.nextInt();

        int A = Math.max(Math.max(T,R),Y);
        int B = Math.min(Math.min(T,R),Y);

        System.out.println(A-B);
    }
}

```

### 解题思路

```python
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class p03292:
    def __init__(self):
        pass

    def main(self):
        sc = Scanner(System.in)
        T = sc.nextInt()
        R = sc.nextInt()
        Y = sc.nextInt()

        A = max(max(T,R),Y)
        B = min(min(T,R),Y)

        print(A-B)


if __name__ == '__main__':
    p03292().main()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03291](./p03291.md)
</s>
