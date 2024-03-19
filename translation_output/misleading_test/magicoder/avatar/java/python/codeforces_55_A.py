<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
512

Expected output:
YGk

```
import java.util.*;

public class codeforces_55_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & (n - 1)) == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
```

@@ Response
Here is the equivalent Python code:

```python
def is_power_of_two(n):
    return n != 0 and ((n & (n - 1)) == 0)

n = int(input())

if is_power_of_two(n):
    print("YES")
else:
    print("NO")
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, checks if it's a power of two, and prints "YES" if it is and "NO" otherwise.<｜end▁of▁sentence｜>
