<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03777{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    if(a.equals(b)){
      System.out.println("H");
    }else{
      System.out.println("D");
    }
  }
}

```

### 解题思路

```python
import java.util

def main():
    a = input()
    b = input()
    if a == b:
        print("H")
    else:
        print("D")

if __name__ == "__main__":
    main()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03776](https://leetcode-cn.com/problems/translate-java-code-to-python-2/)
</s>
