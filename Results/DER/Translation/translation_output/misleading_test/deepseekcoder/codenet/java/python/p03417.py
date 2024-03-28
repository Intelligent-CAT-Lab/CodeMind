<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
-36

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

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input strings to integers. The `abs()` function is used to get the absolute value of the result.
<|EOT|>
