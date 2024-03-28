<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
# Python code

a = int(input())
b = int(input())

if a >= b:
    for i in range(a):
        print(b, end='')
else:
    for i in range(b):
        print(a, end='')
```

This Python code does the same thing as the Java code. It reads two integers from the user, and then prints the smaller one as many times as the larger one. If the two numbers are equal, it prints the first one as many times as the second one.<｜end▁of▁sentence｜>
