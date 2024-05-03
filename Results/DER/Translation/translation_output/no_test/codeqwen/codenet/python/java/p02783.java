Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int H = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        System.out.println((int) Math.ceil((double) H / A));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, divides the first by the second, and then rounds up the result to the nearest whole number. The `Math.ceil` function in Java works similarly to the `math.ceil` function in Python. It takes a double as an argument and returns the smallest double that is greater than or equal to the argument. We cast the result to an int before printing it, because Java doesn't have a built-in function to print integers.
