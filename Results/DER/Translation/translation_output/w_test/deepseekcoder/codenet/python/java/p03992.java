<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CODE FESTIVAL


```
s = input()
print(s[:4] + ' ' + s[4:])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s.substring(0, 4) + ' ' + s.substring(4));
    }
}
```

This Java code reads a string from the standard input, and then prints the string with a space inserted between the first four characters and the rest of the string.
<|EOT|>
