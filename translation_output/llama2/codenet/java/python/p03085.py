<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03085 {
  public static void main(String args[]) {
    final Scanner scanner = new Scanner(System.in);
    final String helix = scanner.next();
    scanner.close();
    switch(helix) {
      case "A":
        System.out.println("T");
        break;
      case "T":
        System.out.println("A");
        break;
      case "C":
        System.out.println("G");
        break;
      case "G":
        System.out.println("C");
        break;
    }
  }
}
```

### 解答

```python
import sys

helix = input()

if helix == "A":
    print("T")
elif helix == "T":
    print("A")
elif helix == "C":
    print("G")
elif helix == "G":
    print("C")
else:
    print("Invalid")
```

### 解析

1. 使用 `input()` 获取用户输入
2. 使用 `if` 语句判断用户输入
3. 使用 `elif` 语句判断用户输入
4. 使用 `else` 语句判断用户输入

### 复杂度

1. 时间复杂度：O(1)
2. 空间复杂度：O(1)

### 相关题目

1. [翻转字符串](https://leetcode-cn.com/problems/reverse-string/)
2. [翻转字符串 II](https://leetcode-cn.com/problems/reverse-string-ii/)
3. [翻转字符串 III](https://leetcode-cn.com/problems/reverse-string-iii/)
4. [翻转字符串 IV](https://leetcode-cn.com/problems/reverse-string-iv/)
5. [翻转字符串 V](https://leetcode-cn.com/problems/reverse-string-v/)
6. [翻转字符串 VI](https://leetcode-cn.com/problems/reverse-string-vi/)
7. [翻转字符串 VII](https://leetcode-cn.com/problems/reverse-string-vii/)
8. [翻转字符串 VIII](https://leetcode-cn.com/problems/reverse-string-viii/)
9. [翻转字符串 IX](https://leetcode-cn.com/problems/reverse-string-ix/)
10. [翻转字符串 X](https://leetcode-cn.com/problems/reverse-string-x/)
11. [翻转字符串 XI](https://leetcode-cn.com/problems/reverse-string-xi/)
12. [翻转字符串 XII](https://leetcode-cn.com/problems/reverse-string-xii/)
13. [翻转字符串 XIII](https://leetcode-cn.com/problems/reverse-string-xiii/)
14. [翻转字符串 XIV](https://leetcode-cn.com/problems/reverse-string-xiv/)
15. [翻转字符串 XV](https://leetcode-cn.com/problems/reverse-string-xv/)
16. [翻转字符串 XVI](https://leetcode-cn.com/problems/reverse-string-xvi/)
17. [翻转字符串 XVII](https://leetcode-cn.com/problems/reverse-string-xvii/)
18. [翻转字符串 XVIII](https://leetcode-cn.com/problems/reverse-string-xviii/)
19. [翻转字符串 XIX](https://leetcode-cn.com/problems/reverse-string-xix/)
20. [翻转字符串 XX](https://leetcode-cn.com/problems/reverse-string-xx/)
21. [翻转字符串 XXI](https://leetcode-cn.com/problems/reverse-string-xxi/)
22. [翻转字符串 XXII](https://leetcode-cn.com/problems/reverse-string-xxii/)
23. [翻转字符串 XXIII](https://leetcode-cn.com/problems/reverse-string-xxiii/)
24. [翻转字符串 XXIV](https://leetcode-cn.com/problems/reverse-string-xxiv/)
25. [翻转字符串 XXV](https://leetcode-cn.com/problems/reverse-string-xxv/)
26. [翻转字符串 XXVI](https://leetcode-cn.com/problems/reverse-string-xxvi/)
27. [翻转字符串 XXVII](https://leetcode-cn.com/problems/reverse-string-xxvii/)
28. [翻转字符串 XXVIII](https://leetcode-cn.com/problems/reverse-string-xxviii/)
29. [翻转字符串 XXIX](https://leetcode-cn.com/problems/reverse-string-xxix/)
30. [翻转字符串 XXX](https://leetcode-cn.com/problems/reverse-string-xxx/)
31. [翻转字符串 XXXI](https://leetcode-cn.com/problems/reverse-string-xxxI/)
32. [翻转字符串 XXXII](https://leetcode-cn.com/problems/reverse-string-xxxII/)
33. [翻转字符串 XXXIII](https://leetcode-cn.com/problems/reverse-string-xxxIII/)
34. [翻转字符串 XXXIV](https://leetcode-cn.com/problems/reverse-string-xxxIV/)
35. [翻转字符串 XXXV](https://leetcode-cn.com/problems/reverse-string-xxxV/)
36. [翻转字符串 XXXVI](https://leetcode-cn.com/problems/reverse-string-xxxVI/)
37. [翻转字符串 XXXVII](https://leetcode-cn.com/problems/reverse-string-xxxVII/)
38. [翻转字符串 XXXVIII](https://leetcode-cn.com/problems/reverse-string-xxxVIII/)
39. [翻转字符串 XXXIX](https://leetcode-cn.com/problems/reverse-string-xxxIX/)
40. [翻转字符串 XL](https://leetcode-cn.com/problems/reverse-string-XL/)
41. [翻转字符串 XLI](https://leetcode-cn.com/problems/reverse-string-XLI/)
42. [翻转字符串 XLII](https://leetcode-cn.com/problems/reverse-string-XLII/)
43. [翻转字符串 XLIII](https://leetcode-cn.com/problems/reverse-string-XLIII/)
44. [翻转字符串 XLIV](https://leetcode-cn.com/problems/reverse-string-XLIV/)
45. [翻转字符串 XLV](https://leetcode-cn.com/problems/reverse-string-XLV/)
46. [翻转字符串 XLVI](https://leetcode-cn.com/problems/reverse-string-XLVI/)
47. [翻转字符串 XLVII](https://leetcode-cn.com/problems/reverse-string-XLVII/)
48. [翻转字符串
