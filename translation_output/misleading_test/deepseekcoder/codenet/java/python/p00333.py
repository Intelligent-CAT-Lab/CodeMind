<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 20 5

Expected output:
-5

```

import java.util.Scanner;

class p00333 {

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int WH = gcd(W, H);
        int C = sc.nextInt();

        
        int a = (W/WH)*(H/WH);
        
        System.out.println(a*C);
    }
}

```

### Response:
```python
import math

def gcd(x, y):
    while(y):
        x, y = y, x % y
    return x

def main():
    W, H, C = map(int, input().split())
    WH = gcd(W, H)
    a = (W//WH)*(H//WH)
    print(a*C)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the input, calculates the greatest common divisor (gcd) of the first two, divides the area of the rectangle by the gcd, and then multiplies the result by the third integer. The `//` operator is used for integer division in Python.
<|EOT|>
