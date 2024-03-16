<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03266 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    sc.close();

    if (K % 2 == 0) {
      long c1 = N / K;
      long c2 = N / (K / 2) - c1;
      System.out.println(c1 * c1 * c1 + c2 * c2 * c2);
    } else {
      long c = N / K;
      System.out.println(c * c * c);
    }

  }

}
```

### Response:
```python
import sys

def main():
    N, K = map(int, sys.stdin.readline().split())

    if K % 2 == 0:
        c1 = N // K
        c2 = N // (K // 2) - c1
        print(c1 * c1 * c1 + c2 * c2 * c2)
    else:
        c = N // K
        print(c * c * c)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, and then calculates and prints the result based on whether K is even or odd. The `//` operator is used for integer division in Python, which is equivalent to the `/` operator in Java but always rounds down to the nearest integer. The `%` operator is used for modulus, which is equivalent to the `%` operator in Java. The `print` function is used to output the result, which is equivalent to the `System.out.println` function in Java.
<|EOT|>
