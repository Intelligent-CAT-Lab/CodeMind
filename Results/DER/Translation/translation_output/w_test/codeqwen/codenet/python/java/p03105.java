Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a * c < b) {
            System.out.println(c);
        } else {
            System.out.println(b / a);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, and then checks if the product of the first and third integers is less than the second integer. If it is, it prints the third integer. Otherwise, it prints the second integer divided by the first integer.
