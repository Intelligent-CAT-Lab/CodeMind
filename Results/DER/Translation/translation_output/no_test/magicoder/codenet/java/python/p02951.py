<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02951 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          if(b + c < a){
              System.out.println(0);
          } else {
            System.out.println(b + c - a);
          }
        }
    }
```

@@ Response
```python
import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    c = int(sys.stdin.readline())
    if b + c < a:
        print(0)
    else:
        print(b + c - a)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, checks if the sum of the second and third integers is less than the first one, and prints the result accordingly.<｜end▁of▁sentence｜>
