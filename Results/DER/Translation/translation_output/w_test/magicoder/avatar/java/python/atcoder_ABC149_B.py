<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000 1000000000000 1000000000000

Expected output:
0 1000000000000

```
import java.util.*;

class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long A = Long.parseLong(stdIn.next());
        long B = Long.parseLong(stdIn.next());
        long K = Long.parseLong(stdIn.next());
        long n = A - K;
        
        if (A + B <= K) {
            System.out.println("0 0");
        } else if (n < 0) {
            System.out.println("0 " + (A + B - K));
        } else {
            System.out.println(n + " " + B);
        }
    }
}
```

@@ Response
```python
import sys

def main():
    A, B, K = map(int, sys.stdin.readline().split())
    n = A - K

    if A + B <= K:
        print("0 0")
    elif n < 0:
        print("0 " + str(A + B - K))
    else:
        print(str(n) + " " + str(B))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the difference between A and K, and then checks three conditions. If A + B is less than or equal to K, it prints "0 0". If n is less than 0, it prints "0 " followed by the difference between A + B and K. Otherwise, it prints n followed by B.<｜end▁of▁sentence｜>
