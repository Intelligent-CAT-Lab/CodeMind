<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

This Python code does the same thing as the Java code. It reads an integer from the user, then iterates from 1 upwards until the sum of the first `i` natural numbers is greater than or equal to the input number. When it finds the first `i` for which this is true, it prints `i`.<｜end▁of▁sentence｜>
