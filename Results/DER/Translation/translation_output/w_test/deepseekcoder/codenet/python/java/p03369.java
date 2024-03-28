<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oxo

Expected output:
900


```
s = input()
print(700+100*s.count("o"))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'o') {
                count++;
            }
        }
        System.out.println(700 + 100 * count);
    }
}
```

This Java code reads a string from the standard input, counts the number of 'o' characters in it, and then prints the result of the calculation `700 + 100 * count`.
<|EOT|>
