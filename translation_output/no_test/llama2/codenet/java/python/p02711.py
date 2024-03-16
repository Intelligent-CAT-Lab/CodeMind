<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p02711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String string = String.valueOf(n);
        System.out.println(string.contains("7") ? "Yes" : "No");
    }
}
```

### 解题思路

```python
import sys

n = int(sys.stdin.readline())
string = str(n)
print(string.find("7") != -1)
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [100. 整数反转](https://leetcode-cn.com/problems/int-reverse/)
- [101. 整数拆分](https://leetcode-cn.com/problems/integer-to-roman/)
- [102. 罗马数字转整数](https://leetcode-cn.com/problems/roman-to-integer/)
- [103. 罗马数字](https://leetcode-cn.com/problems/roman-to-integer/)
- [104. 罗马数字转整数 II](https://leetcode-cn.com/problems/roman-to-integer/)
- [105. 罗马数字转整数 III](https://leetcode-cn.com/problems/roman-to-integer/)
- [106. 罗马数字转整数 IV](https://leetcode-cn.com/problems/roman-to-integer/)
- [107. 罗马数字转整数 V](https://leetcode-cn.com/problems/roman-to-integer/)
- [108. 罗马数字转整数 VI](https://leetcode-cn.com/problems/roman-to-integer/)
- [109. 罗马数字转整数 VII](https://leetcode-cn.com/problems/roman-to-integer/)
- [110. 罗马数字转整数 VIII](https://leetcode-cn.com/problems/roman-to-integer/)
- [111. 罗马数字转整数 IX](https://leetcode-cn.com/problems/roman-to-integer/)
- [112. 罗马数字转整数 X](https://leetcode-cn.com/problems/roman-to-integer/)
- [113. 罗马数字转整数 XI](https://leetcode-cn.com/problems/roman-to-integer/)
- [114. 罗马数字转整数 XII](https://leetcode-cn.com/problems/roman-to-integer/)
- [115. 罗马数字转整数 XIII](https://leetcode-cn.com/problems/roman-to-integer/)
- [116. 罗马数字转整数 XIV](https://leetcode-cn.com/problems/roman-to-integer/)
- [117. 罗马数字转整数 XV](https://leetcode-cn.com/problems/roman-to-integer/)
- [118. 罗马数字转整数 XVI](https://leetcode-cn.com/problems/roman-to-integer/)
- [119. 罗马数字转整数 XVII](https://leetcode-cn.com/problems/roman-to-integer/)
- [120. 罗马数字转整数 XVIII](https://leetcode-cn.com/problems/roman-to-integer/)
- [121. 罗马数字转整数 XIX](https://leetcode-cn.com/problems/roman-to-integer/)
- [122. 罗马数字转整数 XX](https://leetcode-cn.com/problems/roman-to-integer/)
- [123. 罗马数字转整数 XXI](https://leetcode-cn.com/problems/roman-to-integer/)
- [124. 罗马数字转整数 XXII](https://leetcode-cn.com/problems/roman-to-integer/)
- [125. 罗马数字转整数 XXIII](https://leetcode-cn.com/problems/roman-to-integer/)
- [126. 罗马数字转整数 XXIV](https://leetcode-cn.com/problems/roman-to-integer/)
- [127. 罗马数字转整数 XXV](https://leetcode-cn.com/problems/roman-to-integer/)
- [128. 罗马数字转整数 XXVI](https://leetcode-cn.com/problems/roman-to-integer/)
- [129. 罗马数字转整数 XXVII](https://leetcode-cn.com/problems/roman-to-integer/)
- [130. 罗马数字转整数 XXVIII](https://leetcode-cn.com/problems/roman-to-integer/)
- [131. 罗马数字转整数 XXIX](https://leetcode-cn.com/problems/roman-to-integer/)
- [132. 罗马数字转整数 XXX](https://leetcode-cn.com/problems/roman-to-integer/)
- [133. 罗马数字转整数 XXXI](https://leetcode-cn.com/problems/roman-to-integer/)
- [134. 罗马数字转整数 XXXII](https://leetcode-cn.com/problems/roman-to-integer/)
- [135. 罗马数字转整数 XXXIII](https://leetcode-cn.com/problems/roman-to-integer/)
- [136. 罗马数字转整数 XXXIV](https://leetcode-cn.com/problems/roman-to-integer/)
- [137. 罗马数字转整数 XXXV](https://leetcode-cn.com/problems/roman-to-integer/)
- [138. 罗马数字转整数 XXXVI](https://leetcode-cn.com/problems/roman-to-integer/)
- [139. 罗马数字转整数 XXXVII](https://leetcode-cn.com/problems/roman-to-integer/)
- [140. 罗马数字转整数 XXXVIII](https://leetcode-cn.com/problems/roman-to-integer/)
- [141. 罗马数字转整数 XXXIX](https://leetcode-cn.com/problems/roman-to-integer/)
- [142. 罗马数字转整数 XL](https://leetcode-cn.com/problems/roman-to-integer/)
- [143. 罗马数字转整数 XLI](https://leetcode-cn.com/problems/roman-to-integer/)
- [144. 罗马数字转��
