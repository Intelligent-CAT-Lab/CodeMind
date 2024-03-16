<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p02723{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    if(s.charAt(2)==s.charAt(3) && s.charAt(4) == s.charAt(5))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
```

### 解题思路

```python
import java.util

class p02723:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        s = sc.next()
        if s[2] == s[3] and s[4] == s[5]:
            print("Yes")
        else:
            print("No")
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p02722](https://leetcode-cn.com/problems/p02722/)
</s>
