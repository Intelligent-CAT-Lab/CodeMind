<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int res = a;
        
        while (a >= b) {
            res += (a / b);
            a = (a / b) + (a % b);
        }
        
        System.out.println(res);
    }
}
```

### 解题思路

```python
import java.util

class codeforces_379_A:
    def main(self, args):
        a = int(input())
        b = int(input())
        res = a
        
        while a >= b:
            res += (a / b)
            a = (a / b) + (a % b)
        
        print(res)
```

### 复杂度分析

- 时间复杂度：O(log(a))
- 空间复杂度：O(1)

### 相关题目

- [codeforces_379_B](./codeforces_379_B.md)
</s>
