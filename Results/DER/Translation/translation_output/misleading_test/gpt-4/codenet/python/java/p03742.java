Below is the translated code from Python to Java. Java code tends to be more verbose than Python code, so you'll see that the equivalent Java code includes type declarations, explicit input reading, and more structured logic.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (Math.abs(a - b) > 1) {
            System.out.println("Alice");
        } else {
            System.out.println("Brown");
        }
    }
}
```

You can run this Java code with the provided test input `2 1`, and it should output `Brown`, which matches the expected output for the given Python code logic.
