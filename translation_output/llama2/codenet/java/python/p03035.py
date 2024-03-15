<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p03035{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(a<=5){
      System.out.println(0);
    }
    else if(a<=12){
      System.out.println((int)(b/2));
    }
    else{
      System.out.println(b);
    }
  }
}
```

### 解题思路

```python
import java.util

class p03035:
    def main(self, args):
        a = int(input())
        b = int(input())
        if a <= 5:
            print(0)
        elif a <= 12:
            print(b // 2)
        else:
            print(b)
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03034](https://leetcode-cn.com/problems/p03034/)
</s>
