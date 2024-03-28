<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AtCoder Beginner Contest

Expected output:
AC

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
        System.out.println("A" + parts[1].charAt(0) + "C");
    }
}
```

This Java code reads a line of input from the user, splits it into parts using the space character as the delimiter, and then prints the first character of the second part of the input (which is the second word in the input) followed by "A" and "C".<｜end▁of▁sentence｜>
