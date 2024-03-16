<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
print ( chr ( ord ( input ( ) ) + 1 ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        char output = (char)(input + 1);
        System.out.println(output);
    }
}
```

This Java code does the same thing as the Python code you provided. It reads a character from the user, increments it by one, and then prints the result.
<|EOT|>
