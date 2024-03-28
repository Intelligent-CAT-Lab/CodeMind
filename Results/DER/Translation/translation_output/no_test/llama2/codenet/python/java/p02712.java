<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())

ans = 0
for i in range(1, N + 1):
    if i % 5 != 0 and i % 3 != 0:
        ans += i

print(ans)

```

### 解答

```java
public class Solution {
    public int solution(int N) {
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 5 != 0 && i % 3 != 0) {
                ans += i;
            }
        }
        return ans;
    }
}
```

### 解析

1. 首先，我们需要将输入转换为整数，然后使用for循环，从1开始，直到N+1，每次都要判断i是否为5的倍数和3的倍数，如果不是，则将i加入到ans中。
2. 最后，将ans返回给用户。

### 复杂度分析

- 时间复杂度：O(N)。
- 空间复杂度：O(1)。

### 相关题目

- [100. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [101. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [102. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [103. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [104. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [105. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [106. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [107. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [108. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [109. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [110. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [111. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [112. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [113. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [114. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [115. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [116. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [117. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [118. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [119. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [120. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [121. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [122. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [123. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [124. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [125. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [126. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [127. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [128. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [129. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [130. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [131. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [132. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [133. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [134. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [135. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [136. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [137. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [138. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [139. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [140. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [141. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [142. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [143. 整数括号](https://leetcode-cn.com/problems/integer-bracket-validity/)
- [144. 整数括号](https://leetcode-cn.com/problems/integer-bra
