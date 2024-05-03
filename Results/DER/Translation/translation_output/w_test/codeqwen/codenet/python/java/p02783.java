Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        System.out.println((int) Math.ceil((double) H / A));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, divides the first by the second, and then uses the `Math.ceil` function to round up to the nearest whole number. The result is then printed to the console.
