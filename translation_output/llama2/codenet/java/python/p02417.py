<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
 
public class p02417 {
      
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
         
        int res[]=new int[26];
         
        while(cin.hasNext()) {
            String str=cin.nextLine();
            for(int i=0;i<str.length();i++) {
                char c=str.charAt(i);
                if(c>=65 && c<=90)res[c-65]++;
                else if(c>=97 && c<=122)res[c-97]++;
            }
        }
         
        for(int i=0;i<26;i++) {
            System.out.println((char)(i+97)+" : "+res[i]);
        }
         
    }
     
}

```

### 解题思路

1. 首先，我们需要将字符串转换为数组，然后将数组中的字符转换为数字，然后统计出现的次数。
2. 然后，我们需要将数组中的数字转换为字符，然后将字符转换为字符串，然后输出。

### 代码实现

```python
import java.util

class p02417:
    def __init__(self):
        pass

    def main(self):
        scanner = java.util.Scanner(System.in)
        res = []
        while scanner.hasNext():
            str = scanner.nextLine()
            for i in range(len(str)):
                c = str[i]
                if c >= 65 and c <= 90:
                    res.append(c - 65)
                elif c >= 97 and c <= 122:
                    res.append(c - 97)
        for i in range(26):
            print(chr(i + 97) + " : " + res[i])

p02417().main()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

1. [100. 字符串中的数字](https://leetcode-cn.com/problems/number-in-string/)
2. [101. 字符串中的第一个出现的数字](https://leetcode-cn.com/problems/first-occurrence-of-a-number-in-a-string/)
3. [102. 字符串中的第一个非数字](https://leetcode-cn.com/problems/first-non-repeating-character/)
4. [103. 字符串中的第一个唯一字符](https://leetcode-cn.com/problems/first-unique-character-in-a-string/)
5. [104. 字符串中的第一个不重复的字符](https://leetcode-cn.com/problems/first-non-repeating-character/)
6. [105. 字符串中的第一个 1](https://leetcode-cn.com/problems/first-1-in-a-string/)
7. [106. 字符串中的第一个 0](https://leetcode-cn.com/problems/first-0-in-a-string/)
8. [107. 字符串中的第一个 00](https://leetcode-cn.com/problems/first-00-in-a-string/)
9. [108. 字符串中的第一个 000](https://leetcode-cn.com/problems/first-000-in-a-string/)
10. [109. 字符串中的第一个 0000](https://leetcode-cn.com/problems/first-0000-in-a-string/)
11. [110. 字符串中的第一个 00000](https://leetcode-cn.com/problems/first-00000-in-a-string/)
12. [111. 字符串中的第一个 000000](https://leetcode-cn.com/problems/first-000000-in-a-string/)
13. [112. 字符串中的第一个 0000000](https://leetcode-cn.com/problems/first-0000000-in-a-string/)
14. [113. 字符串中的第一个 00000000](https://leetcode-cn.com/problems/first-00000000-in-a-string/)
15. [114. 字符串中的第一个 000000000](https://leetcode-cn.com/problems/first-000000000-in-a-string/)
16. [115. 字符串中的第一个 0000000000](https://leetcode-cn.com/problems/first-0000000000-in-a-string/)
17. [116. 字符串中的第一个 00000000000](https://leetcode-cn.com/problems/first-00000000000-in-a-string/)
18. [117. 字符串中的第一个 000000000000](https://leetcode-cn.com/problems/first-000000000000-in-a-string/)
19. [118. 字符串中的第一个 0000000000000](https://leetcode-cn.com/problems/first-0000000000000-in-a-string/)
20. [119. 字符串中的第一个 00000000000000](https://leetcode-cn.com/problems/first-00000000000000-in-a-string/)
21. [120. 字符串中的第一个 000000000000000](https://leetcode-cn.com/problems/first-000000000000000-in-a-string/)
22. [121. 字符串中的第一个 0000000000000000](https://leetcode-cn.com/problems/first-0000000000000000-in-a-string/)
23. [122. 字符串中的第一个 00000000000000000](https://leetcode-cn.com/problems/first-00000000000000000-in-a-string/)
24. [123. 字符串中的第一个 000000000000000000](https://leetcode-cn.com/problems/first-000000000000000000-in-a-string/)
25. [124. 字符串中的第一个 0000000000000000000](https://leetcode-cn.com/problems/first-0000000000000000000-in-a-string/)

