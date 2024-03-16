<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

This Python code does the same thing as the Java code you provided. It reads two integers from the standard input, and then checks the conditions to determine whether the product of the two integers is positive, negative, or zero. The `sys.stdin.readline().split()` function is used to read the input, and `map(int, ...)` is used to convert the input strings to integers. The `if __name__ == "__main__":` line is a common idiom in Python to ensure that the `main()` function is only called when the script is run directly, not when it's imported as a module.<｜end▁of▁sentence｜>
