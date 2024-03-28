<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
abcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcd

```
import java.util.Scanner;

public class codeforces_110_B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println('a');
        } else if (n == 2) {
            System.out.println("ab");
        } else if (n == 3) {
            System.out.println("abc");
        } else {
            for (int i = 0; i < n / 4; i++) {
                System.out.print("abcd");
            }
            int t = n % 4;
            if (t == 1) {
                System.out.println('a');
            } else if (t == 2) {
                System.out.println("ab");
            } else if (t == 3) {
                System.out.println("abc");
            }
        }
    }
}
```

@@ Response
```python
n = int(input())

if n == 1:
    print('a')
elif n == 2:
    print('ab')
elif n == 3:
    print('abc')
else:
    for i in range(n // 4):
        print('abcd', end='')
    t = n % 4
    if t == 1:
        print('a')
    elif t == 2:
        print('ab')
    elif t == 3:
        print('abc')
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, and then prints a string of 'a', 'ab', 'abc', or 'abcd' repeated a certain number of times, followed by a single character if the input number is not a multiple of 4.<｜end▁of▁sentence｜>
