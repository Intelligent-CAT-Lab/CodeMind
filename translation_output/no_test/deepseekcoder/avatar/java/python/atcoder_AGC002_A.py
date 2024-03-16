<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

def atcoder_AGC002_A():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())

    if a <= 0 and b >= 0 or a >= 0 and b <= 0:
        print("Zero")
    elif a < 0 and b < 0:
        print("Positive" if (b - a + 1) % 2 == 0 else "Negative")
    elif a > 0 and b > 0:
        print("Positive")

atcoder_AGC002_A()
```

This Python code does the same thing as the Java code. It reads two long integers from the standard input, and then checks the range of these integers to determine whether the product of all the integers in the range is positive, negative, or zero. The result is printed to the standard output.
<|EOT|>
