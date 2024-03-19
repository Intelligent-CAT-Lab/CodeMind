<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
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

@@ Response
```python
def solve(n, k):
    left = 1
    right = k + 1
    while right - left > 1:
        m = (left + right) // 2
        x = m
        total = 0
        for _ in range(n):
            if x > 0 and total <= k:
                total += x
                x //= 2
        if total <= k:
            left = m
        else:
            right = m
    return left

n, k = map(int, input().split())
print(solve(n, k))
```

This Python code does the same thing as the Java code. It reads two integers from the input, calls the `solve` function with these integers, and then prints the result. The `solve` function implements a binary search to find the smallest integer `x` such that the sum of `x` and `x/2`, `x/4`, `x/8`, ..., `x/2^(n-1)` is less than or equal to `k`.<｜end▁of▁sentence｜>
