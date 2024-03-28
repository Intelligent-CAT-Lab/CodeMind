<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9 12

Expected output:
73

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
```python
# Python code

# Read input from user
A, B = map(int, input().split())

# Calculate the sum
ans = (A + B) % 24

# Print the result
print(ans)
```

In the Java code, the ternary operator ```A + B > 23 ? A + B - 24 : A + B``` is used to subtract 24 from the sum if it is greater than 23. In the Python code, the modulo operator ```(A + B) % 24``` is used to achieve the same result.<｜end▁of▁sentence｜>
