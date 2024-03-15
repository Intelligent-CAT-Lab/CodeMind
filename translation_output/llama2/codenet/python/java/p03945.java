<s> Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8
print((lambda x:x.count('WB')+x.count('BW'))(input()))
```

### 解答

```java
public class Solution {
    public String translate(String s) {
        return (s.replace("WB", "BW").replace("BW", "WB")).length() + "BW";
    }
}
```

### 解析

1. 使用lambda表达式，将字符串中的WB和BW统计出来
2. 使用replace替换WB和BW
3. 使用length()统计字符串的长度
4. 使用+符号进行加法运算
5. 使用BW作为结果

### 复杂度分析

* 时间复杂度：O(n)
* 空间复杂度：O(1)

### 相关题目

1. [104. 字符串的排列](https://leetcode-cn.com/problems/permutation-in-string/)
2. [105. 字符串的排列 II](https://leetcode-cn.com/problems/permutation-in-string-ii/)
3. [106. 字符串的排列 III](https://leetcode-cn.com/problems/permutation-in-string-iii/)
4. [107. 字符串的排列 IV](https://leetcode-cn.com/problems/permutation-in-string-iv/)
5. [108. 字符串的排列 V](https://leetcode-cn.com/problems/permutation-in-string-v/)
6. [109. 字符串的排列 VI](https://leetcode-cn.com/problems/permutation-in-string-vi/)
7. [110. 字符串的排列 VII](https://leetcode-cn.com/problems/permutation-in-string-vii/)
8. [111. 字符串的排列 VIII](https://leetcode-cn.com/problems/permutation-in-string-viii/)
9. [112. 字符串的排列 IX](https://leetcode-cn.com/problems/permutation-in-string-ix/)
10. [113. 字符串的排列 X](https://leetcode-cn.com/problems/permutation-in-string-x/)
11. [114. 字符串的排列 XI](https://leetcode-cn.com/problems/permutation-in-string-xi/)
12. [115. 字符串的排列 XII](https://leetcode-cn.com/problems/permutation-in-string-xii/)
13. [116. 字符串的排列 XIII](https://leetcode-cn.com/problems/permutation-in-string-xiii/)
14. [117. 字符串的排列 XIV](https://leetcode-cn.com/problems/permutation-in-string-xiv/)
15. [118. 字符串的排列 XV](https://leetcode-cn.com/problems/permutation-in-string-xv/)
16. [119. 字符串的排列 XVI](https://leetcode-cn.com/problems/permutation-in-string-xvi/)
17. [120. 字符串的排列 XVII](https://leetcode-cn.com/problems/permutation-in-string-xvii/)
18. [121. 字符串的排列 XVIII](https://leetcode-cn.com/problems/permutation-in-string-xviii/)
19. [122. 字符串的排列 XIX](https://leetcode-cn.com/problems/permutation-in-string-xix/)
20. [123. 字符串的排列 XX](https://leetcode-cn.com/problems/permutation-in-string-xx/)
21. [124. 字符串的排列 XXI](https://leetcode-cn.com/problems/permutation-in-string-xxi/)
22. [125. 字符串的排列 XXII](https://leetcode-cn.com/problems/permutation-in-string-xxii/)
23. [126. 字符串的排列 XXIII](https://leetcode-cn.com/problems/permutation-in-string-xxiii/)
24. [127. 字符串的排列 XXIV](https://leetcode-cn.com/problems/permutation-in-string-xxiv/)
25. [128. 字符串的排列 XXV](https://leetcode-cn.com/problems/permutation-in-string-xxv/)
26. [129. 字符串的排列 XXVI](https://leetcode-cn.com/problems/permutation-in-string-xxvi/)
27. [130. 字符串的排列 XXVII](https://leetcode-cn.com/problems/permutation-in-string-xxvii/)
28. [131. 字符串的排列 XXVIII](https://leetcode-cn.com/problems/permutation-in-string-xxviii/)
29. [132. 字符串的排列 XXIX](https://leetcode-cn.com/problems/permutation-in-string-xxix/)
30. [133. 字符串的排列 XXX](https://leetcode-cn.com/problems/permutation-in-string-xxx/)
31. [134. 字符串的排列 XXXI](https://leetcode-cn.com/problems/permutation-in-string-xxxI/)
32. [135. 字符串的排列 XXXII](https://leetcode-cn.com/problems/permutation-in-string-xxxII/)
33. [136. 字符串的排列 XXXIII](https://leetcode-cn.com/problems/permutation-in-string-xxxIII/)
34. [137. 字符串的排列 XXXIV](https://leetcode-cn.com/problems/permutation-in-string-xxxIV/)
35. [138. 字符串的排列 XXXV](https://leetcode-cn.com/problems/permutation-in-string-xxxV/)
36. [139. 字符串的排列 XXXVI](https://leetcode-cn.com/problems/permutation-in-string-xxxVI/)
37. [140. 字符串的排列 XXXVII](https://leetcode-cn.com/problems/permutation-in-string-xxxVII/)
38. [141. 字符串的排列 XXXVIII](https://leetcode-cn.com/problems/permutation-in-string-xxxVIII/)
39. [142. 字符串的排列 XXXIX](https://leetcode-cn.com/problems/permutation-in-string-xxxIX/)
40. [143. 字符串的排列 XL](https://leetcode-cn.com/problems/permutation-in-string-XL/)
41. [144. 字符
