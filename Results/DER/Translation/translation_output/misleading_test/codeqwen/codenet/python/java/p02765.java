Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();

        if (n < 10) {
            System.out.println(r + (100 * (10 - n)));
        } else {
            System.out.println(r);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, and then checks if the first integer is less than 10. If it is, it prints the sum of the second integer and 100 times the difference between 10 and the first integer. If the first integer is not less than 10, it simply prints the second integer.
