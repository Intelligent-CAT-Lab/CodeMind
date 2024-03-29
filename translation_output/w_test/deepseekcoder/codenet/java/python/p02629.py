<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def convert_to_title(n):
    n -= 1
    out = []
    while n >= 0:
        n, remainder = divmod(n, 26)
        out.append(chr(ord('a') + remainder))
    return ''.join(out[::-1])

print(convert_to_title(int(input())))
```

This Python code does the same thing as the Java code. It reads an integer from the input, subtracts 1 from it, and then converts this number to the corresponding Excel column title. The Excel column titles are generated by converting the numbers 0-25 to the characters 'a'-'z'. The conversion is done by taking the remainder of the division of the number by 26, and then adding the ASCII value of 'a' to this remainder. The result is the corresponding character. The characters are appended to a list in reverse order, and then joined into a string to get the final result.
<|EOT|>
