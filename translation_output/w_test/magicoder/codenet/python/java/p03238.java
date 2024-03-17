<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
Hello World


```
n = int(input())
if n==1:
    print('Hello World')
    exit()
a = int(input())
b = int(input())
print(a+b)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("Hello World");
            System.exit(0);
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, checks if it's 1, and if so, prints "Hello World" and exits. If the integer is not 1, it reads two more integers and prints their sum.<｜end▁of▁sentence｜>
