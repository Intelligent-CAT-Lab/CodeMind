<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def is_power_of_two(n):
    return (n & (n - 1)) == 0

n = int(sys.stdin.readline())
if is_power_of_two(n):
    print("YES")
else:
    print("NO")
```

In this Python code, we define a function `is_power_of_two(n)` that checks if a number `n` is a power of two. This is done by using bitwise AND operation `&`. If `n` is a power of two, then `n` and `n - 1` will have no bits in common, which is why `(n & (n - 1)) == 0` is used to check if `n` is a power of two. If `n` is a power of two, the function returns `True`, otherwise it returns `False`.

The main part of the code reads an integer from the standard input, checks if it is a power of two using the `is_power_of_two(n)` function, and prints "YES" if it is a power of two, otherwise it prints "NO".
<|EOT|>
