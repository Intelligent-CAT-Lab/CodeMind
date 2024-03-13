<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    n = b - a
    print(n * (n + 1) // 2 - b)

if __name__ == "__main__":
    main()
```

In Python, we don't need to import any specific libraries for input/output operations. We can use the built-in `sys.stdin.readline()` function to read input from the standard input. The `//` operator is used for integer division in Python.<｜end▁of▁sentence｜>
