<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
+-++

Expected output:
2


```
a=input()
e=a.count("+")
f=a.count("-")
print(e-f)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int plusCount = 0;
        int minusCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+') {
                plusCount++;
            } else if (input.charAt(i) == '-') {
                minusCount++;
            }
        }
        System.out.println(plusCount - minusCount);
    }
}
```

This Java code reads a line of input from the user, then iterates over each character in the string. If the character is '+', it increments the `plusCount` variable. If the character is '-', it increments the `minusCount` variable. Finally, it prints the difference between `plusCount` and `minusCount`.
<|EOT|>
