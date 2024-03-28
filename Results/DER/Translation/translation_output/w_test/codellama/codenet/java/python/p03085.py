<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import sys

def main():
    helix = sys.stdin.readline().strip()
    if helix == "A":
        print("T")
    elif helix == "T":
        print("A")
    elif helix == "C":
        print("G")
    elif helix == "G":
        print("C")
    else:
        print("Invalid input")

if __name__ == "__main__":
    main()
```
Note: The `sys.stdin.readline()` method is used to read a line of input from the standard input stream. The `strip()` method is used to remove any trailing newline characters from the input. The `if __name__ == "__main__":` block is used to indicate that the `main()` function should be executed when the script is run as a standalone program.</s>
