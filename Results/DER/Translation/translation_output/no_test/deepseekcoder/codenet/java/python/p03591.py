<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
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

This Python code does the same thing as the Java code. It reads a string from the standard input, checks if its length is less than 4, and if so, prints "No" and returns. If the string's length is 4 or more, it checks if the first 4 characters of the string are "YAKI", and prints "Yes" if they are, "No" if they aren't.
<|EOT|>
