<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
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

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input into float numbers. The `int()` function is used to convert the float number to integer, and the `//` operator is used for integer division.
<|EOT|>
