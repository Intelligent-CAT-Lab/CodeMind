<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def complement_base(base):
    switch = {
        'A': 'T',
        'T': 'A',
        'C': 'G',
        'G': 'C'
    }
    return switch.get(base, "Invalid base")

if __name__ == "__main__":
    helix = sys.stdin.readline().strip()
    print(complement_base(helix))
```

In this Python code, we define a function `complement_base` that takes a base as input and returns its complement. We use a dictionary `switch` to map each base to its complement. If the base is not one of the four DNA bases, the function returns "Invalid base". The main part of the code reads a line from standard input, strips any trailing newline characters, and passes it to `complement_base`, printing the result.
<|EOT|>
