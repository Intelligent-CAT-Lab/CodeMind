<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
180


```
n = int(input())
s = 180 * (n - 2)
print(s)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 180 * (n - 2);
        System.out.println(s);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, calculates the result as 180 times the difference between the input and 2, and then prints the result.<｜end▁of▁sentence｜>
