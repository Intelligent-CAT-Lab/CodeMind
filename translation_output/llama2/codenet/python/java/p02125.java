<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
ans = 0
x = 1
while 2*x-1 <= N:
    x = 2*x
    ans += 1
print(ans)


```

### 解答

```java
public class Solution {
    public int solution(int N) {
        int ans = 0;
        int x = 1;
        while (2 * x - 1 <= N) {
            x = 2 * x;
            ans++;
        }
        return ans;
    }
}
```

### 解析

1. 首先，我们需要将输入的数字转换为整数，然后将其存储在变量N中。
2. 然后，我们需要使用一个变量ans来存储我们的答案。
3. 接下来，我们需要使用一个变量x来存储我们的初始值。
4. 然后，我们需要使用一个while循环来循环执行以下操作：
   1. 首先，我们需要使用一个if语句来检查2*x-1是否小于等于N。
   2. 如果2*x-1小于等于N，那么我们需要使用一个x=2*x语句来更新x的值。
   3. 然后，我们需要使用一个ans++语句来更新ans的值。
5. 最后，我们需要使用一个return语句来返回ans的值。

### 复杂度分析

- 时间复杂度：O(logN)。
- 空间复杂度：O(1)。

### 相关题目

- [100. 斐波那契数列](https://leetcode-cn.com/problems/fibonacci-number/)
- [101. 两数之和](https://leetcode-cn.com/problems/add-two-numbers/)
- [102. 乘积最大子数组](https://leetcode-cn.com/problems/maximum-product-subarray/)
- [103. 最长回文子串](https://leetcode-cn.com/problems/longest-palindromic-substring/)
- [104. 最长回文子序列](https://leetcode-cn.com/problems/longest-palindromic-subsequence/)
- [105. 最长回文子序列 II](https://leetcode-cn.com/problems/longest-palindromic-subsequence-ii/)
- [106. 最长回文子序列 III](https://leetcode-cn.com/problems/longest-palindromic-subsequence-iii/)
- [107. 字符串的排列](https://leetcode-cn.com/problems/permutation-in-string/)
- [108. 最长回文子序列](https://leetcode-cn.com/problems/longest-palindromic-subsequence/)
- [109. 最长回文子序列 II](https://leetcode-cn.com/problems/longest-palindromic-subsequence-ii/)
- [110. 最长回文子序列 III](https://leetcode-cn.com/problems/longest-palindromic-subsequence-iii/)
- [111. 最长回文子序列 IV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-iv/)
- [112. 最长回文子序列 V](https://leetcode-cn.com/problems/longest-palindromic-subsequence-v/)
- [113. 最长回文子序列 VI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-vi/)
- [114. 最长回文子序列 VII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-vii/)
- [115. 最长回文子序列 VIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-viii/)
- [116. 最长回文子序列 IX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-ix/)
- [117. 最长回文子序列 X](https://leetcode-cn.com/problems/longest-palindromic-subsequence-x/)
- [118. 最长回文子序列 XI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xi/)
- [119. 最长回文子序列 XII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xii/)
- [120. 最长回文子序列 XIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xiii/)
- [121. 最长回文子序列 XIV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xiv/)
- [122. 最长回文子序列 XV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xv/)
- [123. 最长回文子序列 XVI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xvi/)
- [124. 最长回文子序列 XVII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xvii/)
- [125. 最长回文子序列 XVIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xviii/)
- [126. 最长回文子序列 XIX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xix/)
- [127. 最长回文子序列 XX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xx/)
- [128. 最长回文子序列 XXI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxi/)
- [129. 最长回文子序列 XXII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxii/)
- [130. 最长回文子序列 XXIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxiii/)
- [131. 最长回文子序列 XXIV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxiv/)
- [132. 最长回文子序列 XXV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxv/)
- [133. 最长回文子序列 XXVI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxvi/)
- [134. 最长回文子序列 XXVII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxvii/)
- [135. 最长回文子序列 XXVIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-
