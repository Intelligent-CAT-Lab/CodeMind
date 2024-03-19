<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CODE=

```
print(str(input())[:-8])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input.substring(0, input.length() - 8));
    }
}
```

In this Java code, we use the `Scanner` class to read the input string. Then we use the `substring` method to get a substring of the input string from the start to the 8th last character. The `length()` method is used to get the length of the input string.
<|EOT|>
