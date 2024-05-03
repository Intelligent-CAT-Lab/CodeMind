Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double result = n * Math.sqrt(2);
        if (result < n / 1 + 1) {
            result = n / 1 + 1;
        }
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads a double value from the user, calculates the square root of the number multiplied by 2, and then checks if the result is less than the number divided by 1 plus 1. If it is, it assigns the result to the variable `result`, otherwise it assigns the number divided by 1 plus 1 to `result`. Finally, it prints out the value of `result`.
