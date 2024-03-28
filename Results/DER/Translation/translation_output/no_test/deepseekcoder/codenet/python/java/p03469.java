<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
print('2018'+input()[4:])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("2018" + input.substring(4));
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, takes the substring from the 5th character to the end, and then appends it to "2018".
<|EOT|>
