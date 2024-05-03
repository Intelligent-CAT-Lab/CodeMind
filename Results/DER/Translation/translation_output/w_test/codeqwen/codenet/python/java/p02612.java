Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1000 - n % 1000;
        if (n % 1000 != 0) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, calculates the remainder of the division of the number by 1000, and then subtracts this remainder from 1000. If the remainder is not zero, it prints the result. Otherwise, it prints 0.
