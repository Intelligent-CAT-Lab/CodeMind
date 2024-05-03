Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, calculates the absolute difference between `x` and `a` and `x` and `b`, and then prints "A" if the difference between `x` and `a` is less than the difference between `x` and `b`, and "B" otherwise.
