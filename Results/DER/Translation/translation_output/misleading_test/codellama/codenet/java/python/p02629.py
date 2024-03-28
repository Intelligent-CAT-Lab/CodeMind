<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
(b

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
[/INST]
```python
import math

def convert_to_base_26(n):
    out = []
    while n > 0:
        n, r = divmod(n, 26)
        out.append(chr(ord('a') + r))
    return ''.join(reversed(out))

def main():
    n = int(input())
    print(convert_to_base_26(n))

if __name__ == '__main__':
    main()
```
This code uses the `divmod` function to divide the input number by 26 and get the remainder, which is then converted to a character using the `chr` function. The resulting characters are then appended to a list, and the list is reversed and joined to form the final output.

The `convert_to_base_26` function takes an integer `n` as input and returns a string representing the number in base 26.

The `main` function takes an integer `n` as input, converts it to base 26 using the `convert_to_base_26` function, and prints the result.

The `if __name__ == '__main__':` block is used to indicate that the `main` function should be executed when the script is run as a standalone program.</s>
