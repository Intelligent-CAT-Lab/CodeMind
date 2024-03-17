<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 4

Expected output:
5


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
def gcd(x, y):
    while y:
        x, y = y, x % y
    return x

def solve(x, y):
    m = x + y - gcd(x, y)
    if x % 2 == 0 or y % 2 == 0 or x == y or (x % 2 > 0 and y % 2 > 0):
        return m + 1
    else:
        return m

x, y = map(int, input().split())
print(solve(x, y))
```

This Python code does the same thing as the Java code. It first calculates the greatest common divisor (gcd) of the two input numbers using the Euclidean algorithm. Then it calculates the result `m` as the sum of the two numbers minus the gcd. Finally, it prints `m + 1` if either `x` or `y` is even, or if `x` and `y` are the same, or if both `x` and `y` are odd. Otherwise, it prints `m`.
<|EOT|>
