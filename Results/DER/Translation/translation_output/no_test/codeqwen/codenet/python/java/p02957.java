Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        double x = (Math.pow(A, 2) - Math.pow(B, 2)) / (2 * (A - B));
        if (x % 1 == 0) {
            System.out.println((int) x);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the value of x, and then prints either the integer value of x or the string "IMPOSSIBLE" depending on whether x is an integer.
