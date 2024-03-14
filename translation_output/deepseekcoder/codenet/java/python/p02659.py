<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    a = int(sys.stdin.readline().strip())
    b = float(sys.stdin.readline().strip())
    bb = int((100 * b) + 0.5)
    ans = (a * bb) // 100
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two numbers from the standard input, multiplies the first number by the second number (after converting it to an integer percentage of the first number), and then prints the result. The multiplication is done using integer division, which truncates the result to the nearest integer.
<|EOT|>
