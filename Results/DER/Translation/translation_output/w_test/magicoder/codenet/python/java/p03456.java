<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 21

Expected output:
Yes


```
#!/usr/bin/python3
# -*- coding: utf-8 -*-

import sys
from math import sqrt

def main():
    a, b = sys.stdin.readline().split()
    n = int(a + b)
    sqrtn = int(sqrt(n))
    i = 1
    for i in range(1, sqrtn + 1):
        if i * i == n:
            print('Yes')
            break
    else:
        print('No')


if __name__ == '__main__':
    main()

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = a * 10 + b;
        int sqrtn = (int) Math.sqrt(n);
        boolean isPerfectSquare = false;
        for (int i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                isPerfectSquare = true;
                break;
            }
        }
        if (isPerfectSquare) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, concatenates them to form a number, calculates its square root, and then checks if any integer from 1 to the square root of the number is a perfect square. If it finds a perfect square, it prints "Yes"; otherwise, it prints "No".<｜end▁of▁sentence｜>
