<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * Water Bottle
 */
public class p02882 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();

            double d;
            if (X * 2 >= A * A * B) {
                double z = (double) (A * A * B - X) / A / A * 2;
                d = Math.atan(z / A) * 180 / Math.PI;
            } else {
                double z = (double) (X) / A / B * 2;
                d = Math.atan(B / z) * 180 / Math.PI;
            }

            System.out.println(d);
        }
    }

}

```

### 解答

```python
import math

def main():
    A = int(input())
    B = int(input())
    X = int(input())

    if X * 2 >= A * A * B:
        z = (X * 2 - A * A * B) / (A * A)
        d = math.atan(z) * 180 / math.pi
    else:
        z = X / (A * B)
        d = math.atan(B / z) * 180 / math.pi

    print(d)

if __name__ == '__main__':
    main()
```

### 解析

1. 首先，我们需要将输入的数据转换为python的数据类型。
2. 然后，我们需要根据输入的数据判断是否满足条件，如果满足条件，则计算出d，否则计算出d。
3. 最后，我们将计算出的d输出到屏幕上。

### 思路

1. 首先，我们需要将输入的数据转换为python的数据类型。
2. 然后，我们需要根据输入的数据判断是否满足条件，如果满足条件，则计算出d，否则计算出d。
3. 最后，我们将计算出的d输出到屏幕上。

### 代码

```python
import math

def main():
    A = int(input())
    B = int(input())
    X = int(input())

    if X * 2 >= A * A * B:
        z = (X * 2 - A * A * B) / (A * A)
        d = math.atan(z) * 180 / math.pi
    else:
        z = X / (A * B)
        d = math.atan(B / z) * 180 / math.pi

    print(d)

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

1. [Water Bottle](https://leetcode-cn.com/problems/water-bottle/)
2. [Water Bottle II](https://leetcode-cn.com/problems/water-bottle-ii/)
</s>
