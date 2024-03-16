<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02897 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double n = sc.nextDouble();

    double odd = 0;
    double notOdd = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        notOdd++;
      } else {
        odd++;
      }
    }
    System.out.println(odd / n);
  }
}

```

### Response:
```python
import sys

def p02897():
    n = float(sys.stdin.readline())

    odd = 0
    not_odd = 0
    for i in range(1, int(n) + 1):
        if i % 2 == 0:
            not_odd += 1
        else:
            odd += 1
    print(odd / n)

p02897()
```

This Python code does the same thing as the Java code. It reads a number from the standard input, counts the number of odd and even numbers up to that number, and then prints the ratio of the number of odd numbers to the total number.
<|EOT|>
