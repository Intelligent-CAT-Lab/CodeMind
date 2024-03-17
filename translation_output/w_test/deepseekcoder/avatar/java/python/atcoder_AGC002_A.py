<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
-1000000000 -1

Expected output:
Positive


```
import java.util.*;

class atcoder_AGC002_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a <= 0 && b >= 0 || a <= 0 && b >= 0) {
            System.out.println("Zero");
        } else if (a < 0 && b < 0) {
            System.out.println(((b - a + 1) % 2 == 0) ? "Positive" : "Negative");
        } else if (a > 0 && b > 0) {
            System.out.println("Positive");
        }
    }
}
```

### Response:
```python
import sys

def solve(a, b):
    if a <= 0 and b >= 0 or a <= 0 and b <= 0:
        print("Zero")
    elif a < 0 and b < 0:
        print("Positive" if (b - a + 1) % 2 == 0 else "Negative")
    elif a > 0 and b > 0:
        print("Positive")

a, b = map(int, sys.stdin.readline().split())
solve(a, b)
```

In this Python code, we define a function `solve(a, b)` that takes two arguments `a` and `b`. The function checks the conditions in the Java code and prints the corresponding output. The inputs are read from the standard input using `sys.stdin.readline().split()`, which splits the input into a list of strings. The `map()` function is used to convert these strings into integers. The `solve()` function is then called with these inputs.
<|EOT|>
