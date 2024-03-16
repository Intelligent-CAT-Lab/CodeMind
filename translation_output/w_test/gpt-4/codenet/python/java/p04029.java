Certainly! Here's the equivalent code in Java:

```java
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = (n + 1) * n / 2;
        System.out.println(sum);
        scanner.close();
    }
}
```

To run a test case with this Java code, you would compile and execute the `SumOfNumbers` class, then input `3` when prompted, and the program would output `6`.
