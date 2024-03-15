Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading two integer values from the user
        int vamshi = scanner.nextInt();
        int z = scanner.nextInt();

        // Calculating and printing the result
        System.out.println((vamshi / z + 1) * z);
        
        scanner.close();
    }
}
```
This Java code does the same operation as your Python code: it reads two integers from the standard input, performs a calculation and prints out the result. Note that in Java, integer division (`/`) automatically truncates decimal points, analogous to the floor division (`//`) in Python.
