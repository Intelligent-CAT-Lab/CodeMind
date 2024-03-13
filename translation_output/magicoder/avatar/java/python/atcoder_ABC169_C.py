<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        long c = (long) Math.round(b * 100);
        long d = a * c;
        System.out.println(d / 100);
    }
}
```

@@ Response
```python
import sys

def main():
    a = int(sys.stdin.readline())
    b = float(sys.stdin.readline())
    c = round(b * 100)
    d = a * c
    print(d // 100)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two numbers from the standard input, multiplies them, and then prints the result. The only difference is that Python uses `sys.stdin.readline()` to read input instead of `Scanner`. The `//` operator is used for integer division in Python.<｜end▁of▁sentence｜>
