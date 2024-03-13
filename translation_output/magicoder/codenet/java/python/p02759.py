<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02759 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.printf("%d", (N + 1) / 2);
    sc.close();
    return;
  }
}
```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    N = int(sys.stdin.readline())
    print((N + 1) // 2)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the result, and prints it. The `//` operator in Python is used for integer division, which is equivalent to the `/` operator in Java but rounds down to the nearest integer.<｜end▁of▁sentence｜>
