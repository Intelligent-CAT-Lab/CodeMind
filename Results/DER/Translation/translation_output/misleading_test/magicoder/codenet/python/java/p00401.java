<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
54

Expected output:
33

```
N = int(input())
count = 1
while count <= N:
    count *= 2
print(round(count/2))

```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println((int) Math.round(count / 2.0));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, initializes a counter to 1, and then multiplies the counter by 2 until it is greater than or equal to the input number. Finally, it prints the result of the division of the counter by 2, rounded to the nearest integer.<｜end▁of▁sentence｜>
