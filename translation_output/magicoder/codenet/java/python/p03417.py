<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03417 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();
        final long M = sc.nextLong();

        System.out.println(Math.abs((N-2) * (M-2)));
    }
}

```

@@ Response
```python
import sys

def main():
    N, M = map(int, sys.stdin.readline().split())
    print(abs((N-2) * (M-2)))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the absolute value of the product of the difference between the input numbers and 2, and prints the result.<｜end▁of▁sentence｜>
