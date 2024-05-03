Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = a + b + c - Arrays.stream(new int[]{a, b, c}).max().getAsInt();
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, calculates the sum of the three integers, and then subtracts the maximum of the three integers from the sum. The result is then printed to the console.
