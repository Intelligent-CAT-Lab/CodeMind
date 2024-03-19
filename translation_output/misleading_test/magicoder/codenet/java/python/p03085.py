<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
A

Expected output:


```
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
```

@@ Response
```python
import sys

def complement(helix):
    if helix == "A":
        return "T"
    elif helix == "T":
        return "A"
    elif helix == "C":
        return "G"
    elif helix == "G":
        return "C"

helix = sys.stdin.readline().strip()
print(complement(helix))
```

In this Python code, we define a function `complement` that takes a helix as input and returns its complement. We then read the helix from standard input, strip any trailing newline characters, and print the complement of the helix.<｜end▁of▁sentence｜>
