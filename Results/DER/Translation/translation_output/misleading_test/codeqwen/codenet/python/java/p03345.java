Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        if ((K & 1) == 0) { // 偶数
            System.out.println(A - B);
        } else { // 奇数
            System.out.println(B - A);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the standard input, and then checks if the last integer is even or odd. If it's even, it subtracts the second integer from the first and prints the result. If it's odd, it does the opposite.
