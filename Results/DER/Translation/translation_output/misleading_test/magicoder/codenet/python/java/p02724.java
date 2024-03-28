<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1024

Expected output:
2036

```
total = int(input())
num_500 = total // 500

remain = total - num_500 * 500
num_5 = remain // 5

print(num_500 * 1000 + num_5 * 5)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int num_500 = total / 500;

        int remain = total - num_500 * 500;
        int num_5 = remain / 5;

        System.out.println(num_500 * 1000 + num_5 * 5);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the number of 500-yen bills and the number of 5-yen coins, and then prints the total amount of money.<｜end▁of▁sentence｜>
