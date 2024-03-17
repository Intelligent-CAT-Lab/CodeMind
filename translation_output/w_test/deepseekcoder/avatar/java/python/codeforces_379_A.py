<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def solve(a, b):
    res = a
    while a >= b:
        res += (a // b)
        a = (a // b) + (a % b)
    return res

input = sys.stdin.readline().split()
a = int(input[0])
b = int(input[1])
print(solve(a, b))
```

In this Python code, we define a function `solve` that takes two parameters `a` and `b`. The function calculates the result by repeatedly dividing `a` by `b` and adding the quotient to `res`, and updating `a` to be the quotient plus the remainder. The function returns `res`.

The `input` line reads a line from standard input, splits it into a list of strings, and converts each string to an integer. The first and second elements of the list are assigned to `a` and `b`, respectively.

Finally, the function `solve` is called with `a` and `b` as arguments, and its result is printed.
<|EOT|>
