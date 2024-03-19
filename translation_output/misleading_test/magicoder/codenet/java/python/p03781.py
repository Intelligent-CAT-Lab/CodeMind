<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
2

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

@@ Response
```python
def p03781():
    x = int(input())
    i = 1
    while i * (i + 1) // 2 < x:
        i += 1
    print(i)

p03781()
```

In this Python code, we are using the same logic as in the Java code. We are reading an integer from the standard input, then we are iterating from 1 to find the smallest integer `i` such that `i * (i + 1) / 2 >= x`. The `//` operator is used for integer division in Python. The result is then printed to the standard output.<｜end▁of▁sentence｜>
