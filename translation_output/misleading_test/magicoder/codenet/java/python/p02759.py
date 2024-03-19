<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
-86

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
```python
import sys

def main():
    N = int(sys.stdin.readline())
    print((N + 1) // 2)

if __name__ == "__main__":
    main()
```

In Python, the equivalent code would be:

- The `sys.stdin.readline()` function is used to read input from the standard input (console).
- The `//` operator is used for integer division in Python.
- The `if __name__ == "__main__":` block is used to ensure that the `main()` function is called when the script is run directly, but not when it's imported as a module.<｜end▁of▁sentence｜>
