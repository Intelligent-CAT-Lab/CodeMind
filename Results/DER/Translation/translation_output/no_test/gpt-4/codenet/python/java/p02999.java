Here is the equivalent Java code for the Python snippet you've provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a < b ? 0 : 10);

        scanner.close();
    }
}
```

This Java code mimics the behavior of your Python code by reading two integers from the input, comparing them, and then printing `0` if `a` is less than `b` or `10` otherwise.
