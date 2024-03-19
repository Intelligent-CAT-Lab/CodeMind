<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
YAKINIKU

Expected output:
"&s

```
S = input()
print('Yes' if S[:4] == 'YAKI' else 'No')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        System.out.println(S.substring(0, 4).equals("YAKI") ? "Yes" : "No");
    }
}
```

This Java code reads a string `S` from the standard input, checks if the first four characters of `S` are "YAKI", and prints "Yes" if they are, "No" otherwise.
<|EOT|>
