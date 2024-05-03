Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int k = 0;
        int t = 0;

        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))) {
            double a = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) a);
        } else {
            x = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) x + 1);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, calculates the result, and prints it. The only difference is that Java uses `System.in` to read from the console, and `Scanner` is used to parse the input. The rest of the code is the same.
