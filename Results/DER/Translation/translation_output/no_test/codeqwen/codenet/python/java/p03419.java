Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        if (n == 1 || m == 1) {
            System.out.println(n * m == 1 ? 1 : Math.max(n, m) - 2);
        } else {
            System.out.println((n - 2) * (m - 2));
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, checks if either of them is 1, and if so, prints the maximum of the two minus 2. If neither of them is 1, it prints the product of the two numbers minus 4.
