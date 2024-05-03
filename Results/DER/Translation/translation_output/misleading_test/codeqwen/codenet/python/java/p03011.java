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
        System.out.println(a + b + c - Arrays.stream(new int[]{a, b, c}).max().getAsInt());
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, adds them together, and then subtracts the maximum of the three integers from the sum. The `Arrays.stream(new int[]{a, b, c}).max().getAsInt()` part of the code does the same thing as the `max(a,b,c)` part of the Python code. It creates a stream of the three integers, finds the maximum value, and then returns it as an integer.
