<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9

Expected output:
34

```
import java.util.*;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i) != '0') {
                int sum = 0;
                for (int j = 0; j < n.length(); j++) {
                    sum += n.charAt(j) - '0';
                }
                System.out.println(sum);
                return;
            }
        }

        if (n.charAt(0) == '1') {
            System.out.println(10);
            return;
        }

        System.out.println(n.charAt(0));
    }
}
```

@@ Response
```python
n = int(input())

if n % 10 != 0:
    print(n)
elif n % 100 == 0:
    print(10)
else:
    print(n // 10)
```

This Python code does the same thing as the Java code. It reads an integer from the input, checks if it's divisible by 10, and if it is, it prints the integer divided by 10. If it's not divisible by 10, it prints the integer itself. If the integer is divisible by 100, it prints 10.<｜end▁of▁sentence｜>
