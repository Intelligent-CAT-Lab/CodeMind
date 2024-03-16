<s> Translate the following python code to java and enclose your solution inside ```java```:
```
X=input()
ans=0
memo=0
for i in range(len(X)):
    if X[i]=="T":
        if memo==0:pass
        else:memo-=1
    else:memo+=1
print(memo*2)
```

### 解答

```java
public class Solution {
    public int solution(String X) {
        int ans = 0;
        int memo = 0;
        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) == 'T') {
                if (memo == 0) {
                    pass;
                } else {
                    memo -= 1;
                }
            } else {
                memo += 1;
            }
        }
        return memo * 2;
    }
}
```

### 解析

1. 首先，我们需要将输入的字符串转换为一个整数，这样我们就可以使用一个for循环来遍历字符串。
2. 然后，我们需要使用一个变量来记录当前的状态，这样我们就可以根据状态来判断是否需要增加或减少memo。
3. 最后，我们需要使用一个for循环来遍历字符串，并根据状态来增加或减少memo。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [100. 最长回文子串](https://leetcode-cn.com/problems/longest-palindromic-substring/)
- [101. 最长回文子序列](https://leetcode-cn.com/problems/longest-palindromic-subsequence/)
- [102. 最长回文子序列 II](https://leetcode-cn.com/problems/longest-palindromic-subsequence-ii/)
- [103. 最长回文子序列 III](https://leetcode-cn.com/problems/longest-palindromic-subsequence-iii/)
- [104. 最长回文子序列 IV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-iv/)
- [105. 最长回文子序列 V](https://leetcode-cn.com/problems/longest-palindromic-subsequence-v/)
- [106. 最长回文子序列 VI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-vi/)
- [107. 最长回文子序列 VII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-vii/)
- [108. 最长回文子序列 VIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-viii/)
- [109. 最长回文子序列 IX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-ix/)
- [110. 最长回文子序列 X](https://leetcode-cn.com/problems/longest-palindromic-subsequence-x/)
- [111. 最长回文子序列 XI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xi/)
- [112. 最长回文子序列 XII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xii/)
- [113. 最长回文子序列 XIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xiii/)
- [114. 最长回文子序列 XIV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xiv/)
- [115. 最长回文子序列 XV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xv/)
- [116. 最长回文子序列 XVI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xvi/)
- [117. 最长回文子序列 XVII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xvii/)
- [118. 最长回文子序列 XVIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xviii/)
- [119. 最长回文子序列 XIX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xix/)
- [120. 最长回文子序列 XX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xx/)
- [121. 最长回文子序列 XXI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxi/)
- [122. 最长回文子序列 XXII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxii/)
- [123. 最长回文子序列 XXIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxiii/)
- [124. 最长回文子序列 XXIV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxiv/)
- [125. 最长回文子序列 XXV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxv/)
- [126. 最长回文子序列 XXVI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxvi/)
- [127. 最长回文子序列 XXVII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxvii/)
- [128. 最长回文子序列 XXVIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxviii/)
- [129. 最长回文子序列 XXIX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxix/)
- [130. 最长回文子序列 XXX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxx/)
- [131. 最长回文子序列 XXXI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxxii/)
- [132. 最长回文子序列 XXXII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxxiii/)
- [133. 最长回文子序列 XXXIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxxiv/)
- [134. 最长回文子序列 XXXIV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxxv/)
- [135. 最长回文子序列 XXXV](https://leetcode-cn.com/problems/longest-palindromic-sub
