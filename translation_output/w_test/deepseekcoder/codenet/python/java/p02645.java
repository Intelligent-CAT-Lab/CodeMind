<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
takahashi

Expected output:
tak


```
print(input()[:3])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input.substring(0, 3));
    }
}
```

This Java code reads a string from the standard input, and then prints the first three characters of that string. It uses the `substring` method of the `String` class to extract the first three characters.
<|EOT|>
