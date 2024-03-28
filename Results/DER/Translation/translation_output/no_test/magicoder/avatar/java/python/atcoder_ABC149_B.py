<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the difference between A and K, and then prints the appropriate output based on the conditions in the Java code.<｜end▁of▁sentence｜>
