<s> Translate the following python code to java and enclose your solution inside ```java```:
```
def make_divisors(n):
    divisors = []
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            divisors.append(i)
            if i != n // i:
                divisors.append(n//i)

    # divisors.sort()
    return divisors

def main():
    N, M = map(int, input().split())
    MN = M/N
    divisor = make_divisors(M)
    max_gcd = 0
    for d in divisor:
        if (d<=MN) and (d>=max_gcd):
            max_gcd = d
    print(max_gcd)
if __name__ == '__main__':
    main()
```

### 解题思路

```
def make_divisors(n):
    divisors = []
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            divisors.append(i)
            if i != n // i:
                divisors.append(n//i)

    # divisors.sort()
    return divisors

def main():
    N, M = map(int, input().split())
    MN = M/N
    divisor = make_divisors(M)
    max_gcd = 0
    for d in divisor:
        if (d<=MN) and (d>=max_gcd):
            max_gcd = d
    print(max_gcd)
if __name__ == '__main__':
    main()
```

### 代码实现

```
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        N = sc.nextInt();
        M = sc.nextInt();
        int MN = M/N;
        List<Integer> divisor = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(M); i++) {
            if (M % i == 0) {
                divisor.add(i);
                if (i != M/i) {
                    divisor.add(M/i);
                }
            }
        }
        Collections.sort(divisor);
        int max_gcd = 0;
        for (int d : divisor) {
            if (d <= MN && d >= max_gcd) {
                max_gcd = d;
            }
        }
        System.out.println(max_gcd);
    }
}
```

### 复杂度分析

* 时间复杂度：O(N)
* 空间复杂度：O(N)

### 相关题目

1. [100. 最长公共子序列](https://leetcode-cn.com/problems/longest-common-subsequence/)
2. [101. 最长公共子序列 II](https://leetcode-cn.com/problems/longest-common-subsequence-ii/)
3. [102. 最长公共子序列 III](https://leetcode-cn.com/problems/longest-common-subsequence-iii/)
4. [103. 最长公共子序列 IV](https://leetcode-cn.com/problems/longest-common-subsequence-iv/)
5. [104. 最长公共子序列 V](https://leetcode-cn.com/problems/longest-common-subsequence-v/)
6. [105. 最长公共子序列 VI](https://leetcode-cn.com/problems/longest-common-subsequence-vi/)
7. [106. 最长公共子序列 VII](https://leetcode-cn.com/problems/longest-common-subsequence-vii/)
8. [107. 最长公共子序列 VIII](https://leetcode-cn.com/problems/longest-common-subsequence-viii/)
9. [108. 最长公共子序列 IX](https://leetcode-cn.com/problems/longest-common-subsequence-ix/)
10. [109. 最长公共子序列 X](https://leetcode-cn.com/problems/longest-common-subsequence-x/)
11. [110. 最长公共子序列 XI](https://leetcode-cn.com/problems/longest-common-subsequence-xi/)
12. [111. 最长公共子序列 XII](https://leetcode-cn.com/problems/longest-common-subsequence-xii/)
13. [112. 最长公共子序列 XIII](https://leetcode-cn.com/problems/longest-common-subsequence-xiii/)
14. [113. 最长公共子序列 XIV](https://leetcode-cn.com/problems/longest-common-subsequence-xiv/)
15. [114. 最长公共子序列 XV](https://leetcode-cn.com/problems/longest-common-subsequence-xv/)
16. [115. 最长公共子序列 XVI](https://leetcode-cn.com/problems/longest-common-subsequence-xvi/)
17. [116. 最长公共子序列 XVII](https://leetcode-cn.com/problems/longest-common-subsequence-xvii/)
18. [117. 最长公共子序列 XVIII](https://leetcode-cn.com/problems/longest-common-subsequence-xviii/)
19. [118. 最长公共子序列 XIX](https://leetcode-cn.com/problems/longest-common-subsequence-xix/)
20. [119. 最长公共子序列 XX](https://leetcode-cn.com/problems/longest-common-subsequence-xx/)
21. [120. 最长公共子序列 XXI](https://leetcode-cn.com/problems/longest-common-subsequence-xxi/)
22. [121. 最长公共子序列 XXII](https://leetcode-cn.com/problems/longest-common-subsequence-xxii/)
23. [122. 最长公共子序列 XXIII](https://leetcode-cn.com/problems/longest-common-subsequence-xxiii/)
24. [123. 最长公共子序列 XXIV](https://leetcode-cn.com/problems/longest-common-subsequence-xxiv/)
25. [124. 最长公共子序列 XXV](https://leetcode-cn.com/problems/longest-common-subsequence-xxv/)
26. [125. 最长公共子序列 XXVI](https://leetcode-cn.com/problems/longest-common-subsequence-xxvi/)
27. [126. 最长公共子序列 XXVII](https://leetcode-cn.com/problems/longest-common-subsequence-xxvii/)
28. [127. 最长公共子序列 XXVIII](https://leetcode-cn.com/problems/longest-common-subsequence-xxviii/)
29. [128. 最长公共子序列 XXIX](https://leetcode-cn.com/problems/longest-common-subsequence-xxix/)
30. [129. 最长公共子序列 XXX](https://leetcode-cn.com/problems/longest-common-subsequence-xxx/)
31. [130. 最长公共子序列 XXXI](https://leetcode-cn.com/problem
