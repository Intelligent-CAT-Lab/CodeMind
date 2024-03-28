<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ABA

Expected output:
Ye

```
S = str(input())

if S == 'AAA' or S == 'BBB':
    print('No')
else:
    print('Yes')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        if (S.equals("AAA") || S.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        scanner.close();
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, checks if it is either "AAA" or "BBB", and prints "No" if it is, and "Yes" otherwise.
<|EOT|>
