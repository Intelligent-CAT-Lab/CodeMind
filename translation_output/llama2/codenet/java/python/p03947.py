<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03947 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        char[] input_char = input.toCharArray();
        
        char current_char = input_char[0];
        int count = 0;
        for (int i=1;i<input_char.length;i++) {
            if (input_char[i]!=current_char) {
                count++;
                current_char = input_char[i];
            }
        }
        
        System.out.println(count);
    }
}

```

### 解答

```python
import sys

input = sys.stdin.readline()

input_char = input.strip().split()

current_char = input_char[0]
count = 0
for i in range(1, len(input_char)):
    if input_char[i] != current_char:
        count += 1
        current_char = input_char[i]

print(count)
```

### 解析

1. 将输入转换为字符串
2. 将字符串转换为字符数组
3. 初始化变量
4. 循环输入
5. 计算字符数

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [p03946](https://leetcode-cn.com/problems/p03946/)
</s>
