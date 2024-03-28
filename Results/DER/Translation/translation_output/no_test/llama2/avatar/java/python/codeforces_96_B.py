<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class codeforces_96_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        long ans = -1, value = 0;
        int mask = 2;
        
        while (value < number) {
            String s = Integer.toBinaryString(mask++).substring(1);
            int zeros = 0;
            
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeros++;
                }
            }
            
            if (zeros != s.length() - zeros) {
                continue;
            }
            
            s = s.replace('0', '4');
            s = s.replace('1', '7');
            value = Long.parseLong(s);
        }
        
        System.out.println(value);
    }
}
```

### 解答

```python
import sys

def main():
    number = int(sys.stdin.readline())
    ans = -1
    mask = 2
    while True:
        s = bin(mask).replace('0b', '')
        zeros = 0
        for c in s:
            if c == '0':
                zeros += 1
        if len(s) - zeros != 1:
            continue
        s = s.replace('0', '4').replace('1', '7')
        ans = int(s)
        break
    print(ans)

if __name__ == '__main__':
    main()
```

### 解释

1. 使用 `bin` 函数将 `mask` 转换为二进制字符串，然后使用 `replace` 函数将 `0b` 替换为空字符串。
2. 使用 `for` 循环遍历字符串，将 `0` 替换为 `4`，将 `1` 替换为 `7`。
3. 使用 `int` 函数将字符串转换为整数，然后使用 `break` 终止循环。
4. 使用 `print` 函数输出整数。

### 复杂度分析

- 时间复杂度：`O(log(n))`。
- 空间复杂度：`O(1)`。

### 相关题目

- [codeforces_96_A](./codeforces_96_A.md)
</s>
