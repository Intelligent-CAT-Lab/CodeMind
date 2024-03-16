<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02682{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    int sum = 0;
    if (d<=a){
      System.out.println(d);
      return;
    }
    sum = a;
    d -= a;
    if(d<=b){
      System.out.println(sum);
      return;
    }
    d-=b;
    sum -= d;
    System.out.println(sum);
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
    d = int(input())
    sum = 0
    if d <= a:
        print(d)
        return
    sum = a
    d -= a
    if d <= b:
        print(sum)
        return
    d -= b
    sum -= d
    print(sum)

main()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p02681](https://leetcode-cn.com/problems/p02681/)
</s>
