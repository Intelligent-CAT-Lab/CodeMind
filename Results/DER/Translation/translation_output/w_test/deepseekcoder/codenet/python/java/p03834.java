<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
happy,newyear,enjoy

Expected output:
happy newyear enjoy


```
s = input()
print(s.replace(",", " "))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.replace(",", " "));
    }
}
```

This Java code reads a line of input from the user, replaces all commas with spaces, and then prints the result. It uses the `replace` method of the `String` class to do the replacement.
<|EOT|>
