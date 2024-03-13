<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(x-a) < Math.abs(x-b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
```

@@ Response
```python
import sys

def main():
    x = int(sys.stdin.readline())
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    if abs(x-a) < abs(x-b):
        print("A")
    else:
        print("B")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, and then prints "A" if the absolute difference between `x` and `a` is less than the absolute difference between `x` and `b`, and "B" otherwise.<｜end▁of▁sentence｜>
