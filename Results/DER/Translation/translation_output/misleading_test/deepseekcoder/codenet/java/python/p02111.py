<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
-43 -89

```
import java.util.*;

public class p02111 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minute = 12 * 60 * n / 360;
        System.out.println((minute / 60) + " " + (minute % 60));
    }
}

```

### Response:
```python
import sys

def main():
    n = int(sys.stdin.readline())
    minute = (12 * 60 * n) // 360
    print(f"{minute // 60} {minute % 60}")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `//` operator is used for integer division in Python, which is equivalent to the `/` operator in Java but always returns an integer. The `%` operator is used to get the remainder of the division. The `print` function in Python uses a formatted string, which is similar to the `System.out.println` in Java.
<|EOT|>
