<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
internationalization

Expected output:
i18n


```
a,*b,c = input()
print(a+str(len(b))+c)

```

### Response:
Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String a = String.valueOf(input.charAt(0));
        String b = input.substring(1, input.length() - 1);
        String c = String.valueOf(input.charAt(input.length() - 1));
        System.out.println(a + b.length() + c);
    }
}
```

This Java code reads a string from the user, then separates it into three parts: the first character, the middle characters, and the last character. It then prints the first character, the length of the middle characters, and the last character, all concatenated together.
<|EOT|>
