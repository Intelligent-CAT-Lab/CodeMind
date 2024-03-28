<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
615

Expected output:
27

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

In the Python version, we use the `input()` function to get the user input, which is equivalent to `sc.nextInt()` in the Java version. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java. The `%` operator is used for modulus operation, which is equivalent to `%` in Java. The `print()` function is used to output the result, which is equivalent to `System.out.println()` in Java.<｜end▁of▁sentence｜>
