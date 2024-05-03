Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int num_500 = total / 500;

        int remain = total - num_500 * 500;
        int num_5 = remain / 5;

        System.out.println(num_500 * 1000 + num_5 * 5);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, calculates the number of 500s and 5s needed to represent the total, and then prints the sum of the number of 1000s and 5s.
