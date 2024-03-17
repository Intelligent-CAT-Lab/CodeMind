<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oxxoxoo

Expected output:
o


```
s = raw_input()
print 'x' if s[0]=='x' and s[-1]=='x' else 'o'
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.charAt(0) == 'x' && s.charAt(s.length() - 1) == 'x') {
            System.out.println('x');
        } else {
            System.out.println('o');
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, checks if the first and last characters are 'x', and prints 'x' if they are, 'o' otherwise.
<|EOT|>
