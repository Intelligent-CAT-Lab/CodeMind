<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
A

Expected output:
T


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
helix = input()

if helix == "A":
    print("T")
elif helix == "T":
    print("A")
elif helix == "C":
    print("G")
elif helix == "G":
    print("C")
```

This Python code does the same thing as the Java code. It reads a single character from the user input, and then prints the complementary nucleotide. If the input is "A", it prints "T", if it's "T" it prints "A", if it's "C" it prints "G", and if it's "G" it prints "C".<｜end▁of▁sentence｜>
