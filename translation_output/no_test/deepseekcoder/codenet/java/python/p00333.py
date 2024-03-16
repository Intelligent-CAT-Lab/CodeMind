<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import math

def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)

W = int(input())
H = int(input())
C = int(input())

WH = math.gcd(W, H)

a = (W//WH)*(H//WH)

print(a*C)
```

In this Python code, we use the built-in `math.gcd()` function to calculate the greatest common divisor (gcd) of `W` and `H`. The `//` operator is used for integer division in Python.
<|EOT|>
