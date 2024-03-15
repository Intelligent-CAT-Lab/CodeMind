<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int uppercase = 0;
        int lowercase = 0;
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercase++;
            } else {
                lowercase++;
            }
        }
        
        if (uppercase > lowercase) {
            System.out.println(word.toUpperCase());
        } else if (lowercase > uppercase) {
            System.out.println(word.toLowerCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}
```

### 解答

```python
import sys

word = sys.stdin.readline().strip()
uppercase = 0
lowercase = 0

for ch in word:
    if ch.isupper():
        uppercase += 1
    else:
        lowercase += 1

if uppercase > lowercase:
    print(word.upper())
elif lowercase > uppercase:
    print(word.lower())
else:
    print(word.lower())
```

### 解析

1. 读取一行，然后将其转换为字符串
2. 遍历字符串，统计大写字母和小写字母的个数
3. 根据大小比较，将字符串转换为大写或小写

### 复杂度分析

- 时间复杂度：O(n)。遍历字符串，统计大小写字母的个数。
- 空间复杂度：O(1)。

### 相关题目

- [codeforces_59_B](codeforces_59_B.md)
</s>
