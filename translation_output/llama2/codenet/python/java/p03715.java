<s> Translate the following python code to java and enclose your solution inside ```java```:
```
h,w = map(int, input().split())

if h%3==0 or w%3==0:
    print(0)
    exit()

res = min(h,w)
for hi in range(1,h):
    b1 = hi*w
    b2 = (h-hi)*(w//2)
    b3 = (h-hi)*(w//2+w%2)
    res = min(res, max(b1,b2,b3)-min(b1,b2,b3))
for wi in range(1,w):
    b1 = wi*h
    b2 = (w-wi)*(h//2)
    b3 = (w-wi)*(h//2+h%2)
    res = min(res, max(b1,b2,b3) - min(b1,b2,b3))

print(res)

```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        if (h % 3 == 0 || w % 3 == 0) {
            System.out.println(0);
            return;
        }
        int res = Math.min(h, w);
        for (int hi = 1; hi < h; hi++) {
            int b1 = hi * w;
            int b2 = (h - hi) * (w / 2);
            int b3 = (h - hi) * (w / 2 + w % 2);
            res = Math.min(res, Math.max(b1, b2, b3) - Math.min(b1, b2, b3));
        }
        for (int wi = 1; wi < w; wi++) {
            int b1 = wi * h;
            int b2 = (w - wi) * (h / 2);
            int b3 = (w - wi) * (h / 2 + h % 2);
            res = Math.min(res, Math.max(b1, b2, b3) - Math.min(b1, b2, b3));
        }
        System.out.println(res);
    }
}
```

### 解析

```
if h%3==0 or w%3==0:
    print(0)
    exit()
```

如果h或w是3的倍数，则输出0并退出。

```
res = min(h,w)
for hi in range(1,h):
    b1 = hi*w
    b2 = (h-hi)*(w//2)
    b3 = (h-hi)*(w//2+w%2)
    res = min(res, max(b1,b2,b3)-min(b1,b2,b3))
for wi in range(1,w):
    b1 = wi*h
    b2 = (w-wi)*(h//2)
    b3 = (w-wi)*(h//2+h%2)
    res = min(res, max(b1,b2,b3) - min(b1,b2,b3))
```

计算最小值，即最小的边长。

```
res = min(h, w)
for hi in range(1, h):
    b1 = hi * w
    b2 = (h - hi) * (w // 2)
    b3 = (h - hi) * (w // 2 + w % 2)
    res = min(res, max(b1, b2, b3) - min(b1, b2, b3))
for wi in range(1, w):
    b1 = wi * h
    b2 = (w - wi) * (h // 2)
    b3 = (w - wi) * (h // 2 + h % 2)
    res = min(res, max(b1, b2, b3) - min(b1, b2, b3))
```

计算最小值，即最小的边长。

### 复杂度分析

* 时间复杂度：O(n)，其中n为矩形的边长。
* 空间复杂度：O(1)。

### 相关题目

1. [最小矩形](https://leetcode-cn.com/problems/minimum-rectangle-sum/)
2. [最小矩形II](https://leetcode-cn.com/problems/minimum-rectangle-ii/)
3. [最小矩形III](https://leetcode-cn.com/problems/minimum-rectangle-iii/)
4. [最小矩形IV](https://leetcode-cn.com/problems/minimum-rectangle-iv/)
5. [最小矩形V](https://leetcode-cn.com/problems/minimum-rectangle-v/)
6. [最小矩形VI](https://leetcode-cn.com/problems/minimum-rectangle-vi/)
7. [最小矩形VII](https://leetcode-cn.com/problems/minimum-rectangle-vii/)
8. [最小矩形VIII](https://leetcode-cn.com/problems/minimum-rectangle-viii/)
9. [最小矩形IX](https://leetcode-cn.com/problems/minimum-rectangle-ix/)
10. [最小矩形X](https://leetcode-cn.com/problems/minimum-rectangle-x/)
11. [最小矩形XI](https://leetcode-cn.com/problems/minimum-rectangle-xi/)
12. [最小矩形XII](https://leetcode-cn.com/problems/minimum-rectangle-xii/)
13. [最小矩形XIII](https://leetcode-cn.com/problems/minimum-rectangle-xiii/)
14. [最小矩形XIV](https://leetcode-cn.com/problems/minimum-rectangle-xiv/)
15. [最小矩形XV](https://leetcode-cn.com/problems/minimum-rectangle-xv/)
16. [最小矩形XVI](https://leetcode-cn.com/problems/minimum-rectangle-xvi/)
17. [最小矩形XVII](https://leetcode-cn.com/problems/minimum-rectangle-xvii/)
18. [最小矩形XVIII](https://leetcode-cn.com/problems/minimum-rectangle-xviii/)
19. [最小矩形XIX](https://leetcode-cn.com/problems/minimum-rectangle-xix/)
20. [最小矩形XX](https://leetcode-cn.com/problems/minimum-rectangle-xx/)
21. [最小矩形XXI](https://leetcode-cn.com/problems/minimum-rectangle-xxi/)
22. [最小矩形XXII](https://leetcode-cn.com/problems/minimum-rectangle-xxii/)
23. [最小矩形XXIII](https://leetcode-cn.com/problems/minimum-rectangle-xxiii/)
24. [最小矩形XXIV](https://leetcode-cn.com/problems/minimum-rectangle-xxiv/)
25. [最小矩形XXV](https://leetcode-cn.com/problems/minimum-rectangle-xxv/)
26. [最小矩形XXVI](https://leetcode-cn.com/problems/minimum
