<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03533 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}";
        String s = sc.next();
        if(s.matches(pat)) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }

}

```

### 解题思路

```python
import re

pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
s = input()
if re.search(pat, s):
    print("YES")
else:
    print("NO")
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [p03532](../p03532)
- [p03534](../p03534)
</s>
