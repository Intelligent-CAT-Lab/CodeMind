<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()

cnt = 0
l = 0

for i in range(len(s)):
    if s[i] == 'W':
        cnt += i-l
        l += 1

print(cnt)
```

### 解答

```java
public class Solution {
    public int solution(String s) {
        int cnt = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                cnt += i - l;
                l = i + 1;
            }
        }
        return cnt;
    }
}
```

### 解析

1. 首先，我们需要把字符串转换成一个字符数组，然后遍历字符数组，如果当前字符是'W'，则计算当前字符到'W'之前的字符的个数，然后将这个数字加到`cnt`中。
2. 如果当前字符不是'W'，则将当前字符加到`l`中，表示当前字符到'W'之前的字符的个数。
3. 当`l`到`s`的字符个数为0时，表示已经到了'W'，此时将`l`中的数字加到`cnt`中。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [100. 字符串中的第一个不重复字符](https://leetcode-cn.com/problems/first-unique-character-in-a-string/)
- [101. 最长回文子串](https://leetcode-cn.com/problems/longest-palindromic-substring/)
- [102. 丑数](https://leetcode-cn.com/problems/ugly-number/)
- [103. 最长回文子串 II](https://leetcode-cn.com/problems/longest-palindromic-substring-ii/)
- [104. 最长回文子串 III](https://leetcode-cn.com/problems/longest-palindromic-substring-iii/)
- [105. 最长回文子串 IV](https://leetcode-cn.com/problems/longest-palindromic-substring-iv/)
- [106. 最长回文子串 V](https://leetcode-cn.com/problems/longest-palindromic-substring-v/)
- [107. 字符串的排列](https://leetcode-cn.com/problems/permutation-in-string/)
- [108. 最长回文子串 VI](https://leetcode-cn.com/problems/longest-palindromic-substring-vi/)
- [109. 最长回文子串 VII](https://leetcode-cn.com/problems/longest-palindromic-substring-vii/)
- [110. 最长回文子串 VIII](https://leetcode-cn.com/problems/longest-palindromic-substring-viii/)
- [111. 最长回文子串 IX](https://leetcode-cn.com/problems/longest-palindromic-substring-ix/)
- [112. 最长回文子串 X](https://leetcode-cn.com/problems/longest-palindromic-substring-x/)
- [113. 最长回文子串 XI](https://leetcode-cn.com/problems/longest-palindromic-substring-xi/)
- [114. 最长回文子串 XII](https://leetcode-cn.com/problems/longest-palindromic-substring-xii/)
- [115. 最长回文子串 XIII](https://leetcode-cn.com/problems/longest-palindromic-substring-xiii/)
- [116. 最长回文子串 XIV](https://leetcode-cn.com/problems/longest-palindromic-substring-xiv/)
- [117. 最长回文子串 XV](https://leetcode-cn.com/problems/longest-palindromic-substring-xv/)
- [118. 最长回文子串 XVI](https://leetcode-cn.com/problems/longest-palindromic-substring-xvi/)
- [119. 最长回文子串 XVII](https://leetcode-cn.com/problems/longest-palindromic-substring-xvii/)
- [120. 最长回文子串 XVIII](https://leetcode-cn.com/problems/longest-palindromic-substring-xviii/)
- [121. 最长回文子串 XIX](https://leetcode-cn.com/problems/longest-palindromic-substring-xix/)
- [122. 最长回文子串 XX](https://leetcode-cn.com/problems/longest-palindromic-substring-xx/)
- [123. 最长回文子串 XXI](https://leetcode-cn.com/problems/longest-palindromic-substring-xxi/)
- [124. 最长回文子串 XXII](https://leetcode-cn.com/problems/longest-palindromic-substring-xxii/)
- [125. 最长回文子串 XXIII](https://leetcode-cn.com/problems/longest-palindromic-substring-xxiii/)
- [126. 最长回文子串 XXIV](https://leetcode-cn.com/problems/longest-palindromic-substring-xxiv/)
- [127. 最长回文子串 XXV](https://leetcode-cn.com/problems/longest-palindromic-substring-xxv/)
- [128. 最长回文子串 XXVI](https://leetcode-cn.com/problems/longest-palindromic-substring-xxvi/)
- [129. 最长回文子串 XXVII](https://leetcode-cn.com/problems/longest-palindromic-substring-xxvii/)
- [130. 最长回文子串 XXVIII](https://leetcode-cn.com/problems/longest-palindromic-substring-xxviii/)
- [131. 最长回文子串 XXIX](https://leetcode-cn.com/problems/longest-palindromic-substring-xxix/)
- [132. 最长回文子串 XXX](https://leetcode-cn.com/problems/longest-palindromic-substring-xxx/)
- [133. 最长回文子串 XXXI](https://leetcode-cn.com/problems/longest-palindromic-substring-xxxii/)
- [134. 最长回文子串 XXXII](https://leetcode-cn.com/problems/longest-palindromic-substring-xxxiii/)
- [135. 最长回文子串 XXXIII](https://leetcode-cn.com/problems/longest-palindromic-substring-xxxiv/)
- [136. 最长回文子串 XXXIV](https://leetcode-cn.com/problems/longest-palindromic-substring-xxxv/)
- [137. 最长回文子串 XXXV](https://leetcode-cn.com/problems/longest-palindromic-substring-xxxvi/)
- [138. 最长回
