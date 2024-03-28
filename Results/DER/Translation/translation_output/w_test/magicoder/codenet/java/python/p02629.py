<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
b


```
import java.util.Scanner;

public class p02629 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long x;
        long y;
        char[] out = new char[11];  // 1000000000000001 <= 26^10ã¨ã¡ãã£ã¨ãããï¼ãªã®ã§11æ¡

        for (int i = 0; i < 11; i++) {
            N = N - 1;  // 
            x = N / 26;
            y = N % 26;
            out[i] = (char) ('a' + y);
            if (x == 0) {
                break;
            }
            N = x;
        }

        for (int i = 10; i >= 0; i--) {
            if (out[i] == Character.MIN_VALUE) {
                continue;
            }
            System.out.print(out[i]);
        }
    }
}
```

@@ Response
```python
def convert_to_title(n):
    n -= 1
    out = []
    while n >= 0:
        n, y = divmod(n, 26)
        out.append(chr(y + ord('a')))
        if n == 0:
            break
    return ''.join(out[::-1])

n = int(input())
print(convert_to_title(n))
```

This Python code does the same thing as the Java code. It converts a number to a string representation of a column title in Excel. The conversion is done by repeatedly dividing the number by 26 and appending the corresponding letter to the output string. The remainder of the division is used to determine the letter, and the quotient is used for the next iteration. The loop continues until the number becomes 0. The output string is then reversed and printed.<｜end▁of▁sentence｜>
