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
        double c = (a + b) / 2.0;
        int d = (int) c;
        if (c - d > 0) {
            System.out.println(d + 1);
        } else {
            System.out.println(d);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates their average, rounds it to the nearest integer, and then prints the result. The `/ 2.0` is used to ensure that the division is done as a floating-point division, not integer division. The `(int) c` is used to convert the result to an integer.
