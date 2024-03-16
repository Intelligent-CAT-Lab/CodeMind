<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p02783 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in) ) {
            String[] line = sc.nextLine().split(" ");

            int h = Integer.valueOf(line[0]);
            int a = Integer.valueOf(line[1]);

            int n = h/a;
            if (h%a > 0) {
                n += 1;
            }

            // åºå
            System.out.println(n);
        }
    }
}
```

### 解答

```python
import sys

line = sys.stdin.readline().split()
h = int(line[0])
a = int(line[1])

n = h//a
if h%a > 0:
    n += 1

print(n)
```

### 解析

```python
import sys

line = sys.stdin.readline().split()
h = int(line[0])
a = int(line[1])

n = h//a
if h%a > 0:
    n += 1

print(n)
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p02782](https://leetcode-cn.com/problems/p02782/)
</s>
