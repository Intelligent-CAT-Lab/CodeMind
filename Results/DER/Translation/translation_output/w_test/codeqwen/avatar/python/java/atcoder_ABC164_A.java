Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int W = scanner.nextInt();
        if (S <= W) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, compares them, and prints "unsafe" if the first integer is less than or equal to the second, and "safe" otherwise.
