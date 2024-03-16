<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        for (int i = 0; i < 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```

@@ Response
```python
import sys

def main():
    r = int(sys.stdin.readline())
    d = int(sys.stdin.readline())
    x = int(sys.stdin.readline())

    for _ in range(10):
        x = r * x - d
        print(x)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, then calculates and prints the sequence defined by the formula `x[i+1] = r * x[i] - d`, where `x[i]` is the `i`-th term of the sequence. The sequence is printed for 10 iterations.<｜end▁of▁sentence｜>
