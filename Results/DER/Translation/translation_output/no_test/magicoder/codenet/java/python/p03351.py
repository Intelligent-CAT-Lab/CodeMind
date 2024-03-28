<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03351{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int ab = Math.abs(a-b);
        int ac = Math.abs(a-c);
        int bc = Math.abs(b-c);
        if(ac <= d || (ab <= d && bc <= d)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
```

@@ Response
```python
import sys

def main():
    a, b, c, d = map(int, sys.stdin.readline().split())
    ab = abs(a - b)
    ac = abs(a - c)
    bc = abs(b - c)
    if ac <= d or (ab <= d and bc <= d):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, calculates the absolute differences between the first three integers, and checks if either the absolute difference between the first two integers is less than or equal to `d`, or if the absolute differences between the first and second, and the first and third integers are less than or equal to `d`. If either of these conditions is true, it prints "Yes"; otherwise, it prints "No".<｜end▁of▁sentence｜>
