<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03417 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();
        final long M = sc.nextLong();

        System.out.println(Math.abs((N-2) * (M-2)));
    }
}

```

### Response:
```python
import sys

def main():
    N, M = map(int, sys.stdin.readline().split())
    print(abs((N-2) * (M-2)))

if __name__ == "__main__":
    main()
```

This Python code reads two integers from the standard input, calculates the absolute value of the product of `(N-2)` and `(M-2)`, and prints the result. It uses the `abs` function to calculate the absolute value, and the `map` function to read and convert the input to integers. The `sys.stdin.readline().split()` function is used to read the input from the standard input.
<|EOT|>
