<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.util.stream.*;
 
public class p03318 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        long num = 0, d = 1;
        for(int i = 0; i < K; i++)  {
            num += d;
            if(calc(num + 2 * d) < calc(num + d)) {
                d *= 10L;
            }
            System.out.println(num);
        }
    }
 
    public static double calc(long num) {
        double n = (double) num;
        double sum = 0;
        while(num != 0L) {
            sum += num % 10;
            num /= 10;
        }
        return n / sum;
    }
}
```

### 解题思路

1. 首先，我们需要将一个数字转换成一个字符串，然后再将字符串转换成一个整数。
2. 然后，我们需要将一个整数转换成一个字符串，然后再将字符串转换成一个整数。
3. 最后，我们需要将一个整数转换成一个字符串，然后再将字符串转换成一个整数。

### 代码实现

```python
import java.util
import java.util.stream

def main():
    K = int(input())
    num = 0
    d = 1
    for i in range(K):
        num += d
        if calc(num + 2 * d) < calc(num + d):
            d *= 10
        print(num)

def calc(num):
    n = num
    sum = 0
    while num != 0:
        sum += num % 10
        num /= 10
    return n / sum

main()
```

### 复杂度分析

- 时间复杂度：O(K)。
- 空间复杂度：O(1)。

### 相关题目

1. [翻转字符串](https://leetcode-cn.com/problems/reverse-string/)
2. [翻转字符串II](https://leetcode-cn.com/problems/reverse-string-ii/)
3. [翻转字符串III](https://leetcode-cn.com/problems/reverse-string-iii/)
4. [翻转字符串IV](https://leetcode-cn.com/problems/reverse-string-iv/)
5. [翻转字符串V](https://leetcode-cn.com/problems/reverse-string-v/)
6. [翻转字符串VI](https://leetcode-cn.com/problems/reverse-string-vi/)
7. [翻转字符串VII](https://leetcode-cn.com/problems/reverse-string-vii/)
8. [翻转字符串VIII](https://leetcode-cn.com/problems/reverse-string-viii/)
9. [翻转字符串IX](https://leetcode-cn.com/problems/reverse-string-ix/)
10. [翻转字符串X](https://leetcode-cn.com/problems/reverse-string-x/)
11. [翻转字符串XI](https://leetcode-cn.com/problems/reverse-string-xi/)
12. [翻转字符串XII](https://leetcode-cn.com/problems/reverse-string-xii/)
13. [翻转字符串XIII](https://leetcode-cn.com/problems/reverse-string-xiii/)
14. [翻转字符串XIV](https://leetcode-cn.com/problems/reverse-string-xiv/)
15. [翻转字符串XV](https://leetcode-cn.com/problems/reverse-string-xv/)
16. [翻转字符串XVI](https://leetcode-cn.com/problems/reverse-string-xvi/)
17. [翻转字符串XVII](https://leetcode-cn.com/problems/reverse-string-xvii/)
18. [翻转字符串XVIII](https://leetcode-cn.com/problems/reverse-string-xviii/)
19. [翻转字符串XIX](https://leetcode-cn.com/problems/reverse-string-xix/)
20. [翻转字符串XX](https://leetcode-cn.com/problems/reverse-string-xx/)
21. [翻转字符串XXI](https://leetcode-cn.com/problems/reverse-string-xxi/)
22. [翻转字符串XXII](https://leetcode-cn.com/problems/reverse-string-xxii/)
23. [翻转字符串XXIII](https://leetcode-cn.com/problems/reverse-string-xxiii/)
24. [翻转字符串XXIV](https://leetcode-cn.com/problems/reverse-string-xxiv/)
25. [翻转字符串XXV](https://leetcode-cn.com/problems/reverse-string-xxv/)
26. [翻转字符串XXVI](https://leetcode-cn.com/problems/reverse-string-xxvi/)
27. [翻转字符串XXVII](https://leetcode-cn.com/problems/reverse-string-xxvii/)
28. [翻转字符串XXVIII](https://leetcode-cn.com/problems/reverse-string-xxviii/)
29. [翻转字符串XXIX](https://leetcode-cn.com/problems/reverse-string-xxix/)
30. [翻转字符串XXX](https://leetcode-cn.com/problems/reverse-string-xxx/)
31. [翻转字符串XXXI](https://leetcode-cn.com/problems/reverse-string-xxxI/)
32. [翻转字符串XXXII](https://leetcode-cn.com/problems/reverse-string-xxxII/)
33. [翻转字符串XXXIII](https://leetcode-cn.com/problems/reverse-string-xxxIII/)
34. [翻转字符串XXXIV](https://leetcode-cn.com/problems/reverse-string-xxxIV/)
35. [翻转字符串XXXV](https://leetcode-cn.com/problems/reverse-string-xxxV/)
36. [翻转字符串XXXVI](https://leetcode-cn.com/problems/reverse-string-xxxVI/)
37. [翻转字符串XXXVII](https://leetcode-cn.com/problems/reverse-string-xxxVII/)
38. [翻转字符串XXXVIII](https://leetcode-cn.com/problems/reverse-string-xxxVIII/)
39. [翻转字符串XXXIX](https://leetcode-cn.com/problems/reverse-string-xxxIX/)
40. [翻转字符串XL](https://leetcode-cn.com/problems/reverse-string-xL/)
41. [翻转字符串XLI](https://leetcode-cn.com/problems/reverse-string-xLI/)
42. [翻转字符串XLII](https://leetcode-cn.com/problems/reverse-string-xLII/)
43. [�
