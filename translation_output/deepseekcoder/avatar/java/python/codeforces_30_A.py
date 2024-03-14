<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
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

This Python code does the same thing as the Java code. It reads three integers from the standard input, then it iterates over the range from -1000 to 1000, checking if `x^N * A` equals `B`. If it does, it prints `x` and returns. If it doesn't find a solution in this range, it prints "No solution".
<|EOT|>
