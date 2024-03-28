<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import math

def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)

def main():
    W, H = map(int, input().split())
    WH = math.gcd(W, H)
    C = int(input())

    a = (W//WH)*(H//WH)

    print(a*C)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It calculates the greatest common divisor (gcd) of two numbers using the Euclidean algorithm, then it calculates the number of squares that can be fit into a rectangle of given width and height, and finally it prints the result of the multiplication of the number of squares and the cost of one square.<｜end▁of▁sentence｜>
