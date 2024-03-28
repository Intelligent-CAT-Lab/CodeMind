<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import math

def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)

def main():
    W, H, C = map(int, input().split())
    WH = gcd(W, H)
    a = (W // WH) * (H // WH)
    print(a * C)

if __name__ == "__main__":
    main()
```

Explanation:

The `gcd` function is the same as the one in the Java code, it calculates the greatest common divisor of two numbers using the Euclidean algorithm.

The `main` function is the entry point of the program, it reads the input from the user, calculates the greatest common divisor of the width and height, and calculates the area of the rectangle using the formula `a = (W/WH) * (H/WH)`. Finally, it prints the result.

Note that in Python, the `//` operator is used for integer division, which returns the integer part of the result, while the `/` operator returns the floating-point result.</s>
