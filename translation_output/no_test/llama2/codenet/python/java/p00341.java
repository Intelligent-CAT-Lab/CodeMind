<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a=[0]*100
b=list(map(int,input().split()))
for i in range(12):
    a[b[i]-1]+=1
c=0
for i in range(100):
    if a[i] and a[i]%4==0: c+=a[i]//4
print('yes' if c==3 else 'no')
```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = 0;
        }
        String[] b = sc.nextLine().split(" ");
        for (int i = 0; i < 12; i++) {
            a[Integer.parseInt(b[i]) - 1]++;
        }
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] != 0 && a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }
        System.out.println("yes" + (c == 3 ? "" : " no"));
    }
}
```

### 解析

```
a=[0]*100
```

创建一个长度为100的数组，每个元素都为0。

```
b=list(map(int,input().split()))
```

将输入的字符串转换为一个列表，然后将每个元素转换为整数。

```
for i in range(12):
    a[b[i]-1]+=1
```

将输入的整数添加到对应的位置上。

```
c=0
for i in range(100):
    if a[i] and a[i]%4==0: c+=a[i]//4
```

计算每个元素的和，如果和是4的倍数，则将其添加到c中。

```
print('yes' if c==3 else 'no')
```

如果c等于3，则打印yes，否则打印no。

### 复杂度分析

- 时间复杂度：O(N)。
- 空间复杂度：O(1)。

### 相关题目

- [Python3 题目 1000](https://leetcode-cn.com/problems/python3-problem-1000/)
</s>
