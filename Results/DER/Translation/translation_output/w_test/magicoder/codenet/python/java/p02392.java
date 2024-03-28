<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 8

Expected output:
Yes


```
a,b,c = map(int,input().split())
if a<b<c:
    print("Yes")
else:
    print("No")


```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, checks if the first integer is less than the second integer and the second integer is less than the third integer, and then prints "Yes" if the condition is true and "No" otherwise.<｜end▁of▁sentence｜>
