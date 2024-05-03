Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println((int) Math.ceil(k / 2.0) * (k / 2));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, calculates the ceiling of the integer divided by 2, multiplies it by the integer divided by 2, and then prints the result. The `(int)` cast is used to ensure that the result is an integer, even if the division of `k` by 2.0 results in a double.
