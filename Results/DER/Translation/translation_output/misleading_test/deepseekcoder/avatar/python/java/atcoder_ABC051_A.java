<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
pnxnn,muduhzn,aquud

Expected output:
FLxhm mMuduhzn Rj;uk

```
print ( input ( ) . replace ( " , " , " â " ) )


```

### Response:
Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String output = input.replace(",", " â ");
        System.out.println(output);
    }
}
```

This Java code reads a string from the user, replaces all occurrences of the comma character with " â " (a special character), and then prints the result.

Please note that the special character " â " is not a standard character in Java. It's a Unicode character. If you want to replace the comma with a standard character, you can replace " â " with ", " in the replace method.
<|EOT|>
