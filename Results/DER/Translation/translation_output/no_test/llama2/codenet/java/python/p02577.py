<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long c=0;
        for(int i=0;i<s.length();i++){
            c+=(s.charAt(i)-'0');
        }
        if(c%9 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

```

### 解答

```python
import sys

s = sys.stdin.readline()

c = 0
for i in range(len(s)):
    c += ord(s[i]) - ord('0')

if c % 9 == 0:
    print("Yes")
else:
    print("No")
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入
2. 使用 `ord()` 函数将字符转换为整数
3. 使用 `c +=` 语法进行累加
4. 使用 `if` 语句判断是否为 9 的倍数

### 复杂度分析

- 时间复杂度：O(n)
- 空间复杂度：O(1)

### 相关题目

- [p02576](https://leetcode-cn.com/problems/palindrome-number-checker/)
</s>
