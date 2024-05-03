Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 0;

        while (n / (int) Math.pow(k, i) != 0) {
            i += 1;
        }

        System.out.println(i);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the number of times the second integer can divide the first one, and prints the result.
