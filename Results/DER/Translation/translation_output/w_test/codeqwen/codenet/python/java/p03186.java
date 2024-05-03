Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (c <= a + b + 1) {
            System.out.println(b + c);
        } else {
            System.out.println(a + 2 * b + 1);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, and then checks if the third integer is less than or equal to the sum of the first two integers plus one. If it is, it prints the sum of the second and third integers. Otherwise, it prints the sum of the first integer, twice the second integer, plus one.
