<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
80 970

Expected output:
80


```
import java.util.*;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int res = a;
        
        while (a >= b) {
            res += (a / b);
            a = (a / b) + (a % b);
        }
        
        System.out.println(res);
    }
}
```

@@ Response
```python
import sys

def solve(a, b):
    res = a
    while a >= b:
        res += a // b
        a = a // b + a % b
    return res

if __name__ == "__main__":
    a, b = map(int, sys.stdin.readline().split())
    print(solve(a, b))
```

In this Python code, we define a function `solve` that takes two integers `a` and `b` as input and returns the result. The while loop continues until `a` is less than `b`. Inside the loop, `res` is incremented by the integer division of `a` by `b`, and `a` is updated to the integer division of `a` by `b` plus the remainder of `a` divided by `b`. Finally, the function returns `res`.

In the main block, we read the input from the standard input, split it into two integers, and pass them to the `solve` function. The result is printed to the standard output.<｜end▁of▁sentence｜>
