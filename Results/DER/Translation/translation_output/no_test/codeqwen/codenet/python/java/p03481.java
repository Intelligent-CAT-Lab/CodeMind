Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int Y = Integer.parseInt(input[1]);

        int k = (int) (Math.log(Y / (double) X) / Math.log(2));
        System.out.println(k);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the number of bits needed to represent the quotient of the second number divided by the first number, and prints the result.
