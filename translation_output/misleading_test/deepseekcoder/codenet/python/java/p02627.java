<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
B

Expected output:
A

```
n = input()

if n.isupper():
    print("A")
elif n.islower():
    print("a")
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        if (n.equals(n.toUpperCase())) {
            System.out.println("A");
        } else if (n.equals(n.toLowerCase())) {
            System.out.println("a");
        }
    }
}
```

This Java code reads a character from the standard input, checks if it's uppercase or lowercase, and prints "A" if it's uppercase and "a" if it's lowercase.
<|EOT|>
