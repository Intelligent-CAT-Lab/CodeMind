<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03524 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int a = 0, b = 0, c = 0;
    for (int i = 0; i < S.length(); i++) {
      char x = S.charAt(i);
      if (x == 'a') a++;
      if (x == 'b') b++;
      if (x == 'c') c++;
    }
    if (Math.max(Math.max(a,b),c)-Math.min(Math.min(a,b),c) <= 1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    } 
  }
}

```

### 解题思路

```python
import java.util

def main():
    S = input()
    a = 0
    b = 0
    c = 0
    for i in range(len(S)):
        x = S[i]
        if x == 'a':
            a += 1
        if x == 'b':
            b += 1
        if x == 'c':
            c += 1
    if max(max(a, b), c) - min(min(a, b), c) <= 1:
        print('YES')
    else:
        print('NO')

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03523](https://leetcode-cn.com/problems/p03523/)
</s>
