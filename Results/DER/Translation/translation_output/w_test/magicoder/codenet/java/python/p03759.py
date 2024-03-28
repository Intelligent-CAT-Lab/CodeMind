<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 4 6

Expected output:
YES


```
import java.util.Scanner;

public class p03759 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a-b == b-c) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
```

@@ Response
```python
# Python code

# Read input from user
a, b, c = map(int, input().split())

# Check if difference between consecutive numbers is same
if a - b == b - c:
    print("YES")
else:
    print("NO")
```

This Python code does the same thing as the Java code. It reads three integers from the user, checks if the difference between the consecutive numbers is the same, and prints "YES" if it is, and "NO" otherwise.<｜end▁of▁sentence｜>
