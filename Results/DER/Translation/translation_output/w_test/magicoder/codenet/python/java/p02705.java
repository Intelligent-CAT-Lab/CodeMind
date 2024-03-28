<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
6.28318530717958623200


```
print(int(input())*6.28)
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        double output = input * 6.28;
        System.out.println(output);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, multiplies it by 6.28, and then prints the result.<｜end▁of▁sentence｜>
