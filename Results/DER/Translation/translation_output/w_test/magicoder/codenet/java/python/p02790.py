<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 3

Expected output:
3333


```
import java.util.Scanner;

public class p02790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b)
            for (int i = 0; i < a; i++)
                System.out.print(b);
        else
            for (int i = 0; i < b; i++)
                System.out.print(a);

    }
}

```

@@ Response
```python
a, b = map(int, input().split())

if a >= b:
    print(b * a)
else:
    print(a * b)
```

This Python code does the same thing as the Java code. It reads two integers from the input, and then prints out the larger one repeated as many times as the smaller one.<｜end▁of▁sentence｜>
