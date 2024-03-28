<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
59 96

Expected output:
96 154 -55

```
import java.io.*;
import java.util.*;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n == 0) {
            if (m != 0)
                System.out.println("Impossible");
            else
                System.out.println(0 + " " + 0);
            return;
        }

        if (m <= n) {
            if (m == 0) {
                m = 1;
            }
            System.out.print(n + " " + (m + n - 1));
            return;
        }

        System.out.print(m + " " + (m + n - 1));
    }
}
```

### Response:
```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())

    if n == 0:
        if m != 0:
            print("Impossible")
        else:
            print(0, 0)
        return

    if m <= n:
        if m == 0:
            m = 1
        print(n, m + n - 1)
        return

    print(m, m + n - 1)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, and then prints out the result based on the conditions in the Java code. If the input is 0 0, it prints 0 0. If the input is 0 n, it prints n 1. If the input is n m, where m <= n, it prints n m+n-1. If the input is n m, where m > n, it prints m m+n-1.
<|EOT|>
