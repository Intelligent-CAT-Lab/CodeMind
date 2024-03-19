<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 7 9

Expected output:
wi

```
a,b,c = map(int, input().split())
print('win' if a+b+c<22 else 'bust')
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        if (a + b + c < 22) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }
}
```

This Java code reads the input from the user, splits it into three integers, and then checks if the sum of these integers is less than 22. If it is, it prints "win", otherwise it prints "bust".<｜end▁of▁sentence｜>
