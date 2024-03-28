<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import sys

input_string = sys.stdin.readline().strip()

if input_string == "A":
    print("T")
elif input_string == "T":
    print("A")
elif input_string == "C":
    print("G")
elif input_string == "G":
    print("C")
else:
    print("Invalid input")
```
Note: The `sys.stdin.readline()` method is used to read a line of input from the standard input stream. The `strip()` method is used to remove any leading or trailing whitespace from the input string. The `if-elif-else` statement is used to check the input string and print the corresponding output.</s>
