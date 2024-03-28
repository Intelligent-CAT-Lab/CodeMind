<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
-2

```
n = int(input())
a = (n+1)/2
print(int(a))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (n + 1) / 2;
        System.out.println(a);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, calculates the result, and then prints it. The `Scanner` class is used to read the input from the user.<｜end▁of▁sentence｜>
