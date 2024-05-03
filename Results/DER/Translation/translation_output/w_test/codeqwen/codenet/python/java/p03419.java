Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n == 1 || m == 1) {
            System.out.println(1);
        } else {
            System.out.println((n - 2) * (m - 2));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, checks if either of them is 1, and if so, prints 1. If neither of them is 1, it calculates the product of the two numbers, subtracts 2 from each, and then multiplies the results together to get the final answer.
