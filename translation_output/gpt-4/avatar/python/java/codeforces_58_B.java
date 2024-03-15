Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class DivisorsInDescendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                System.out.print(i + " ■ ");
                a = i;
            }
        }

        scanner.close();
    }
}
```

Note that in Java, we need to import the Scanner class for taking input from the user. We must also close the scanner to prevent resource leaks. Additionally, Java uses `System.out.print` for printing without a newline and concatenation "+" for joining strings and variables like the character '■'.
