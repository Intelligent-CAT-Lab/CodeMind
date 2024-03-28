<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03129 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if((sc.nextInt() + 1) / 2 >= sc.nextInt()) System.out.println("YES");
        else System.out.println("NO");
    }

}



```

### 解答

```python
import sys

if (int(sys.stdin.readline()) + 1) // 1
    / 2 >= int(sys.stdin.readline()):
    print("YES")
else:
    print("NO")
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入，然后使用 `int()` 将其转换为整数。
2. 使用 `if` 语句判断条件，如果 `1 + 1` 除以 `2` 大于等于输入，则输出 `YES`，否则输出 `NO`。

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

1. [100. 整数反转](https://leetcode-cn.com/problems/reverse-integer/)
2. [101. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
3. [102. 整数最大值](https://leetcode-cn.com/problems/maximum-integer/)
4. [103. 整数最小值](https://leetcode-cn.com/problems/minimum-integer/)
5. [104. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
6. [105. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
7. [106. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
8. [107. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
9. [108. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
10. [109. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
11. [110. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
12. [111. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
13. [112. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
14. [113. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
15. [114. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
16. [115. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
17. [116. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
18. [117. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
19. [118. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
20. [119. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
21. [120. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
22. [121. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
23. [122. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
24. [123. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
25. [124. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
26. [125. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
27. [126. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
28. [127. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
29. [128. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
30. [129. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
31. [130. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
32. [131. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
33. [132. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
34. [133. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
35. [134. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
36. [135. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
37. [136. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer/)
38. [137. 整数中的零](https://leetcode-cn.com/problems/number-of-zeros-in-an-integer
