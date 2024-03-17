<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
sardine

Expected output:
xxxxxxx


```
import java.util.Scanner;

public class p02778 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            System.out.print("x");
        }

    }
}
```

@@ Response
```python
s = input()
print('x' * len(s))
```

In this Python code, we are taking the input string from the user and then printing 'x' for the length of the string. This is equivalent to the Java code where it prints 'x' for each character in the string.<｜end▁of▁sentence｜>
