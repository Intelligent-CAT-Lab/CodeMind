<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class codeforces_32_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                str += 0;
            } else {
                if (s.charAt(i) == '-' && s.charAt(i + 1) == '.') {
                    str += 1;
                } else {
                    str += 2;
                    i++;
                }
            }
        }

        System.out.println(str);
    }
}
```

### 解题思路

```python
import sys

s = sys.stdin.readline()

str = ""

for i in range(len(s)):
    if s[i] == '.':
        str += '0'
    elif s[i] == '-' and s[i + 1] == '.':
        str += '1'
    else:
        str += '2'
        i += 1

print(str)
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [codeforces_32_A](https://leetcode-cn.com/problems/codeforces-32-a/)
</s>
