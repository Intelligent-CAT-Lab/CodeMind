<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
YAKINIKU

Expected output:
Yes


```
import java.util.*;
import java.util.Scanner;

public class p03591 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    if(s.length() < 4) {
      System.out.println("No");
      return;
    }
    String s2 = s.substring(0, 4);
    if(s2.equals( "YAKI"))System.out.println("Yes");
    else System.out.println("No");

  }
}

```

@@ Response
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    if len(s) < 4:
        print("No")
        return
    s2 = s[:4]
    if s2 == "YAKI":
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, checks if its length is less than 4, and if so, prints "No". If the length is at least 4, it extracts the first four characters and checks if they are equal to "YAKI". If they are, it prints "Yes", otherwise it prints "No".<｜end▁of▁sentence｜>
