<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
print ( input ( ) . replace ( " , " , " â " ) )


```

### Response:
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace(", ", " â ");
        System.out.println(output);
    }
}
```

This Java code does the same thing as the Python code you provided. It reads a line of input from the user, replaces all occurrences of ", " with " â ", and then prints the result.
<|EOT|>
