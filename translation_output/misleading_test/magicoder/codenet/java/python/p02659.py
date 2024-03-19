<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
198 1.10

Expected output:
288

```
import java.util.*;

public class p02659 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    double b = sc.nextDouble();
    long bb = (long)((double)100 * b + 0.1);
    long ans = (a * bb) / (long)100;
    System.out.println(ans);
  }
}
```

@@ Response
```python
import sys

def main():
    a, b = map(float, sys.stdin.readline().split())
    bb = int((b * 100) + 0.1)
    ans = (a * bb) // 100
    print(ans)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map(float, sys.stdin.readline().split())` function splits the input into two parts, converts them into floats, and assigns them to `a` and `b` respectively. The `int((b * 100) + 0.1)` line calculates `bb`, which is the equivalent of `bb = (long)((double)100 * b + 0.1)` in the Java code. The `(a * bb) // 100` line calculates `ans`, which is the equivalent of `ans = (a * bb) / (long)100` in the Java code. Finally, the `print(ans)` line prints the result.<｜end▁of▁sentence｜>
