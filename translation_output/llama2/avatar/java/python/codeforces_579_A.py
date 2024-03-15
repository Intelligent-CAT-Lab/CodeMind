<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.util.ArrayList;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        String s = " ";
        
        while (n > 0) {
            int x = n % 2;
            n /= 2;
            s += x + " ";
        }
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
```

### 解题思路

1. 首先，我们需要将输入的数字转换成字符串，然后将字符串转换成数组。
2. 然后，我们需要将数组中的数字按照从小到大的顺序排序。
3. 最后，我们需要将数组中的数字按照从小到大的顺序排序。

### 代码实现

```python
import sys

n = int(sys.stdin.readline())
s = " "

while n > 0:
    x = n % 2
    n //= 2
    s += str(x) + " "

ans = 0

for i in range(len(s)):
    if s[i] == "1":
        ans += 1

print(ans)
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

1. [codeforces_579_B](./codeforces_579_B.md)
</s>
