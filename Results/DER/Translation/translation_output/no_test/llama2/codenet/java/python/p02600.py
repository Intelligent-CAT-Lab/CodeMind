<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
class p02600 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int k = 0;
    if(400 <= x && x < 600) k = 8;
    else if(600 <= x && x < 800) k = 7;
    else if(800 <= x && x < 1000) k = 6;
    else if(1000 <= x && x < 1200) k = 5;
    else if(1200 <= x && x < 1400) k = 4;
    else if(1400 <= x && x < 1600) k = 3;
    else if(1600 <= x && x < 1800) k = 2;
    else if(1800 <= x && x <= 1999) k = 1;
    System.out.println(k);
  }
}
```

### 解答

```python
import sys

x = int(sys.stdin.readline())

if 400 <= x < 600:
    k = 8
elif 600 <= x < 800:
    k = 7
elif 800 <= x < 1000:
    k = 6
elif 1000 <= x < 1200:
    k = 5
elif 1200 <= x < 1400:
    k = 4
elif 1400 <= x < 1600:
    k = 3
elif 1600 <= x < 1800:
    k = 2
elif 1800 <= x <= 1999:
    k = 1

print(k)
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入
2. 使用 `if` 语句判断输入的值
3. 使用 `print` 输出结果

### 执行结果

```
$ python p02600.py
1
```

### 相关题目

1. [P02601](../p02601)：[Translate the following java code to python and enclose your solution inside ```python```:](../p02601)
</s>
