<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03524 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int a = 0, b = 0, c = 0;
    for (int i = 0; i < S.length(); i++) {
      char x = S.charAt(i);
      if (x == 'a') a++;
      if (x == 'b') b++;
      if (x == 'c') c++;
    }
    if (Math.max(Math.max(a,b),c)-Math.min(Math.min(a,b),c) <= 1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    } 
  }
}

```

@@ Response
```python
import sys

def main():
    S = sys.stdin.readline().strip()
    a = S.count('a')
    b = S.count('b')
    c = S.count('c')
    if max(a, b, c) - min(a, b, c) <= 1:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, counts the occurrences of 'a', 'b', and 'c', and then checks if the difference between the maximum and minimum counts is at most 1. If it is, it prints "YES"; otherwise, it prints "NO".<｜end▁of▁sentence｜>
