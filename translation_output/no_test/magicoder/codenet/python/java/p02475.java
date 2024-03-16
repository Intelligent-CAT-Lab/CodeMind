<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = map(int,input().split())

def round(a, b):
	if a * b < 0:
		return -(-a//b)
	else:
		return a//b

print(round(a, b))

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println(round(a, b));
    }

    public static int round(int a, int b) {
        if (a * b < 0) {
            return -(-a / b);
        } else {
            return a / b;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, then calls the `round` function with these integers as arguments. The `round` function checks if the product of the two integers is negative. If it is, it returns the negative integer division of the absolute value of `a` by `b`, otherwise it returns the integer division of `a` by `b`. The result is then printed to the console.<｜end▁of▁sentence｜>
