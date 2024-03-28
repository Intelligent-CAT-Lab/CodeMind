<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
the cost of one peach is higher than that of one apple.

Expected output:
the cost of one apple is higher than that of one peach.


```
import re
print(re.sub(r"(apple|peach)", lambda m: ["apple","peach"][m.group(0)=="apple"], input()))

```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace("apple", "temp").replace("peach", "apple").replace("temp", "peach");
        System.out.println(output);
    }
}
```

This Java code reads a line of input from the user, then replaces "apple" with "temp", "peach" with "apple", and finally "temp" with "peach". The result is printed to the console.

Please note that this is a simple and straightforward way to solve the problem. In a real-world scenario, you would likely want to use a more sophisticated approach, such as regular expressions, to handle the substitution.<｜end▁of▁sentence｜>
