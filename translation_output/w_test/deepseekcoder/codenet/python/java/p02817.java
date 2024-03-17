<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oder atc

Expected output:
atcoder


```
S, T = input().split()

print(T + S)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();

        System.out.println(T + S);
    }
}
```

This Java code reads two strings from the standard input, concatenates them in the order T, S, and prints the result.
<|EOT|>
