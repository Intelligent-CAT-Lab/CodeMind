<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), i = 1;
        for (; i * (i + 1) / 2 < x; i++) {}
        System.out.println(i);
    }
}
```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    x = int(sys.stdin.readline())
    i = 1
    while i * (i + 1) // 2 < x:
        i += 1
    print(i)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then finds the smallest integer `i` such that `i * (i + 1) / 2 >= x`. The `//` operator is used for integer division in Python.<｜end▁of▁sentence｜>
