<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
75 25

Expected output:
-27

```
import java.util.*;

public class atcoder_ABC143_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if A - (B * 2) > 0:
            system.out.println(A - (B * 2))
    }
}
```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    A, B = map(int, sys.stdin.readline().split())
    if A - (B * 2) > 0:
        print(A - (B * 2))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the difference between the first integer and twice the second integer, and prints the result if it's greater than zero.<｜end▁of▁sentence｜>
