<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        System.out.println(Math.max(Math.max(Math.max(a * c, b * d), a * d), b * c));
    }
}
```

### Response:
```python
import sys

def atcoder_ABC178_B():
    a, b, c, d = map(int, sys.stdin.readline().split())
    print(max(max(max(a * c, b * d), a * d), b * c))

atcoder_ABC178_B()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, calculates the product of the first two and the product of the last two, and prints the maximum of these four products.
<|EOT|>
