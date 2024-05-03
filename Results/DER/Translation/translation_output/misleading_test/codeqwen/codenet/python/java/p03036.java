Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, then it uses a for loop to calculate and print the next 10 values of x. The formula for calculating the next value of x is `r * x - d`.
