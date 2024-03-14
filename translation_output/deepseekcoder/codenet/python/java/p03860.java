<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
A,x,C=input().split()
print("A"+x[0]+"C")

```

### Response:
Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        if (parts.length == 3) {
            System.out.println("A" + parts[1].charAt(0) + "C");
        }
    }
}
```

This Java code reads a line of input from the user, splits it into parts based on spaces, and then prints "A" followed by the first character of the second part of the input, and then "C". If the input does not have exactly two spaces, it does nothing.
<|EOT|>
