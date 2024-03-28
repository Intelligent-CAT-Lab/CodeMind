<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoder

Expected output:
acdr>

```
s = input()
print(s[::2])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        System.out.println(result.toString());
    }
}
```

This Java code reads a string from the standard input, and then prints every second character of the string. The `StringBuilder` class is used to build the result string, because it is more efficient than using `+` to concatenate strings in a loop.
<|EOT|>
