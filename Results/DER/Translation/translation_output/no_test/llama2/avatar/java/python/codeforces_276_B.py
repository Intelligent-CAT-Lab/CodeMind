<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char ar[] = new char[26];
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ar[ch - 97]++;
        }
        
        int cntod = 0;
        for (int i = 0; i < 26; i++) {
            if ((ar[i] % 2) != 0)
                cntod++;
        }
        
        if (cntod == 0)
            System.out.println("First");
        else {
            if (cntod % 2 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
    }
}
```

### 解题思路

1. 首先，我们需要将字符串转换成一个字符数组，然后统计每个字符出现的次数。
2. 然后，我们需要判断字符数组中的每个字符是否是奇数，如果是，则说明是第一个，如果是偶数，则说明是第二个。
3. 最后，我们需要判断字符数组中的奇数个字符是否为0，如果是，则说明是第一个，如果不是，则说明是第二个。

### 代码实现

```python
import java.util

class codeforces_276_B:
    def main(self, args):
        in = java.util.Scanner(System.in)
        s = in.next()
        ar = [0] * 26
        for i in range(len(s)):
            ar[ord(s[i]) - 97] += 1
        cntod = 0
        for i in range(26):
            if (ar[i] % 2) != 0:
                cntod += 1
        if cntod == 0:
            print("First")
        else:
            if cntod % 2 == 0:
                print("Second")
            else:
                print("First")
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

1. [276. 第一个和第二个](https://leetcode-cn.com/problems/first-and-second-letter/)
2. [277. 第一个和第二个](https://leetcode-cn.com/problems/first-and-second-letter/)
</s>
