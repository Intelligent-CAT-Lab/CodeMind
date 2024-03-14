<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def solve():
    n, k = map(int, sys.stdin.readline().split())
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
    print(left)

solve()
```

This Python code reads two integers from the standard input, `n` and `k`, and then uses binary search to find the maximum number of times `n` can be halved without exceeding `k`. The result is printed to the standard output.
<|EOT|>
