<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03737{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        for(int i = 0; i < 3; i++){
                                System.out.print(Character.toUpperCase(sc.next().charAt(0)));
                        }
                        System.out.println("");
                }
        }
}
```

### 解答

```python
import sys

for i in range(3):
    sys.stdout.write(chr(ord(sys.stdin.read(1)) - 32).upper())
    sys.stdout.write(' ')
```

### 解析

1. 使用 `sys.stdin.read(1)` 读取一个字符，然后使用 `chr(ord(sys.stdin.read(1)) - 32)` 将其转换为小写字符，最后使用 `upper()` 将其转换为大写字符。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03736](../p03736)
</s>
