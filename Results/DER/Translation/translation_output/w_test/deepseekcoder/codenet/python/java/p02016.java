<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ani

Expected output:
square1001


```
print('square1001' if input()=='ani' else 'e869120')


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input.equals("ani") ? "square1001" : "e869120");
    }
}
```

This Java code reads a string from the standard input, checks if it's equal to "ani", and prints "square1001" if it is, otherwise it prints "e869120".
<|EOT|>
