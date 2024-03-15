<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import re
pattern = r"^A?KIHA?BA?RA?$"
S = input()
if re.match(pattern,S):
    print("YES")
else:
    print("NO")
```

### 解答

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String S = "KIHABARA";
        Pattern pattern = Pattern.compile("^A?KIHA?BA?RA?$");
        Matcher matcher = pattern.matcher(S);
        if (matcher.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

### 解析

```
import re
pattern = r"^A?KIHA?BA?RA?$"
S = input()
if re.match(pattern,S):
    print("YES")
else:
    print("NO")
```

- 使用 `import re` 导入正则表达式模块
- 使用 `r"^A?KIHA?BA?RA?$"` 定义正则表达式
- 使用 `S = input()` 读取字符串
- 使用 `if re.match(pattern,S):` 判断字符串是否匹配正则表达式
- 使用 `print("YES")` 输出结果
- 使用 `else: print("NO")` 输出结果

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [Python 题目 0001](https://leetcode-cn.com/problems/python-problem-0001/)
- [Python 题目 0002](https://leetcode-cn.com/problems/python-problem-0002/)
- [Python 题目 0003](https://leetcode-cn.com/problems/python-problem-0003/)
- [Python 题目 0004](https://leetcode-cn.com/problems/python-problem-0004/)
- [Python 题目 0005](https://leetcode-cn.com/problems/python-problem-0005/)
- [Python 题目 0006](https://leetcode-cn.com/problems/python-problem-0006/)
- [Python 题目 0007](https://leetcode-cn.com/problems/python-problem-0007/)
- [Python 题目 0008](https://leetcode-cn.com/problems/python-problem-0008/)
- [Python 题目 0009](https://leetcode-cn.com/problems/python-problem-0009/)
- [Python 题目 0010](https://leetcode-cn.com/problems/python-problem-0010/)
- [Python 题目 0011](https://leetcode-cn.com/problems/python-problem-0011/)
- [Python 题目 0012](https://leetcode-cn.com/problems/python-problem-0012/)
- [Python 题目 0013](https://leetcode-cn.com/problems/python-problem-0013/)
- [Python 题目 0014](https://leetcode-cn.com/problems/python-problem-0014/)
- [Python 题目 0015](https://leetcode-cn.com/problems/python-problem-0015/)
- [Python 题目 0016](https://leetcode-cn.com/problems/python-problem-0016/)
- [Python 题目 0017](https://leetcode-cn.com/problems/python-problem-0017/)
- [Python 题目 0018](https://leetcode-cn.com/problems/python-problem-0018/)
- [Python 题目 0019](https://leetcode-cn.com/problems/python-problem-0019/)
- [Python 题目 0020](https://leetcode-cn.com/problems/python-problem-0020/)
- [Python 题目 0021](https://leetcode-cn.com/problems/python-problem-0021/)
- [Python 题目 0022](https://leetcode-cn.com/problems/python-problem-0022/)
- [Python 题目 0023](https://leetcode-cn.com/problems/python-problem-0023/)
- [Python 题目 0024](https://leetcode-cn.com/problems/python-problem-0024/)
- [Python 题目 0025](https://leetcode-cn.com/problems/python-problem-0025/)
- [Python 题目 0026](https://leetcode-cn.com/problems/python-problem-0026/)
- [Python 题目 0027](https://leetcode-cn.com/problems/python-problem-0027/)
- [Python 题目 0028](https://leetcode-cn.com/problems/python-problem-0028/)
- [Python 题目 0029](https://leetcode-cn.com/problems/python-problem-0029/)
- [Python 题目 0030](https://leetcode-cn.com/problems/python-problem-0030/)
- [Python 题目 0031](https://leetcode-cn.com/problems/python-problem-0031/)
- [Python 题目 0032](https://leetcode-cn.com/problems/python-problem-0032/)
- [Python 题目 0033](https://leetcode-cn.com/problems/python-problem-0033/)
- [Python 题目 0034](https://leetcode-cn.com/problems/python-problem-0034/)
- [Python 题目 0035](https://leetcode-cn.com/problems/python-problem-0035/)
- [Python 题目 0036](https://leetcode-cn.com/problems/python-problem-0036/)
- [Python 题目 0037](https://leetcode-cn.com/problems/python-problem-0037/)
- [Python 题目 0038](https://leetcode-cn.com/problems/python-problem-0038/)
- [Python 题目 0039](https://leetcode-cn.com/problems/python-problem-0039/)
- [Python 题目 0040](https://leetcode-cn.com/problems/python-problem-0040/)
- [Python 题目 0041](https://leetcode-cn.com/problems/python-problem-0041/)
- [Python 题目 0042](https://leetcode-cn.com/problems/python-problem-0042/)
- [Python 题目 0043](https://leetcode-cn.com/problems/python-problem-0043/)
- [Python 题目 0044](https://leetcode-cn.com/problems/python-problem-0044/)
- [Python 题目 0045](https://leetcode-cn.com/problems/python-problem-00
