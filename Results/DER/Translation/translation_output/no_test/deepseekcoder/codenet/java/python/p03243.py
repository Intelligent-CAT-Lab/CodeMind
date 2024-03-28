<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i < 1000; i++) {
            if (i % 111 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
```

### Response:
```python
import sys

def p03243():
    n = int(sys.stdin.readline())
    for i in range(n, 1000):
        if i % 111 == 0:
            print(i)
            return

p03243()
```

This Python code does the same thing as the Java code. It reads an integer from standard input, then iterates from that integer to 1000. If it finds a number that is divisible by 111, it prints that number and returns.
<|EOT|>
