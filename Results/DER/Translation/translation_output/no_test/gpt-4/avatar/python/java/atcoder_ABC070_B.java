Here is the translation of the provided Python code to Java:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input and splitting it into four integers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // Calculating the result using built-in Math methods
        int result = Math.max(0, Math.min(b, d) - Math.max(a, c));
        
        // Printing the result
        System.out.println(result);
        
        // Closing the scanner resource
        scanner.close();
    }
}
```
This Java code performs the same operation as the provided Python code: reads four integers from standard input, calculates the max of zero and the difference between the min of `b` and `d` and the max of `a` and `c`, and prints it out.
