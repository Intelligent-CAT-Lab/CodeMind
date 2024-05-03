Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);

        if (n < 10) {
            System.out.println(r + (100 * (10 - n)));
        } else {
            System.out.println(r);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then checks if the first integer is less than 10. If it is, it adds 100 times the difference between 10 and the first integer to the second integer and prints the result. If the first integer is not less than 10, it simply prints the second integer.
