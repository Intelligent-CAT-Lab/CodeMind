<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
-73

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
[/INST]
```python
n, k = map(int, input().split())
left, right = 1, k + 1
while right - left > 1:
    m = (left + right) // 2
    x = m
    total = 0
    for i in range(n):
        if x > 0 and total <= k:
            total += x
            x //= 2
        else:
            break
    if total <= k:
        left = m
    else:
        right = m
print(left)
```</s>
