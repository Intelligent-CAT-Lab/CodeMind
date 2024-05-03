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

        if ((K & 1) == 0) { // ææ°
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, and then checks if the last bit of the integer K is 0 or 1. If it's 0, it subtracts B from A and prints the result. If it's 1, it subtracts A from B and prints the result.
