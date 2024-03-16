<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03945{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    sc.close();
    String[] str=new String[s.length()];
    int counter=0;
    for(int i=0;i<str.length;i++){
      str[i]=s.substring(i, i+1);
    }
    for(int i=0;i<str.length-1;i++){
      if(!str[i].equals(str[i+1])){
        counter++;
      }
    }
    System.out.println(counter);
  }
}
```

### 解题思路

```python
import java.util

class p03945:
    def __init__(self):
        pass

    def main(self):
        s = input()
        str = []
        for i in range(len(s)):
            str.append(s[i])
        counter = 0
        for i in range(len(str) - 1):
            if str[i] != str[i + 1]:
                counter += 1
        print(counter)
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [p03944](https://leetcode-cn.com/problems/p03944/)
</s>
