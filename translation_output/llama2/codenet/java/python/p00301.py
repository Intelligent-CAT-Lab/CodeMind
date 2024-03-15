<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
// 0306
class p00301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[15],i=0;
        while(n>0) {
            a[i++]=(n+1)%3-1;
            n=(n-a[i-1])/3;
        }
        while(i-->0)
            System.out.print((a[i]==0?"0":a[i]>0?"+":"-")+(i==0?"\n":""));
    }
}

```

### 解答

```python
import sys

n = int(sys.stdin.readline())
a = [0] * 15
i = 0
while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i]) // 3
    i += 1

while i > 0:
    print(f"{a[i] == 0 ? '0' : a[i] > 0 ? '+' : '-'}{i == 0 ? '\n' : ''}")
    i -= 1
```

### 解析

1. 读入一个整数，表示输入的数量
2. 初始化一个数组，用于存储输入的数据
3. 循环输入的数量，每次输入一个整数，计算该整数的模3的值，然后将该值存储到数组中
4. 循环输入的数量，每次输出一个整数，根据该整数的值，判断该整数是否为0，如果为0，则输出0，如果不为0，则根据该整数的值，判断该整数是否为正数，如果为正数，则输出+，如果不为正数，则输出-
5. 循环输入的数量，每次减1，直到循环条件不满足

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [Java 0306](https://leetcode-cn.com/problems/java-0306/)
</s>
