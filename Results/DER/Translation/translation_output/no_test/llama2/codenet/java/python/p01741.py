<s> Translate the following java code to python and enclose your solution inside ```python```:
```
public class p01741{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    double d, i;
    d = sc.nextDouble();
    if(d < 1)out.println(d * Math.sqrt(2));
    else if(d < Math.sqrt(2))out.println("2");
    else if(d < 2)out.println(d * Math.sqrt(2));
    else if(d < Math.sqrt(2) * 1.5)out.println("3");
    else out.println(d * Math.sqrt(2));

    sc.close();
  }
  public static void main(String[] args){
    (new p01741()).run(System.in, System.out);
  }
}
```

### 解题思路

```python
import sys

d = float(sys.stdin.readline())

if d < 1:
    print(d * math.sqrt(2))
elif d < math.sqrt(2):
    print("2")
elif d < 2:
    print(d * math.sqrt(2))
elif d < math.sqrt(2) * 1.5:
    print("3")
else:
    print(d * math.sqrt(2))
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p01740](https://leetcode-cn.com/problems/p01740/)
</s>
