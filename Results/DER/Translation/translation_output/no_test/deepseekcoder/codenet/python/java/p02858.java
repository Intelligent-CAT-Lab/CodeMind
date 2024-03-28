<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from fractions import gcd
H,W,T=map(int, input().split())
gh, gw = gcd(H, T), gcd(W, T)
h, w = H // gh, W // gw
MOD = 1000000007
print(pow(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3, gh * gw, MOD))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static long pow(long a, long b, long m) {
        long res = 1;
        a = a % m;
        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % m;
            b = b >> 1;
            a = (a * a) % m;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long H = scanner.nextLong();
        long W = scanner.nextLong();
        long T = scanner.nextLong();
        long gh = gcd(H, T);
        long gw = gcd(W, T);
        long h = H / gh;
        long w = W / gw;
        long MOD = 1000000007;
        System.out.println((pow(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3, gh * gw, MOD)));
    }
}
```

This Java code does the same thing as the Python code. It reads three long integers from the standard input, calculates the greatest common divisor (gcd) of the first two, and divides the third by the gcd to get the height and width of the grid. It then calculates the result using the formula from the Python code and prints it. The `pow` function is a modified version of the standard `Math.pow` function that works with moduli.
<|EOT|>
