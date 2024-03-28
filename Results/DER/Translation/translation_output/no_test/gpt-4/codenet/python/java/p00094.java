Here is the Python code translated into Java, ensuring it prints out the result in Java while handling the equivalent input and calculation:

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

        scanner.close();
    }
}
```

This Java code performs the same operation as the provided Python code and outputs the result formatted to four decimal places. Remember that for this to work, the user inputs must be on the same line separated by a space, as the `nextInt` method expects.
