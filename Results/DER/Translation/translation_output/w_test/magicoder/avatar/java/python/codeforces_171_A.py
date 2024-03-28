<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
35005211 521595368

Expected output:
898600336


```
import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ans = getNum(a, b);
        System.out.println(ans);
    }

    public static int getNum(int a, int b) {
        int reverseB = 0;
        while (b > 0) {
            reverseB = reverseB * 10 + b % 10;
            b /= 10;
        }
        return a + reverseB;
    }
}
```

@@ Response
```python
def get_num(a, b):
    reverse_b = 0
    while b > 0:
        reverse_b = reverse_b * 10 + b % 10
        b //= 10
    return a + reverse_b

a, b = map(int, input().split())
print(get_num(a, b))
```

This Python code does the same thing as the Java code. It reads two integers from the input, reverses the second integer, and then adds the two integers together. The `map(int, input().split())` line reads two integers from the input, and the `print(get_num(a, b))` line prints the result.<｜end▁of▁sentence｜>
