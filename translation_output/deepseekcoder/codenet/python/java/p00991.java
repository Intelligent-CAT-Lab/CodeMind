<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from math import factorial
def comb (x,y):
	return factorial(x)//factorial(x-y)//factorial(y)

w,h,ax,ay,bx,by=map(int,input().split())
dx=min(w-abs(ax-bx),abs(ax-bx))
dy=min(h-abs(ay-by),abs(ay-by))
ans=1
if dx*2==w:ans*=2
if dy*2==h:ans*=2
ans*=comb(dx+dy,dx)
print(ans%100000007)
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int ax = scanner.nextInt();
        int ay = scanner.nextInt();
        int bx = scanner.nextInt();
        int by = scanner.nextInt();
        scanner.close();

        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));
        long ans = 1;
        if (dx * 2 == w) ans *= 2;
        if (dy * 2 == h) ans *= 2;
        ans *= comb(dx + dy, dx);
        System.out.println(ans % 100000007);
    }

    static long comb(int x, int y) {
        long numerator = 1, denominator = 1;
        for (int i = 1; i <= y; i++) {
            numerator *= x--;
            denominator *= i;
        }
        return numerator / denominator;
    }
}
```

This Java code does the same thing as your Python code. It reads the input, calculates the `dx` and `dy`, and then calculates the combination `comb(dx + dy, dx)`. The result is then printed modulo `100000007`.

The `comb` function is a Java implementation of the combination formula `nCr = n! / (r!(n-r)!)`. It uses a loop to calculate the numerator and denominator, which is equivalent to the Python code using the `//` operator.
<|EOT|>
