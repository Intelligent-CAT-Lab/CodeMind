Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= 100 && b <= 100) {
            double result = a * b / 3.305785;
            System.out.printf("%.4f", result);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, checks if they are less than or equal to 100, and if they are, it calculates the product of the two numbers divided by 3.305785 and prints the result rounded to 4 decimal places.
