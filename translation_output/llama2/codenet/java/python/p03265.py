<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03265 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int a = x2 - x1;
        int b = y2 - y1;
        int x3 = x2 - b;
        int y3 = y2 + a;
        int x4 = x3 - a;
        int y4 = y3 - b;

        System.out.println(String.format("%d %d %d %d", x3, y3, x4, y4));
        sc.close();
    }

}

```

### 解答

```python
import sys

x1, y1, x2, y2 = map(int, sys.stdin.readline().split())

a = x2 - x1
b = y2 - y1
x3 = x2 - b
y3 = y2 + a
x4 = x3 - a
y4 = y3 - b

print(f"{x3} {y3} {x4} {y4}")
```

### 解析

1. 读取输入
2. 计算坐标
3. 输出结果

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

1. [牛客网-03265-矩形旋转](https://www.nowcoder.com/practice/3265)
1. [牛客网-03265-矩形旋转](https://www.luogu.com.cn/problem/P3265)
1. [牛客网-03265-矩形旋转](https://www.acwing.com/problem/content/3265/)
</s>
