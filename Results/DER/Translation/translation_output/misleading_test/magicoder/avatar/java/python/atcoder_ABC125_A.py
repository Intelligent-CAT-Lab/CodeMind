<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 20 19

Expected output:
-46

```
import java.util.Scanner;

public class atcoder_ABC125_A {
    static long n, k, m, l, a, b, c;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        k = 0;
        for (int i = 1; i * a <= n; i++) {
            k += b;
        }
        System.out.println(k);
    }
}
```

@@ Response
```python
# Python code

# Read input
a, b, n = map(int, input().split())

# Initialize k
k = 0

# Calculate k
for i in range(1, n // a + 1):
    k += b

# Print k
print(k)
```

This Python code does the same thing as the Java code. It reads three integers from the input, calculates the sum of b for each integer i from 1 to n // a (inclusive), and then prints the result.<｜end▁of▁sentence｜>
