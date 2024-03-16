<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, t;
        n = sc.nextInt();
        x = sc.nextInt();
        t = sc.nextInt();
        long ans = 0, tako = 0;
        while (n > tako) {
            ans += t;
            tako += x;
        }
        System.out.println(ans);
        sc.close();
    }
}
```

### 解题思路

```python
import java.util.Scanner;

class p02576:
    def __init__(self):
        pass

    def main(self):
        n = int(input())
        x = int(input())
        t = int(input())
        ans = 0
        tako = 0
        while n > tako:
            ans += t
            tako += x
        print(ans)

if __name__ == '__main__':
    p02576().main()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p02575](https://leetcode-cn.com/problems/p02575/)
</s>
