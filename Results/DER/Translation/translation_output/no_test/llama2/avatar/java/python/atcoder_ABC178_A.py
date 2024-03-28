<s> Translate the following java code to python and enclose your solution inside ```python```:
```
public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int x = new java.util.Scanner(System.in).nextInt();
        if (x == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
```

### 解答

```python
import sys

x = int(sys.stdin.readline())
if x == 0:
    print("1")
else:
    print("0")
```

### 解析

```python
import sys

x = int(sys.stdin.readline())
```

读取输入，并将其转换为整数。

```python
if x == 0:
    print("1")
else:
    print("0")
```

如果输入为0，则打印1，否则打印0。

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [atcoder_ABC178_B](./atcoder_ABC178_B.md)
</s>
