<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class codeforces_147_A {
    public static boolean isLatinLetter(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean iscodeforces_147_A(char c) {
        if (c == '.') return true;
        if (c == ',') return true;
        if (c == '!') return true;
        if (c == '?') return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        sb.append(s.charAt(0));
        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            if (isLatinLetter(c)) {
                if (!isLatinLetter(s.charAt(i - 1))) {
                    sb.append(' ');
                }
                sb.append(c);
            } else if (iscodeforces_147_A(c)) {
                sb.append(c);
            }
        }
        pw.println(sb);
        pw.flush();
        pw.close();
    }
}
```

### 解题思路

1. 首先，我们需要将字符串转换成一个字符串builder，然后在循环中，如果当前字符是一个拉丁字母，则将之前的字符转换成空格，然后将当前字符添加到字符串builder中。
2. 如果当前字符不是拉丁字母，且不是codeforces_147_A，则直接将当前字符添加到字符串builder中。
3. 最后，将字符串builder转换成字符串，并输出。

### 代码实现

```python
import sys


def isLatinLetter(c):
    return c >= 'a' and c <= 'z'


def iscodeforces_147_A(c):
    if c == '.':
        return True
    if c == ',':
        return True
    if c == '!':
        return True
    if c == '?':
        return True
    return False


def main():
    s = sys.stdin.readline()
    sb = ''
    n = len(s)
    sb += s[0]
    for i in range(1, n):
        c = s[i]
        if isLatinLetter(c):
            if not isLatinLetter(s[i - 1]):
                sb += ' '
            sb += c
        elif iscodeforces_147_A(c):
            sb += c
    print(sb)


if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

1. [codeforces_147_B](codeforces_147_B.md)
</s>
