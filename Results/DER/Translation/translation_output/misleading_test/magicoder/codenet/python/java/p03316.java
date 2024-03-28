<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12

Expected output:
6-s

```
n = input()

sn = 0

for i in range(len(n)):
    sn += int(n[i])


if (int(n) % sn == 0):
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
        int n = scanner.nextInt();
        scanner.close();

        int sn = 0;
        while (n != 0) {
            sn += n % 10;
            n /= 10;
        }

        if (n % sn == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, calculates the sum of its digits, and then checks if the original number is divisible by the sum of its digits. If it is, it prints "Yes"; otherwise, it prints "No".<｜end▁of▁sentence｜>
