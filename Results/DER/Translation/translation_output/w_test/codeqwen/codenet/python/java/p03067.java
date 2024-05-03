Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < c && c < b || a > c && c > b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, and then checks if the first number is less than the third and the third is less than the second, or if the first number is greater than the third and the third is greater than the second. If either of these conditions is true, it prints "Yes". Otherwise, it prints "No".
