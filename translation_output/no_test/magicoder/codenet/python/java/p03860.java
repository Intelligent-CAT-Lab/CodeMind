<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
A,x,C=input().split()
print("A"+x[0]+"C")

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        if (parts.length == 3) {
            String A = parts[0];
            String x = parts[1];
            String C = parts[2];
            System.out.println(A.charAt(0) + x + C.charAt(0));
        }
    }
}
```

This Java code reads a line of input from the user, splits it into three parts using the space character as a delimiter, and then prints the first character of the first part, followed by the second part, and finally the first character of the third part.<｜end▁of▁sentence｜>
