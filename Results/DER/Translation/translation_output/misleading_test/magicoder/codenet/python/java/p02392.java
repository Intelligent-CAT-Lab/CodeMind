<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 8

Expected output:
Yesh

```
a,b,c = map(int,input().split())
if a<b<c:
    print("Yes")
else:
    print("No")


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (a < b && b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code reads three integers from the standard input (console), checks if the first number is less than the second number and the second number is less than the third number, and then prints "Yes" if the condition is true, otherwise it prints "No".<｜end▁of▁sentence｜>
