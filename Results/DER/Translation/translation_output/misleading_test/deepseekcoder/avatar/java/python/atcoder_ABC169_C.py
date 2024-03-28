<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
814793613347395 1.99

Expected output:
1621439290561275

```
import java.util.*;
import java.io.*;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        long c = (long) Math.round(b * 100);
        long d = a * c;
        System.out.println(d / 100);
    }
}
```

### Response:
```python
import sys

def solve(a, b):
    c = round(b * 100)
    d = a * c
    return d // 100

a = int(sys.stdin.readline().split()[0])
b = float(sys.stdin.readline().split()[1])
print(solve(a, b))
```

In this Python code, we use the `round` function to round the decimal number to the nearest integer. The `//` operator is used for integer division in Python. The `sys.stdin.readline().split()` function is used to read the input from the standard input. The `int` and `float` functions are used to convert the input to the appropriate types.
<|EOT|>
