<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

class p00356 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int p = 0;
        int a;
        int b;
        int z;
        int m;
        a = x;
        b = y;
        while (x % y != 0) {
            z = x;
            x = y;
            y = z % y;
        }
        m = a + b - y;

        if (a % 2 == 0 || b % 2 == 0 || a == b || a % 2 > 0 && b % 2 > 0) {
            System.out.println(m + 1);
        } else {
            System.out.println(m);
        }

    }
}


```

### Response:
```python
import sys

def gcd(x, y):
    while y:
        x, y = y, x % y
    return x

def main():
    x = int(sys.stdin.readline())
    y = int(sys.stdin.readline())
    p = 0
    a = x
    b = y
    m = a + b - gcd(a, b)

    if a % 2 == 0 or b % 2 == 0 or a == b or (a % 2 > 0 and b % 2 > 0):
        print(m + 1)
    else:
        print(m)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the greatest common divisor (gcd) of the two numbers using the Euclidean algorithm, and then prints the result. If the two numbers are even or if they are the same, it adds 1 to the result. If they are both odd, it leaves the result as is.
<|EOT|>
