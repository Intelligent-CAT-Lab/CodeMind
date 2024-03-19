<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5

Expected output:
Possibli

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

# Get input from user
a, b = map(int, input().split())

# Check if a, b or their sum is divisible by 3
if a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0:
    print("Possible")
else:
    print("Impossible")
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks if any of them is divisible by 3 or if their sum is divisible by 3, and then prints "Possible" if either condition is true, otherwise it prints "Impossible".<｜end▁of▁sentence｜>
