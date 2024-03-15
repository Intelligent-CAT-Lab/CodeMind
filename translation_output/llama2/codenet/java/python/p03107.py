<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        char S0 = '0';
        int S0mas = 0;
        for(char str : S.toCharArray()){
            if(str == S0){
                ++S0mas;
            }
        }
        int S1mas = S.length() - S0mas;
        if(S0mas < S1mas){
            System.out.println(S0mas * 2);
        }else{
            System.out.println(S1mas * 2);
        }
    }
}
```

### 解题思路

1. 首先，我们需要将字符串转换成字符数组，然后遍历字符数组，如果当前字符是0，则将其数量加1，如果不是0，则将其数量加1，然后将其数量加上之前的数量，如果之前的数量为0，则直接加上之前的数量。
2. 然后，我们需要判断两个数的大小，如果0的数量大于1的数量，则输出0的数量*2，如果1的数量大于0的数量，则输出1的数量*2。

### 代码实现

```python
import java.util

class p03107:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        S = sc.next()
        sc.close()
        S0 = '0'
        S0mas = 0
        for char in S.toCharArray():
            if char == S0:
                S0mas += 1
        S1mas = len(S) - S0mas
        if S0mas < S1mas:
            print(S0mas * 2)
        else:
            print(S1mas * 2)
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

1. [翻转字符串](https://leetcode-cn.com/problems/reverse-string/)
2. [字符串的排列](https://leetcode-cn.com/problems/permutation-in-string/)
3. [字符串的排列 II](https://leetcode-cn.com/problems/permutation-in-string-ii/)
4. [字符串的排列 III](https://leetcode-cn.com/problems/permutation-in-string-iii/)
5. [字符串的排列 IV](https://leetcode-cn.com/problems/permutation-in-string-iv/)
6. [字符串的排列 V](https://leetcode-cn.com/problems/permutation-in-string-v/)
7. [字符串的排列 VI](https://leetcode-cn.com/problems/permutation-in-string-vi/)
8. [字符串的排列 VII](https://leetcode-cn.com/problems/permutation-in-string-vii/)
9. [字符串的排列 VIII](https://leetcode-cn.com/problems/permutation-in-string-viii/)
10. [字符串的排列 IX](https://leetcode-cn.com/problems/permutation-in-string-ix/)
11. [字符串的排列 X](https://leetcode-cn.com/problems/permutation-in-string-x/)
12. [字符串的排列 XI](https://leetcode-cn.com/problems/permutation-in-string-xi/)
13. [字符串的排列 XII](https://leetcode-cn.com/problems/permutation-in-string-xii/)
14. [字符串的排列 XIII](https://leetcode-cn.com/problems/permutation-in-string-xiii/)
15. [字符串的排列 XIV](https://leetcode-cn.com/problems/permutation-in-string-xiv/)
16. [字符串的排列 XV](https://leetcode-cn.com/problems/permutation-in-string-xv/)
17. [字符串的排列 XVI](https://leetcode-cn.com/problems/permutation-in-string-xvi/)
18. [字符串的排列 XVII](https://leetcode-cn.com/problems/permutation-in-string-xvii/)
19. [字符串的排列 XVIII](https://leetcode-cn.com/problems/permutation-in-string-xviii/)
20. [字符串的排列 XIX](https://leetcode-cn.com/problems/permutation-in-string-xix/)
21. [字符串的排列 XX](https://leetcode-cn.com/problems/permutation-in-string-xx/)
22. [字符串的排列 XXI](https://leetcode-cn.com/problems/permutation-in-string-xxi/)
23. [字符串的排列 XXII](https://leetcode-cn.com/problems/permutation-in-string-xxii/)
24. [字符串的排列 XXIII](https://leetcode-cn.com/problems/permutation-in-string-xxiii/)
25. [字符串的排列 XXIV](https://leetcode-cn.com/problems/permutation-in-string-xxiv/)
26. [字符串的排列 XXV](https://leetcode-cn.com/problems/permutation-in-string-xxv/)
27. [字符串的排列 XXVI](https://leetcode-cn.com/problems/permutation-in-string-xxvi/)
28. [字符串的排列 XXVII](https://leetcode-cn.com/problems/permutation-in-string-xxvii/)
29. [字符串的排列 XXVIII](https://leetcode-cn.com/problems/permutation-in-string-xxviii/)
30. [字符串的排列 XXIX](https://leetcode-cn.com/problems/permutation-in-string-xxix/)
31. [字符串的排列 XXX](https://leetcode-cn.com/problems/permutation-in-string-xxx/)
32. [字符串的排列 XXXI](https://leetcode-cn.com/problems/permutation-in-string-xxxI/)
33. [字符串的排列 XXXII](https://leetcode-cn.com/problems/permutation-in-string-xxxII/)
34. [字符串的排列 XXXIII](https://leetcode-cn.com/problems/permutation-in-string-xxxIII/)
35. [字符串的排列 XXXIV](https://leetcode-cn.com/problems/permutation-in-string-xxxIV/)
36. [字符串的排列 XXXV](https://leetcode-cn.com/problems/permutation-in-string-xxxV/)
37. [字符串的排列 XXXVI](https://leetcode-cn.com/problems/permutation-in-string-xxxVI/)
38. [字符串的排列 XXXV
