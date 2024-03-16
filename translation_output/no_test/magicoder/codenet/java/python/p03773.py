<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int ans = A + B > 23 ? A + B - 24 : A + B;
        System.out.println(ans);
    }
}

```

@@ Response
Here is the equivalent Python code:

```python
# Python does not require importing libraries like Java

# Python does not have a direct equivalent to Java's Scanner class
# Instead, we use the built-in function input() to get user input

A = int(input())
B = int(input())

# Python does not have a ternary operator like Java
# Instead, we use the if-else construct

ans = A + B if A + B <= 23 else A + B - 24
print(ans)
```

Please note that Python does not require importing libraries like Java, and it does not have a direct equivalent to Java's Scanner class. Instead, we use the built-in function input() to get user input. Python also does not have a ternary operator like Java, so we use the if-else construct.<｜end▁of▁sentence｜>
