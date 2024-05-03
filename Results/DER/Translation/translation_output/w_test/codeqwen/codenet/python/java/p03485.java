Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
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

This Java code does the same thing as your Python code. It reads two integers from the user, calculates their average, rounds it to the nearest integer, and then prints the result. The `/ 2.0` is used to ensure that the division is done as floating point division, not integer division. The `(int) c` is used to convert the result to an integer. The `if (c - d > 0)` checks if the decimal part of the average is greater than 0, and if so, it prints the next integer. If not, it prints the integer part.
