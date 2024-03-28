<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 4

Expected output:
78

```
import java.util.Scanner;
public class p02783 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in) ) {
            String[] line = sc.nextLine().split(" ");

            int h = Integer.valueOf(line[0]);
            int a = Integer.valueOf(line[1]);

            int n = h/a;
            if (h%a > 0) {
                n += 1;
            }

            // åºå
            System.out.println(n);
        }
    }
}
```

@@ Response
```python
# Python code

# Read input
h, a = map(int, input().split())

# Calculate number of days
n = h // a
if h % a > 0:
    n += 1

# Print result
print(n)
```

This Python code does the same thing as the Java code. It reads two integers from the input, calculates the number of days, and prints the result. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java but rounds down to the nearest integer. The `%` operator is used for modulo division, which gives the remainder of the division.<｜end▁of▁sentence｜>
