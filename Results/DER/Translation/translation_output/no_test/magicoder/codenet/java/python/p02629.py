<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    N = int(sys.stdin.readline())
    out = [0] * 11
    for i in range(11):
        N -= 1
        x = N // 26
        y = N % 26
        out[i] = chr(ord('a') + y)
        if x == 0:
            break
        N = x
    for i in range(10, -1, -1):
        if out[i] == 0:
            continue
        sys.stdout.write(out[i])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a number from the standard input, converts it to a base-26 number, and then prints the result. The Python version uses the `sys.stdin.readline()` function to read the input and `sys.stdout.write()` to print the output. The `chr()` and `ord()` functions are used to convert between characters and their ASCII values.<｜end▁of▁sentence｜>
