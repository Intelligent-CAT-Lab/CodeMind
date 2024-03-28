<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1900

Expected output:
102

```
n=int(input())
print(1000-n%1000 if n%1000!=0 else 0)
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 1000 != 0) {
            System.out.println(1000 - n % 1000);
        } else {
            System.out.println(0);
        }
    }
}
```

You can test this code with the following test case:

Test input:
1900

Expected output:
102

This Java code reads an integer from the standard input, checks if it is not divisible by 1000, and if it is not, it prints the difference between 1000 and the remainder of the division by 1000. If it is divisible by 1000, it prints 0.<｜end▁of▁sentence｜>
