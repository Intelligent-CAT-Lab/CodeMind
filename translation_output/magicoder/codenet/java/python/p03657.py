<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03657 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if( a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) System.out.println("Possible");
        else System.out.println("Impossible");
    }
}
```

@@ Response
```python
# Python code

# importing the built-in module for input
import sys

# reading input from the user
a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

# checking the conditions
if a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0:
    print("Possible")
else:
    print("Impossible")
```

This Python code does the same thing as the Java code. It reads two integers from the user, and then checks if any of the following conditions are true:

- The first number is divisible by 3.
- The second number is divisible by 3.
- The sum of the two numbers is divisible by 3.

If any of these conditions are true, it prints "Possible". Otherwise, it prints "Impossible".<｜end▁of▁sentence｜>
