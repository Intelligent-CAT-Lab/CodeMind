<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n,k=map(int,input().split())
a=0
for _ in range(n-1):a+=a//(k-1)+1
print(a)
```

### 解题思路

```
n,k=map(int,input().split())
a=0
for _ in range(n-1):a+=a//(k-1)+1
print(a)
```

### 代码实现

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,k;
        n = scanner.nextInt();
        k = scanner.nextInt();
        int a = 0;
        for (int i = 0; i < n - 1; i++) {
            a += a / (k - 1) + 1;
        }
        System.out.println(a);
    }
}
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 执行

执行结果：

![](./code.png)

### 总结

1. 使用Scanner类来获取输入。
2. 使用for循环来循环执行。
3. 使用+=运算符来进行加法运算。
4. 使用/运算符来进行除法运算。
5. 使用+运算符来进行加法运算。
6. 使用System.out.println()来输出结果。
</s>
