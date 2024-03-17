<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
512

Expected output:
YES


```
import java.util.*;

public class codeforces_55_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & (n - 1)) == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
```

@@ Response
```python
import sys

def is_power_of_two(n):
    return (n & (n - 1)) == 0

if __name__ == "__main__":
    n = int(sys.stdin.readline())
    if is_power_of_two(n):
        print("YES")
    else:
        print("NO")
```

In this Python code, we define a function `is_power_of_two(n)` that checks if a number `n` is a power of two. This is done by using the bitwise AND operator `&` on `n` and `n - 1`. If `n` is a power of two, then `n` and `n - 1` will have no bits in common, so the result of the bitwise AND operation will be zero. If `n` is not a power of two, then `n` and `n - 1` will have at least one bit in common, so the result of the bitwise AND operation will be non-zero.

We then read the input number `n` from the standard input, and print "YES" if `n` is a power of two, and "NO" otherwise.<｜end▁of▁sentence｜>
