<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
pnxnn,muduhzn,aquud

Expected output:
pnxnn muduhzn aquud


```
print ( input ( ) . replace ( " , " , " â " ) )


```

### Response:
Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.replace(", ", " "));
    }
}
```

This Java code reads a line of input from the user, replaces all occurrences of ", " with a space, and then prints the result.
<|EOT|>
