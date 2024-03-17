<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1024

Expected output:
2020


```
total = int(input())
num_500 = total // 500

remain = total - num_500 * 500
num_5 = remain // 5

print(num_500 * 1000 + num_5 * 5)

```

@@ Response
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

This Java code does the same thing as the Python code. It reads an integer from the user, calculates the number of 500 and 5 yen bills that can be used to make up the total amount, and then prints the total amount of money that can be made with 1000 yen bills and 5 yen coins.<｜end▁of▁sentence｜>
