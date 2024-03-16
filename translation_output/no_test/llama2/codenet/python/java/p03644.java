<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())

ans, k = 1, 0
for i in range(2, N+1, 2):
    temp, res = i, 0
    while temp%2 == 0:
        res += 1
        temp //= 2
    if k < res:
        ans = i
        k = res
print(ans)
```

### 解题思路

```
N = int(input())

ans, k = 1, 0
for i in range(2, N+1, 2):
    temp, res = i, 0
    while temp%2 == 0:
        res += 1
        temp //= 2
    if k < res:
        ans = i
        k = res
print(ans)
```

### 代码实现

```java
public class Solution {
    public int countPrimes(int N) {
        int ans, k = 1, temp, res = 0;
        for (int i = 2; i <= N; i += 2) {
            temp = i;
            while (temp % 2 == 0) {
                res += 1;
                temp /= 2;
            }
            if (k < res) {
                ans = i;
                k = res;
            }
        }
        return ans;
    }
}
```

### 复杂度分析

* 时间复杂度：O(logN)
* 空间复杂度：O(1)

### 相关题目

1. [100. 最长回文子串](https://leetcode-cn.com/problems/longest-palindromic-substring/)
2. [101. 最长回文子序列](https://leetcode-cn.com/problems/longest-palindromic-subsequence/)
3. [102. 最长回文子序列 II](https://leetcode-cn.com/problems/longest-palindromic-subsequence-ii/)
4. [103. 最长回文子序列 III](https://leetcode-cn.com/problems/longest-palindromic-subsequence-iii/)
5. [104. 最长回文子序列 IV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-iv/)
6. [105. 最长回文子序列 V](https://leetcode-cn.com/problems/longest-palindromic-subsequence-v/)
7. [106. 最长回文子序列 VI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-vi/)
8. [107. 最长回文子序列 VII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-vii/)
9. [108. 最长回文子序列 VIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-viii/)
10. [109. 最长回文子序列 IX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-ix/)
11. [110. 最长回文子序列 X](https://leetcode-cn.com/problems/longest-palindromic-subsequence-x/)
12. [111. 最长回文子序列 XI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xi/)
13. [112. 最长回文子序列 XII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xii/)
14. [113. 最长回文子序列 XIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xiii/)
15. [114. 最长回文子序列 XIV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xiv/)
16. [115. 最长回文子序列 XV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xv/)
17. [116. 最长回文子序列 XVI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xvi/)
18. [117. 最长回文子序列 XVII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xvii/)
19. [118. 最长回文子序列 XVIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xviii/)
20. [119. 最长回文子序列 XIX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xix/)
21. [120. 最长回文子序列 XX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xx/)
22. [121. 最长回文子序列 XXI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxi/)
23. [122. 最长回文子序列 XXII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxii/)
24. [123. 最长回文子序列 XXIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxiii/)
25. [124. 最长回文子序列 XXIV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxiv/)
26. [125. 最长回文子序列 XXV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxv/)
27. [126. 最长回文子序列 XXVI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxvi/)
28. [127. 最长回文子序列 XXVII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxvii/)
29. [128. 最长回文子序列 XXVIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxviii/)
30. [129. 最长回文子序列 XXIX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxix/)
31. [130. 最长回文子序列 XXX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxx/)
32. [131. 最长回文子序列 XXXI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxxii/)
33. [132. 最长回文子序列 XXXII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxxiii/)
34. [133. 最长回文子序列 XXXIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxxiv/)
35. [134. 最长回文子序列 XXXIV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxxv/)
36. [135. 最长回文子序列 XXXV](https://leetcode-cn.com/problems/longest-pal
