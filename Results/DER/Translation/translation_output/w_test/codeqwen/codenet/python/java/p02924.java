Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n-1)*n/2);
    }
}
```

This Java code does the same thing as the Python code: it reads an integer from the user, calculates the sum of all integers from 1 to the input number (exclusive), and prints the result. The `//` operator in Java is the integer division operator, which rounds down to the nearest whole number.
