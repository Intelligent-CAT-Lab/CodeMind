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

        if (a <= 100 && b <= 100) {
            double result = a * b / 3.305785;
            System.out.printf("%.4f", result);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, checks if they are less than or equal to 100, and if so, calculates the product of the two numbers divided by 3.305785, then prints the result rounded to 4 decimal places.
