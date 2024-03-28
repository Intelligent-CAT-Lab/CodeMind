<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

s = sys.stdin.readline().strip()
if len(s) < 4:
    print("No")
    return
s2 = s[:4]
if s2 == "YAKI":
    print("Yes")
else:
    print("No")
```
Note: The `sys.stdin.readline()` method is used to read a line from the standard input, and the `strip()` method is used to remove any trailing whitespace from the input string. The `[:4]` syntax is used to get the first 4 characters of the string.</s>
