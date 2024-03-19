<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
c

Expected output:
]d

```
print ( chr ( ord ( input ( ) ) + 1 ) )


```

### Response:
Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        System.out.println((char)(c + 1));
    }
}
```

This Java program reads a character from the standard input, increments it by one, and then prints the result. The `Scanner` class is used to read the input, and the `charAt(0)` method is used to get the first character of the input string. The `(char)(c + 1)` expression increments the character by one.
<|EOT|>
