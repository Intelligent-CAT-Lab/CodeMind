<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p03610{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] array = s.split("");

        for(int i = 0; i < s.length(); i += 2){
            System.out.print(array[i]);
        }
        
    }
}
```

### 解题思路

```python
import java.util

class p03610:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        s = sc.next()
        array = s.split("")

        for i in range(0, len(s), 2):
            print(array[i])
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [p03609](./p03609.md)
</s>
