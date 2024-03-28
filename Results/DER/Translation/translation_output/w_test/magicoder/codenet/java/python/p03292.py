<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 6 3

Expected output:
5


```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class p03292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int R = sc.nextInt();
        int Y = sc.nextInt();

        int A = Math.max(Math.max(T,R),Y);
        int B = Math.min(Math.min(T,R),Y);

        System.out.println(A-B);
    }
}

```

@@ Response
```python
import sys

def main():
    T, R, Y = map(int, sys.stdin.readline().split())

    A = max(T, R, Y)
    B = min(T, R, Y)

    print(A - B)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, finds the maximum and minimum of these integers, and then prints the difference between the maximum and minimum.<｜end▁of▁sentence｜>
