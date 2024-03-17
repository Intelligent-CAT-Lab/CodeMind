<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
814793613347395 1.99

Expected output:
1621439290561316


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

def atcoder_ABC169_C():
    a = int(sys.stdin.readline().split()[0])
    b = float(sys.stdin.readline().split()[0])
    c = round(b * 100)
    d = a * c
    print(d // 100)

atcoder_ABC169_C()
```

This Python code reads two inputs from the standard input, converts them to the appropriate types, and performs the same operations as the Java code. The result is printed to the standard output.
<|EOT|>
