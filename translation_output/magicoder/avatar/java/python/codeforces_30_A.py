<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    A = int(sys.stdin.readline())
    B = int(sys.stdin.readline())
    N = int(sys.stdin.readline())

    for x in range(-1000, 1001):
        if pow(x, N) * A == B:
            print(x)
            return

    print("No solution")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, then it tries to find an integer `x` in the range from -1000 to 1000 such that `x^N * A = B`. If it finds such an `x`, it prints it; otherwise, it prints "No solution".<｜end▁of▁sentence｜>
