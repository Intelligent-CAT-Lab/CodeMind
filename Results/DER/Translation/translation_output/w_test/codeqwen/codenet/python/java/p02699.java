Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int w = scanner.nextInt();

        if (w >= s) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, compares them, and prints "unsafe" if the second integer is greater than or equal to the first, and "safe" otherwise.
