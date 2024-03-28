<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
public class p03085 {
  public static void main(String args[]) {
    final Scanner scanner = new Scanner(System.in);
    final String helix = scanner.next();
    scanner.close();
    switch(helix) {
      case "A":
        System.out.println("T");
        break;
      case "T":
        System.out.println("A");
        break;
      case "C":
        System.out.println("G");
        break;
      case "G":
        System.out.println("C");
        break;
    }
  }
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

helix = sys.stdin.readline().strip()

if helix == "A":
    print("T")
elif helix == "T":
    print("A")
elif helix == "C":
    print("G")
elif helix == "G":
    print("C")
```
This is the equivalent Python code for the given Java code. The `sys` module is used to read input from the standard input stream, and the `strip()` method is used to remove any trailing newline characters from the input string. The `if` statement is used to check the value of the `helix` variable and print the corresponding output.</s>
