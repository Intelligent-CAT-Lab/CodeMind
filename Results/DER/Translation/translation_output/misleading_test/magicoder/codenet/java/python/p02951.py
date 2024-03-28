<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 4 3

Expected output:
38

```
import java.util.*;

public class p02951 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          if(b + c < a){
              System.out.println(0);
          } else {
            System.out.println(b + c - a);
          }
        }
    }
```

@@ Response
```python
# Python code

# Read input from user
a, b, c = map(int, input().split())

# Check if the sum of b and c is less than a
if b + c < a:
    print(0)
else:
    print(b + c - a)
```

This Python code does the same thing as the Java code. It reads three integers from the user, checks if the sum of the second and third integers is less than the first, and if so, prints 0. Otherwise, it prints the difference between the sum of the second and third integers and the first integer.<｜end▁of▁sentence｜>
