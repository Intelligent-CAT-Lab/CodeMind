Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(n * n * n);
        }
    }
}
```

This Java code reads an integer from the standard input, calculates the cube of the integer, and then prints the result. The `Scanner` class is used to read the input from the standard input, and the `hasNextInt()` method checks if there is another integer to read, and the `nextInt()` method reads the next integer. The `System.out.println()` method is used to print the result.
