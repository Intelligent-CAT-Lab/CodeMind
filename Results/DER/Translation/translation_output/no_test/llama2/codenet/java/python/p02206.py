<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long left = 1;
        long right = k + 1;
        while (right - left > 1) {
            long m = (left + right) / 2;
            long x = m;
            long total = 0;
            for (int i = 0; i < n && x > 0 && total <= k; i++) {
                total += x;
                x /= 2;
            }
            if (total <= k) {
                left = m;
            } else {
                right = m;
            }
        }
        System.out.println(left);
    }
}


```

### 解题思路

```python
import sys

n, k = map(int, sys.stdin.readline().split())

left = 1
right = k + 1

while right - left > 1:
    mid = (left + right) // 2
    x = mid
    total = 0
    for _ in range(n):
        total += x
        x //= 2
    if total <= k:
        left = mid
    else:
        right = mid

print(left)
```

### 复杂度分析

- 时间复杂度：O(logn)
- 空间复杂度：O(1)
</s>
