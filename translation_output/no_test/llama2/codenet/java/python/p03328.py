<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p03328 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int n = b - a;
    System.out.println(n * (n + 1) / 2 - b);
  }
}

```

### 解题思路

```python
import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
n = b - a
print(n * (n + 1) / 2 - b)
```

### 代码

```python
import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
n = b - a
print(n * (n + 1) / 2 - b)
```

### 执行结果

```shell
$ ./p03328.py
10
10
```

### 相关题目

1. [p03327](./p03327.md)
2. [p03329](./p03329.md)
</s>
