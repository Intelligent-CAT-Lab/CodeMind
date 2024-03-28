<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
80 970

Expected output:
146

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

### Response:
```python
import sys

def solve(a, b):
    res = a
    while a >= b:
        res += (a // b)
        a = (a // b) + (a % b)
    return res

if __name__ == "__main__":
    a, b = map(int, sys.stdin.readline().split())
    print(solve(a, b))
```

In this Python code, we define a function `solve` that takes two arguments `a` and `b`. The function calculates the result by repeatedly dividing `a` by `b` and adding the quotient to `res`. The remainder of the division is added to `a`. The function returns the final value of `res`. The `if __name__ == "__main__"` block reads the input from the standard input, calls the `solve` function with the input, and prints the result.
<|EOT|>
