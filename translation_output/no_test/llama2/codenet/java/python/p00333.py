<s> Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

class p00333 {

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int WH = gcd(W, H);
        int C = sc.nextInt();

        
        int a = (W/WH)*(H/WH);
        
        System.out.println(a*C);
    }
}

```

### 解答

```python
import math

def gcd(x, y):
    if y == 0:
        return x
    return gcd(y, x % y)

def main():
    W, H = map(int, input().split())
    WH = gcd(W, H)
    C = int(input())
    a = (W/WH)*(H/WH)
    print(a*C)

if __name__ == '__main__':
    main()
```

### 解析

1. 使用 ```math.gcd``` 函数代替 ```gcd``` 函数
2. 使用 ```map``` 函数将 ```W``` 和 ```H``` 转换为 ```int``` 类型
3. 使用 ```input``` 函数获取用户输入
4. 使用 ```split``` 函数将用户输入分割成两个字符串
5. 使用 ```int``` 函数将字符串转换为 ```int``` 类型
6. 使用 ```gcd``` 函数计算 ```W``` 和 ```H``` 的最大公约数
7. 使用 ```C``` 变量存储用户输入的值
8. 使用 ```a``` 变量存储 ```W/WH``` 和 ```H/WH``` 的乘积
9. 使用 ```*``` 运算符计算 ```a``` 和 ```C``` 的乘积
10. 使用 ```print``` 函数打印结果

### 复杂度分析

- 时间复杂度：$$O(1)$$
- 空间复杂度：$$O(1)$$

### 相关题目

- [p00332](../p00332)
- [p00334](../p00334)
</s>
