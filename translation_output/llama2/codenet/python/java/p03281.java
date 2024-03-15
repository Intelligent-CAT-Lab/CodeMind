<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())

def cnt_divisor(n):
    cnt = 0
    for i in range(1, n+1):
        if n % i == 0:
            cnt += 1
    return cnt

cnt = 0
for j in range(1, n+1):
    if j % 2 == 0:
        continue
    if cnt_divisor(j) == 8:
        cnt += 1

print(cnt)

```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {
                continue;
            }
            if (cnt_divisor(j) == 8) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }

    public static int cnt_divisor(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt += 1;
            }
        }
        return cnt;
    }
}
```

### 解析

1. 将输入转换为整数
2. 循环输入的整数，计算它的所有因子，并统计出现的次数
3. 循环输入的整数，如果它的所有因子的数量为8，则计数器加1
4. 输出计数器的值

### 思路

1. 将输入转换为整数
2. 循环输入的整数，计算它的所有因子，并统计出现的次数
3. 循环输入的整数，如果它的所有因子的数量为8，则计数器加1
4. 输出计数器的值

### 代码

1. 将输入转换为整数
2. 循环输入的整数，计算它的所有因子，并统计出现的次数
3. 循环输入的整数，如果它的所有因子的数量为8，则计数器加1
4. 输出计数器的值

### 总结

1. 将输入转换为整数
2. 循环输入的整数，计算它的所有因子，并统计出现的次数
3. 循环输入的整数，如果它的所有因子的数量为8，则计数器加1
4. 输出计数器的值

### 参考

1. 将输入转换为整数
2. 循环输入的整数，计算它的所有因子，并统计出现的次数
3. 循环输入的整数，如果它的所有因子的数量为8，则计数器加1
4. 输出计数器的值

### 附录

1. 将输入转换为整数
2. 循环输入的整数，计算它的所有因子，并统计出现的次数
3. 循环输入的整数，如果它的所有因子的数量为8，则计数器加1
4. 输出计数器的值
</s>
