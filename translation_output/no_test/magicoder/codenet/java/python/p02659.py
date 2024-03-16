<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
    a = int(sys.stdin.readline())
    b = float(sys.stdin.readline())
    bb = int((100 * b) + 0.1)
    ans = (a * bb) // 100
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two numbers from the standard input, performs the calculation, and prints the result. The `sys.stdin.readline()` function is used to read input from the standard input, and the `int()` and `float()` functions are used to convert the input to integers and floating-point numbers, respectively. The `//` operator is used for integer division in Python.<｜end▁of▁sentence｜>
