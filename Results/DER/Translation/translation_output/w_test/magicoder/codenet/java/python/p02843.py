<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
615

Expected output:
1


```
import java.util.Scanner;

public class p02843 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 100 <= x / 100 * 5) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
```

@@ Response
```python
x = int(input())
if x % 100 <= x // 100 * 5:
    print(1)
else:
    print(0)
```

In Python, the equivalent code would be:

```python
x = int(input())
if x % 100 <= x // 100 * 5:
    print(1)
else:
    print(0)
```

This Python code does the same thing as the Java code. It reads an integer from the user, checks if the last two digits are less than or equal to half of the first two digits, and prints 1 if it is, and 0 otherwise.<｜end▁of▁sentence｜>
