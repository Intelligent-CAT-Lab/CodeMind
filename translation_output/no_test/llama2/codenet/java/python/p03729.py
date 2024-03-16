<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p03729 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        if (a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

### 解题思路

1. 首先我们需要把字符串转换成字符数组，然后我们可以使用`str.charAt(index)`来获取字符串中的某个字符。
2. 然后我们需要判断字符串的最后一个字符和第一个字符是否相同，如果相同，则说明字符串是回文串。
3. 最后我们需要判断字符串的最后一个字符和第二个字符是否相同，如果相同，则说明字符串是回文串。

### 代码实现

```python
import sys

def main():
    a = sys.stdin.readline()
    b = sys.stdin.readline()
    c = sys.stdin.readline()

    if a[-1] == b[0] and b[-1] == c[0]:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [p03728](https://leetcode-cn.com/problems/palindrome-subsequence/)
</s>
