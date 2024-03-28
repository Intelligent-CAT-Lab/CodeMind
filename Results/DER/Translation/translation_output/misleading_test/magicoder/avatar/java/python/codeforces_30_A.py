<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 896 7

Expected output:
13

```
import java.math.BigInteger;
import java.util.Scanner;

public class codeforces_30_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int N = in.nextInt();
        BigInteger bigA = BigInteger.valueOf(A);
        BigInteger bigB = BigInteger.valueOf(B);
        
        for (int x = -1000; x <= 1000; x++) {
            if (BigInteger.valueOf(x).pow(N).multiply(bigA).equals(bigB)) {
                System.out.println(x);
                return;
            }
        }
        
        System.out.println("No solution");
    }
}
```

@@ Response
```python
import sys

def solve(A, B, N):
    for x in range(-1000, 1001):
        if pow(x, N) * A == B:
            return x
    return "No solution"

if __name__ == "__main__":
    A, B, N = map(int, sys.stdin.readline().split())
    print(solve(A, B, N))
```

This Python code reads the input from the standard input (stdin), splits it into three integers, and passes them to the `solve` function. The `solve` function iterates over the range from -1000 to 1000, checks if the current number raised to the power of N times A equals B, and if so, returns the number. If no such number is found, it returns "No solution".<｜end▁of▁sentence｜>
