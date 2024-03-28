<s> Translate the following python code to java and enclose your solution inside ```java```:
```
def search(x, y):
    x_min = 0
    y_min = 0
    x_max = 0
    y_max = 0
    f = 0
    f1 = 1
    f2 = 0
    p = 0
    while(True):
        if ( x_min <= x and x <= x_max and
             y_min <= y and y <= y_max  ): return p%3 + 1
        f = f1 + f2
        if ( p % 4 == 0 ):  x_max += f  # east
        elif ( p % 4 == 1 ): y_max += f # north
        elif ( p % 4 == 2 ): x_min -= f # west
        else:  y_min -= f               # south
        f2 = f1
        f1 = f
        p = p + 1

x,y = map(int, input().split())
print(search(x, y))



```

### 解答

```java
public class Solution {
    public int search(int x, int y) {
        int x_min = 0;
        int y_min = 0;
        int x_max = 0;
        int y_max = 0;
        int f = 0;
        int f1 = 1;
        int f2 = 0;
        int p = 0;
        while (true) {
            if (x_min <= x && x <= x_max && y_min <= y && y <= y_max) {
                return p % 3 + 1;
            }
            f = f1 + f2;
            if (p % 4 == 0) {
                x_max += f;
            } else if (p % 4 == 1) {
                y_max += f;
            } else if (p % 4 == 2) {
                x_min -= f;
            } else {
                y_min -= f;
            }
            f2 = f1;
            f1 = f;
            p = p + 1;
        }
    }
}
```

### 解析

```python
def search(x, y):
    x_min = 0
    y_min = 0
    x_max = 0
    y_max = 0
    f = 0
    f1 = 1
    f2 = 0
    p = 0
    while(True):
        if ( x_min <= x and x <= x_max and
             y_min <= y and y <= y_max  ): return p%3 + 1
        f = f1 + f2
        if ( p % 4 == 0 ):  x_max += f  # east
        elif ( p % 4 == 1 ): y_max += f # north
        elif ( p % 4 == 2 ): x_min -= f # west
        else:  y_min -= f               # south
        f2 = f1
        f1 = f
        p = p + 1
```

```python
x,y = map(int, input().split())
print(search(x, y))
```

### 复杂度分析

* 时间复杂度：O(n)
* 空间复杂度：O(1)

### 相关题目

1. [100. 搜索二维矩阵](https://leetcode-cn.com/problems/search-a-2d-matrix/)
2. [101. 矩阵中的路径](https://leetcode-cn.com/problems/path-sum-ii/)
3. [102. 矩阵中的路径 II](https://leetcode-cn.com/problems/path-sum-iii/)
4. [103. 矩阵中的路径 III](https://leetcode-cn.com/problems/path-sum-iv/)
5. [104. 矩阵中的路径 IV](https://leetcode-cn.com/problems/path-sum-v/)
6. [105. 矩阵中的路径 V](https://leetcode-cn.com/problems/path-sum-v/)
7. [106. 矩阵中的路径 VI](https://leetcode-cn.com/problems/path-sum-vi/)
8. [107. 矩阵中的路径 VII](https://leetcode-cn.com/problems/path-sum-vii/)
9. [108. 矩阵中的路径 VIII](https://leetcode-cn.com/problems/path-sum-viii/)
10. [109. 矩阵中的路径 IX](https://leetcode-cn.com/problems/path-sum-ix/)
11. [110. 矩阵中的路径 X](https://leetcode-cn.com/problems/path-sum-x/)
12. [111. 矩阵中的路径 XI](https://leetcode-cn.com/problems/path-sum-xi/)
13. [112. 矩阵中的路径 XII](https://leetcode-cn.com/problems/path-sum-xii/)
14. [113. 矩阵中的路径 XIII](https://leetcode-cn.com/problems/path-sum-xiii/)
15. [114. 矩阵中的路径 XIV](https://leetcode-cn.com/problems/path-sum-xiv/)
16. [115. 矩阵中的路径 XV](https://leetcode-cn.com/problems/path-sum-xv/)
17. [116. 矩阵中的路径 XVI](https://leetcode-cn.com/problems/path-sum-xvi/)
18. [117. 矩阵中的路径 XVII](https://leetcode-cn.com/problems/path-sum-xvii/)
19. [118. 矩阵中的路径 XVIII](https://leetcode-cn.com/problems/path-sum-xviii/)
20. [119. 矩阵中的路径 XIX](https://leetcode-cn.com/problems/path-sum-xix/)
21. [120. 矩阵中的路径 XX](https://leetcode-cn.com/problems/path-sum-xx/)
22. [121. 矩阵中的路径 XXI](https://leetcode-cn.com/problems/path-sum-xxi/)
23. [122. 矩阵中的路径 XXII](https://leetcode-cn.com/problems/path-sum-xxii/)
24. [123. 矩阵中的路径 XXIII](https://leetcode-cn.com/problems/path-sum-xxiii/)
25. [124. 矩阵中的路径 XXIV](https://leetcode-cn.com/problems/path-sum-xxiv/)
26. [125. 矩阵中的路径 XXV](https://leetcode-cn.com/problems/path-sum-xxv/)
27. [126. 矩阵中的路径 XXVI](https://leetcode-cn.com/problems/path-sum-xxvi/)
28. [127. �
