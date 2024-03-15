<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03385 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char s[] = sc.next().toCharArray();
        boolean abc[] = new boolean[3];
        for(int i = 0; i < 3; i++) {
            if( s[i] == 'a' ) abc[0] = true;
            if( s[i] == 'b' ) abc[1] = true;
            if( s[i] == 'c' ) abc[2] = true;
        }
        
        boolean isOK = true;
        for(int i = 0; i < 3; i++) {
            isOK &= abc[i];
        }
        
        System.out.println( (isOK) ? "Yes" : "No" );
    }
}

```

### 解题思路

```python
import sys

def main():
    s = sys.stdin.readline().strip()
    abc = [False] * 3
    for i in range(len(s)):
        if s[i] == 'a':
            abc[0] = True
        elif s[i] == 'b':
            abc[1] = True
        elif s[i] == 'c':
            abc[2] = True
    isOK = True
    for i in range(3):
        isOK = isOK and abc[i]
    print('Yes' if isOK else 'No')

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03384_java_to_python](https://leetcode-cn.com/problems/java-to-python/)
</s>
