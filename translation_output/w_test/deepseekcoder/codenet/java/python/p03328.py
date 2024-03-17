<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 13

Expected output:
2


```
import java.util.Scanner;

class p03328 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int n = b - a;
    System.out.println(n * (n + 1) / 2 - b);
  }
}

```

### Response:
```python
def p03328():
    a, b = map(int, input().split())
    n = b - a
    print(n * (n + 1) // 2 - b)

p03328()
```

In this Python code, we define a function `p03328` that reads two integers from the input, calculates the difference `n` between them, and then prints the result of the calculation `n * (n + 1) // 2 - b`. The `//` operator is used for integer division in Python. The function is then called to execute the code.
<|EOT|>
