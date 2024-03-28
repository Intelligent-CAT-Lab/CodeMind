Here's the equivalent Java code. Note that in Java, we need to import the Scanner class for taking input from the user, and we need to include the main method as the entry point for the program.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int m = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close(); // Closing the scanner as good practice
        
        System.out.println(p + m + c - 2*(p + m + c));
    }
}
```

Test input:
10 10 20

The Java program does not make any assumptions about the number of inputs or their format other than expecting them to be integers. When you run the program, you'll input the numbers in the same way (e.g., "10 10 20"). The expected output will be -57 as per the Python code logic provided. Note that the actual mathematical operation happening here is `(p+m+c)` subtracted from twice its own value `2*(p+m+c)`, which simplifies to `-1 * (p+m+c)`.
