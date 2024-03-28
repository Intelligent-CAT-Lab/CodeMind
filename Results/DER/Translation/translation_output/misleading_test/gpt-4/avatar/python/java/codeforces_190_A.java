Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        if (n < 1) {
            if (m < 1) {
                System.out.println(n + " " + m);
                System.exit(0);
            }
            System.out.println("Impossible");
            System.exit(0);
        }

        int min, max;
        if (m > n) {
            min = m;
            max = n + m - 1;
        } else {
            min = n;
            max = n + m - 1;
            if (m == 0) {
                max = n;
            }
        }
        System.out.println(min + " " + max);
    }
}
```

To compile and run this Java program, you should have a Java development environment set up with the JDK installed on your system.

The above program uses `Scanner` to take input from the user. Note that Java uses static typing, so you have to declare the type of the variables when you define them (`int` in this case). The `System.exit(0)` method is used to stop the program early, analogous to `quit()` in Python.

The program behaves as described: it takes two integers as input and calculates the minimum and maximum based on the given conditions. It then prints the two resulting values.
