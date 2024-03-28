<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
111

Expected output:
111


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

@@ Response
```python
def p03243():
    n = int(input())
    for i in range(n, 1000):
        if i % 111 == 0:
            print(i)
            return

p03243()
```

This Python code does the same thing as the Java code. It reads an integer from the user, then iterates from that number to 1000. If it finds a number that is divisible by 111, it prints that number and stops.<｜end▁of▁sentence｜>
