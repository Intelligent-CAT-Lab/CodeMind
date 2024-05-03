Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int sum = a + b;
        if (sum >= 10) {
            System.out.println("error");
        } else {
            System.out.println(sum);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, adds them together, and then checks if the sum is greater than or equal to 10. If it is, it prints "error". If it isn't, it prints the sum.
