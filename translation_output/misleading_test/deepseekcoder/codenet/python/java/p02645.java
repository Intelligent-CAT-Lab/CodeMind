<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
takahashi

Expected output:
t>z

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

This Java code reads a string from the standard input, and then prints the first three characters of the string. The `substring` method is used to extract a part of the string. The first parameter is the start index (inclusive) and the second parameter is the end index (exclusive). In this case, we start at index 0 and end at index 3, so it prints the first three characters of the string.
<|EOT|>
