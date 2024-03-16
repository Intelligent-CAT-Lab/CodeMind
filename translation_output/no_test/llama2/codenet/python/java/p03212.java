<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())

def dfs(s):
    if int(s) > n:
        return 0
    ret = 1 if all(s.count(c) > 0 for c in '753') else 0
    for c in '753':
        ret += dfs(s + c)
    return ret

print(dfs('0'))
```

### 解答

```java
public class Solution {
    public int dfs(String s) {
        int n = Integer.parseInt(s);
        int ret = 1;
        for (char c : '753'.toCharArray()) {
            ret += dfs(s + c);
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = Integer.parseInt(args[0]);
        System.out.println(solution.dfs("0"));
    }
}
```

### 解析

1. 将python的`n = int(input())`转换为java的`int n = Integer.parseInt(args[0]);`
2. 将python的`def dfs(s):`转换为java的`public int dfs(String s)`
3. 将python的`if int(s) > n:`转换为java的`if (s.length() > n)`
4. 将python的`return 0`转换为java的`return 0`
5. 将python的`ret = 1 if all(s.count(c) > 0 for c in '753')`转换为java的`ret = 1 if (s.length() > n)`
6. 将python的`for c in '753':`转换为java的`for (char c : '753'.toCharArray()) {`
7. 将python的`ret += dfs(s + c)`转换为java的`ret += dfs(s + c);`
8. 将python的`return ret`转换为java的`return ret;`

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [Python3代码转换为Java代码](https://leetcode-cn.com/problems/python3-code-translation-to-java-code/)
</s>
