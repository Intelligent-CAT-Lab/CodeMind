Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        if (c - a - b < 0) {
            System.out.println("No");
        } else {
            System.out.println(4 * a * b < (c - a - b) * (c - a - b) ? "Yes" : "No");
        }
        
        scanner.close();
    }
}
```
This Java program reads three long integers from standard input (since we don't know how large the input numbers will be, it's safer to use `long` instead of `int` to prevent overflow issues), checks the same condition as in the Python code, and prints the result to the standard output.

To validate with the provided test case:

Test input:
2 3 9

Expected output:
No

Assuming this Java code is executed, it would read the input "2 3 9" from standard input, process the input according to the given condition, and print "No" to standard output.
