<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = a + b;
        int sqrtn = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                System.out.println("Yes");
                break;
            }
        }
        if (i > sqrtn) {
            System.out.println("No");
        }
    }
}
```
Note: The code uses the `Scanner` class to read input from the user, and the `Math.sqrt()` method to calculate the square root of a number. The `for` loop is used to iterate from 1 to the square root of `n`, and the `if` statement is used to check if the current value of `i` is a perfect square. If a perfect square is found, the program prints "Yes" and exits the loop. If no perfect square is found, the program prints "No".</s>
