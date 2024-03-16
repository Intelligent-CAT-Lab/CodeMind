<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from itertools import combinations

S = raw_input()
N = len(S)
cnt = 0

for a, b, c in combinations(range(1, N), 3):
    ok = True
    A = S[:a]
    B = S[a:b]
    C = S[b:c]
    D = S[c:]
    for x in [A, B, C, D]:
        y = int(x)
        if y > 255:
            ok = False
        if y == 0 and len(x) != 1:
            ok = False
        if y != 0 and x[0] == '0':
            ok = False
    cnt += ok

print cnt


```

### 解答

```java
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int solution(String S) {
        int N = S.length();
        int cnt = 0;
        for (int a = 1; a < N; a++) {
            for (int b = a; b < N; b++) {
                for (int c = b; c < N; c++) {
                    int[] arr = new int[N];
                    for (int i = 0; i < N; i++) {
                        arr[i] = S.charAt(i) - '0';
                    }
                    int[] A = Arrays.stream(arr).skip(a).toArray();
                    int[] B = Arrays.stream(arr).skip(b).toArray();
                    int[] C = Arrays.stream(arr).skip(c).toArray();
                    int[] D = Arrays.stream(arr).skip(N - 1).toArray();
                    boolean ok = true;
                    for (int x : new int[] {A, B, C, D}) {
                        if (x.length != 1) {
                            ok = false;
                        }
                        for (int y : x) {
                            if (y > 255) {
                                ok = false;
                            }
                            if (y == 0 && x.length != 1) {
                                ok = false;
                            }
                            if (y != 0 && x[0] == '0') {
                                ok = false;
                            }
                        }
                    }
                    cnt += ok;
                }
            }
        }
        return cnt;
    }
}
```

### 解析

```
from itertools import combinations
```

```
S = raw_input()
N = len(S)
cnt = 0
```

```
for a, b, c in combinations(range(1, N), 3):
    ok = True
    A = S[:a]
    B = S[a:b]
    C = S[b:c]
    D = S[c:]
    for x in [A, B, C, D]:
        y = int(x)
        if y > 255:
            ok = False
        if y == 0 and len(x) != 1:
            ok = False
        if y != 0 and x[0] == '0':
            ok = False
    cnt += ok
```

```
print cnt
```

### 复杂度分析

* 时间复杂度：O(N^3)。
* 空间复杂度：O(N)。

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
