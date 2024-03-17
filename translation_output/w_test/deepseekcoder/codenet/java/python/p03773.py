<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9 12

Expected output:
21


```
import java.util.Scanner;
public class p03773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int ans = A + B > 23 ? A + B - 24 : A + B;
        System.out.println(ans);
    }
}

```

### Response:
```python
def p03773():
    A, B = map(int, input().split())

    ans = (A + B) % 24
    print(ans)

p03773()
```

This Python code does the same thing as the Java code. It reads two integers from the input, adds them together, and then prints the result modulo 24. This is equivalent to the Java code's calculation of the sum of the two numbers, subtracting 24 if the result is greater than 23, and otherwise keeping the result as is.
<|EOT|>
