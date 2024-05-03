Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int r1 = Integer.parseInt(input[0]);
        int r2 = Integer.parseInt(input[1]);
        System.out.println(1.0 / ((r2 + r1) / (r1 * r2)));
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the result, and prints it out. The `Scanner` class is used to read the input from the user, and the `split` method is used to split the input string into an array of strings. The `Integer.parseInt` method is used to convert the strings in the array to integers. The `System.out.println` method is used to print the result to the console. The `1.0` is used to ensure that the division is done as floating-point division, not integer division.
