<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
3


```
import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), i = 1;
        for (; i * (i + 1) / 2 < x; i++) {}
        System.out.println(i);
    }
}
```

### Response:
```python
def p03781():
    x = int(input())
    i = 1
    while i * (i + 1) // 2 < x:
        i += 1
    print(i)

p03781()
```

In this Python code, we define a function `p03781` that does the same thing as the Java code. It reads an integer from the standard input, then finds the smallest integer `i` such that `i * (i + 1) / 2` is greater or equal to `x`. The result is then printed to the standard output.
<|EOT|>
