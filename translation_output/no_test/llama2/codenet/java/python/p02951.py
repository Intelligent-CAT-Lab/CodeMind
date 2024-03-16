<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02951 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          if(b + c < a){
              System.out.println(0);
          } else {
            System.out.println(b + c - a);
          }
        }
    }
```

### 解题思路

```python
import java.util

def main():
    a = int(input())
    b = int(input())
    c = int(input())
    if b + c < a:
        print(0)
    else:
        print(b + c - a)

main()
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p02950](https://leetcode-cn.com/problems/java-to-python-p02950/)
</s>
