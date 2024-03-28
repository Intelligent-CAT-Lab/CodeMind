<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    n = b - a
    print(n * (n + 1) // 2 - b)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input (console). The `map(int, sys.stdin.readline().split())` function is used to convert the input into integers. The `//` operator is used for integer division in Python. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.<｜end▁of▁sentence｜>
