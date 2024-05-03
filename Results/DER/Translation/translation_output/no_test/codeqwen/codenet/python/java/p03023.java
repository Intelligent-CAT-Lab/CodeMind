Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 180 * (n - 2);
        System.out.println(s);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, calculates the sum of the angles of a polygon with `n` sides (180 degrees times `n - 2`), and then prints the result.
