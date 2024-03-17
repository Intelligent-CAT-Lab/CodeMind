<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())

    if a <= 0 and b >= 0 or a <= 0 and b >= 0:
        print("Zero")
    elif a < 0 and b < 0:
        print("Positive" if (b - a + 1) % 2 == 0 else "Negative")
    elif a > 0 and b > 0:
        print("Positive")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, and then checks the conditions in the same way as the Java code. The `sys.stdin.readline().split()` line reads the input from the standard input and splits it into two integers. The `map(int, ...)` function converts the strings into integers. The `print` function is used to output the result.<｜end▁of▁sentence｜>
